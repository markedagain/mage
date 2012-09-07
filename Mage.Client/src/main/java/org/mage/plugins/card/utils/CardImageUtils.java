package org.mage.plugins.card.utils;

import de.schlichtherle.truezip.file.TFile;
import java.util.HashMap;
import org.mage.plugins.card.constants.Constants;
import org.mage.plugins.card.images.CardInfo;
import org.mage.plugins.card.properties.SettingsManager;

public class CardImageUtils {

    private static HashMap<CardInfo, String> pathCache = new HashMap<CardInfo, String>();

    /**
     * Get path to image for specific card.
     * 
     * @param card
     *            card to get path for
     * @return String if image exists, else null
     */
    public static String getImagePath(CardInfo card) {
        String filePath;
        String suffix = ".jpg";

        TFile file;
        if (card.isToken()) {
            if (pathCache.containsKey(card)) {
                return pathCache.get(card);
            }
            filePath = getTokenImagePath(card);
            file = new TFile(filePath);

            if (!file.exists()) {
                filePath = searchForCardImage(card);
                file = new TFile(filePath);
            }

            if (file.exists()) {
                pathCache.put(card, filePath);
            }
        } else {
            filePath = getImagePath(card, false);
            file = new TFile(filePath);

            if (!file.exists()) {
                filePath = getImagePath(card, true);
                file = new TFile(filePath);
            }
        }

        /**
         * try current directory
         */
        if (file == null || !file.exists()) {
            filePath = cleanString(card.getName()) + suffix;
            file = new TFile(filePath);
        }

        if (file.exists()) {
            return filePath;
        } else {
            return null;
        }
    }

    private static String getTokenImagePath(CardInfo card) {
        String filename = getImagePath(card, false);

        TFile file = new TFile(filename);
        if (!file.exists()) {
            CardInfo updated = new CardInfo(card);
            updated.setName(card.getName() + " 1");
            filename = getImagePath(updated, false);
            file = new TFile(filename);
            if (!file.exists()) {
                updated = new CardInfo(card);
                updated.setName(card.getName() + " 2");
                filename = getImagePath(updated, false);
            }
        }

        return filename;
    }

    private static String searchForCardImage(CardInfo card) {
        TFile file;
        String path;
        CardInfo c = new CardInfo(card);

        for (String set : SettingsManager.getIntance().getTokenLookupOrder()) {
            c.setSet(set);
            path = getTokenImagePath(c);
            file = new TFile(path);
            if (file.exists()) {
                pathCache.put(card, path);
                return path;
            }
        }
        return "";
    }

    public static String cleanString(String in) {
        in = in.trim();
        StringBuilder out = new StringBuilder();
        char c;
        for (int i = 0; i < in.length(); i++) {
            c = in.charAt(i);
            if (c == ' ' || c == '-') {
                out.append('_');
            } else if (Character.isLetterOrDigit(c)) {
                out.append(c);
            }
        }

        return out.toString().toLowerCase();
    }

    public static String updateSet(String cardSet, boolean forUrl) {
        String set = cardSet.toLowerCase();
        if (set.equals("con")) {
            set = "cfx";
        }
        if (forUrl) {
            set = SettingsManager.getIntance().getSetNameReplacement(set);
        }
        return set;
    }

    public static String getImageDir(CardInfo card, String imagesPath) {
        if (card.getSet() == null) {
            return "";
        }
        String set = updateSet(card.getSet(), false).toUpperCase();
        String imagesDir = (imagesPath != null ? imagesPath :  Constants.IO.imageBaseDir);
        if (card.isToken()) {
            return imagesDir + TFile.separator + "TOK" + ".zip" + TFile.separator + set;
        } else {
            return imagesDir + TFile.separator + set + ".zip" + TFile.separator + set;
        }
    }

    public static String getImagePath(CardInfo card, boolean withCollector) {
        return getImagePath(card, withCollector, null);
    }

    public static String getImagePath(CardInfo card, boolean withCollector, String imagesPath) {
        String type = card.getType() != 0 ? " " + Integer.toString(card.getType()) : "";
        String name = card.getName();
        if (withCollector) {
            return getImageDir(card, imagesPath) + TFile.separator + name + "." + card.getCollectorId() + ".full.jpg";
        } else {
            return getImageDir(card, imagesPath) + TFile.separator + name + type + ".full.jpg";
        }
    }
}
