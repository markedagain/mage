package mage.sets;

import mage.cards.CardGraphicInfo;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author North
 */
public class LimitedEditionAlpha extends ExpansionSet {

    private static final LimitedEditionAlpha fINSTANCE = new LimitedEditionAlpha();

    public static LimitedEditionAlpha getInstance() {
        return fINSTANCE;
    }

    private LimitedEditionAlpha() {
        super("Limited Edition Alpha", "LEA", ExpansionSet.buildDate(1993, 8, 5), SetType.CORE);
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Air Elemental", 47, Rarity.UNCOMMON, mage.cards.a.AirElemental.class));
        cards.add(new SetCardInfo("Ancestral Recall", 48, Rarity.RARE, mage.cards.a.AncestralRecall.class));
        cards.add(new SetCardInfo("Animate Dead", 1, Rarity.UNCOMMON, mage.cards.a.AnimateDead.class));
        cards.add(new SetCardInfo("Animate Wall", 185, Rarity.RARE, mage.cards.a.AnimateWall.class));
        cards.add(new SetCardInfo("Ankh of Mishra", 230, Rarity.RARE, mage.cards.a.AnkhOfMishra.class));
        cards.add(new SetCardInfo("Armageddon", 186, Rarity.RARE, mage.cards.a.Armageddon.class));
        cards.add(new SetCardInfo("Aspect of Wolf", 93, Rarity.RARE, mage.cards.a.AspectOfWolf.class));
        cards.add(new SetCardInfo("Badlands", 277, Rarity.RARE, mage.cards.b.Badlands.class));
        cards.add(new SetCardInfo("Bad Moon", 2, Rarity.RARE, mage.cards.b.BadMoon.class));
        cards.add(new SetCardInfo("Balance", 187, Rarity.RARE, mage.cards.b.Balance.class));
        cards.add(new SetCardInfo("Basalt Monolith", 231, Rarity.UNCOMMON, mage.cards.b.BasaltMonolith.class));
        cards.add(new SetCardInfo("Bayou", 278, Rarity.RARE, mage.cards.b.Bayou.class));
        cards.add(new SetCardInfo("Berserk", 94, Rarity.UNCOMMON, mage.cards.b.Berserk.class));
        cards.add(new SetCardInfo("Birds of Paradise", 95, Rarity.RARE, mage.cards.b.BirdsOfParadise.class));
        cards.add(new SetCardInfo("Black Knight", 3, Rarity.UNCOMMON, mage.cards.b.BlackKnight.class));
        cards.add(new SetCardInfo("Black Lotus", 232, Rarity.RARE, mage.cards.b.BlackLotus.class));
        cards.add(new SetCardInfo("Black Vise", 233, Rarity.UNCOMMON, mage.cards.b.BlackVise.class));
        cards.add(new SetCardInfo("Black Ward", 189, Rarity.UNCOMMON, mage.cards.b.BlackWard.class));
        cards.add(new SetCardInfo("Blessing", 191, Rarity.RARE, mage.cards.b.Blessing.class));
        cards.add(new SetCardInfo("Blue Elemental Blast", 50, Rarity.COMMON, mage.cards.b.BlueElementalBlast.class));
        cards.add(new SetCardInfo("Blue Ward", 192, Rarity.UNCOMMON, mage.cards.b.BlueWard.class));
        cards.add(new SetCardInfo("Bog Wraith", 4, Rarity.UNCOMMON, mage.cards.b.BogWraith.class));
        cards.add(new SetCardInfo("Braingeyser", 51, Rarity.RARE, mage.cards.b.Braingeyser.class));
        cards.add(new SetCardInfo("Burrowing", 139, Rarity.UNCOMMON, mage.cards.b.Burrowing.class));
        cards.add(new SetCardInfo("Castle", 193, Rarity.UNCOMMON, mage.cards.c.Castle.class));
        cards.add(new SetCardInfo("Celestial Prism", 234, Rarity.UNCOMMON, mage.cards.c.CelestialPrism.class));
        cards.add(new SetCardInfo("Channel", 97, Rarity.UNCOMMON, mage.cards.c.Channel.class));
        cards.add(new SetCardInfo("Chaoslace", 140, Rarity.RARE, mage.cards.c.Chaoslace.class));
        cards.add(new SetCardInfo("Circle of Protection: Blue", 194, Rarity.COMMON, mage.cards.c.CircleOfProtectionBlue.class));
        cards.add(new SetCardInfo("Circle of Protection: Green", 195, Rarity.COMMON, mage.cards.c.CircleOfProtectionGreen.class));
        cards.add(new SetCardInfo("Circle of Protection: Red", 196, Rarity.COMMON, mage.cards.c.CircleOfProtectionRed.class));
        cards.add(new SetCardInfo("Circle of Protection: White", 197, Rarity.COMMON, mage.cards.c.CircleOfProtectionWhite.class));
        cards.add(new SetCardInfo("Clockwork Beast", 236, Rarity.RARE, mage.cards.c.ClockworkBeast.class));
        cards.add(new SetCardInfo("Clone", 52, Rarity.UNCOMMON, mage.cards.c.Clone.class));
        cards.add(new SetCardInfo("Cockatrice", 98, Rarity.RARE, mage.cards.c.Cockatrice.class));
        cards.add(new SetCardInfo("Conservator", 237, Rarity.UNCOMMON, mage.cards.c.Conservator.class));
        cards.add(new SetCardInfo("Control Magic", 53, Rarity.UNCOMMON, mage.cards.c.ControlMagic.class));
        cards.add(new SetCardInfo("Conversion", 199, Rarity.UNCOMMON, mage.cards.c.Conversion.class));
        cards.add(new SetCardInfo("Copper Tablet", 238, Rarity.UNCOMMON, mage.cards.c.CopperTablet.class));
        cards.add(new SetCardInfo("Copy Artifact", 54, Rarity.RARE, mage.cards.c.CopyArtifact.class));
        cards.add(new SetCardInfo("Counterspell", 55, Rarity.UNCOMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Craw Wurm", 99, Rarity.COMMON, mage.cards.c.CrawWurm.class));
        cards.add(new SetCardInfo("Crusade", 200, Rarity.RARE, mage.cards.c.Crusade.class));
        cards.add(new SetCardInfo("Crystal Rod", 239, Rarity.UNCOMMON, mage.cards.c.CrystalRod.class));
        cards.add(new SetCardInfo("Cursed Land", 6, Rarity.UNCOMMON, mage.cards.c.CursedLand.class));
        cards.add(new SetCardInfo("Dark Ritual", 7, Rarity.COMMON, mage.cards.d.DarkRitual.class));
        cards.add(new SetCardInfo("Deathgrip", 9, Rarity.UNCOMMON, mage.cards.d.Deathgrip.class));
        cards.add(new SetCardInfo("Deathlace", 10, Rarity.RARE, mage.cards.d.Deathlace.class));
        cards.add(new SetCardInfo("Death Ward", 201, Rarity.COMMON, mage.cards.d.DeathWard.class));
        cards.add(new SetCardInfo("Demonic Hordes", 12, Rarity.RARE, mage.cards.d.DemonicHordes.class));
        cards.add(new SetCardInfo("Demonic Tutor", 13, Rarity.UNCOMMON, mage.cards.d.DemonicTutor.class));
        cards.add(new SetCardInfo("Dingus Egg", 241, Rarity.RARE, mage.cards.d.DingusEgg.class));
        cards.add(new SetCardInfo("Disenchant", 202, Rarity.COMMON, mage.cards.d.Disenchant.class));
        cards.add(new SetCardInfo("Disintegrate", 141, Rarity.COMMON, mage.cards.d.Disintegrate.class));
        cards.add(new SetCardInfo("Disrupting Scepter", 242, Rarity.RARE, mage.cards.d.DisruptingScepter.class));
        cards.add(new SetCardInfo("Dragon Whelp", 142, Rarity.UNCOMMON, mage.cards.d.DragonWhelp.class));
        cards.add(new SetCardInfo("Drain Life", 14, Rarity.COMMON, mage.cards.d.DrainLife.class));
        cards.add(new SetCardInfo("Drudge Skeletons", 15, Rarity.COMMON, mage.cards.d.DrudgeSkeletons.class));
        cards.add(new SetCardInfo("Dwarven Demolition Team", 143, Rarity.UNCOMMON, mage.cards.d.DwarvenDemolitionTeam.class));
        cards.add(new SetCardInfo("Dwarven Warriors", 144, Rarity.COMMON, mage.cards.d.DwarvenWarriors.class));
        cards.add(new SetCardInfo("Earthbind", 146, Rarity.COMMON, mage.cards.e.Earthbind.class));
        cards.add(new SetCardInfo("Earth Elemental", 145, Rarity.UNCOMMON, mage.cards.e.EarthElemental.class));
        cards.add(new SetCardInfo("Earthquake", 147, Rarity.RARE, mage.cards.e.Earthquake.class));
        cards.add(new SetCardInfo("Elvish Archers", 100, Rarity.RARE, mage.cards.e.ElvishArchers.class));
        cards.add(new SetCardInfo("Evil Presence", 16, Rarity.UNCOMMON, mage.cards.e.EvilPresence.class));
        cards.add(new SetCardInfo("Farmstead", 203, Rarity.RARE, mage.cards.f.Farmstead.class));
        cards.add(new SetCardInfo("Fastbond", 101, Rarity.RARE, mage.cards.f.Fastbond.class));
        cards.add(new SetCardInfo("Fear", 17, Rarity.COMMON, mage.cards.f.Fear.class));
        cards.add(new SetCardInfo("Feedback", 58, Rarity.UNCOMMON, mage.cards.f.Feedback.class));
        cards.add(new SetCardInfo("Fireball", 150, Rarity.COMMON, mage.cards.f.Fireball.class));
        cards.add(new SetCardInfo("Firebreathing", 151, Rarity.COMMON, mage.cards.f.Firebreathing.class));
        cards.add(new SetCardInfo("Fire Elemental", 149, Rarity.UNCOMMON, mage.cards.f.FireElemental.class));
        cards.add(new SetCardInfo("Flashfires", 152, Rarity.UNCOMMON, mage.cards.f.Flashfires.class));
        cards.add(new SetCardInfo("Flight", 59, Rarity.COMMON, mage.cards.f.Flight.class));
        cards.add(new SetCardInfo("Fog", 102, Rarity.COMMON, mage.cards.f.Fog.class));
        cards.add(new SetCardInfo("Forcefield", 243, Rarity.RARE, mage.cards.f.Forcefield.class));
        cards.add(new SetCardInfo("Force of Nature", 103, Rarity.RARE, mage.cards.f.ForceOfNature.class));
        cards.add(new SetCardInfo("Forest", 279, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 280, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Fork", 153, Rarity.RARE, mage.cards.f.Fork.class));
        cards.add(new SetCardInfo("Frozen Shade", 18, Rarity.COMMON, mage.cards.f.FrozenShade.class));
        cards.add(new SetCardInfo("Fungusaur", 104, Rarity.RARE, mage.cards.f.Fungusaur.class));
        cards.add(new SetCardInfo("Gauntlet of Might", 244, Rarity.RARE, mage.cards.g.GauntletOfMight.class));
        cards.add(new SetCardInfo("Giant Growth", 106, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Giant Spider", 107, Rarity.COMMON, mage.cards.g.GiantSpider.class));
        cards.add(new SetCardInfo("Glasses of Urza", 245, Rarity.UNCOMMON, mage.cards.g.GlassesOfUrza.class));
        cards.add(new SetCardInfo("Gloom", 19, Rarity.UNCOMMON, mage.cards.g.Gloom.class));
        cards.add(new SetCardInfo("Goblin Balloon Brigade", 154, Rarity.UNCOMMON, mage.cards.g.GoblinBalloonBrigade.class));
        cards.add(new SetCardInfo("Goblin King", 155, Rarity.RARE, mage.cards.g.GoblinKing.class));
        cards.add(new SetCardInfo("Granite Gargoyle", 156, Rarity.RARE, mage.cards.g.GraniteGargoyle.class));
        cards.add(new SetCardInfo("Gray Ogre", 157, Rarity.COMMON, mage.cards.g.GrayOgre.class));
        cards.add(new SetCardInfo("Green Ward", 204, Rarity.UNCOMMON, mage.cards.g.GreenWard.class));
        cards.add(new SetCardInfo("Grizzly Bears", 108, Rarity.COMMON, mage.cards.g.GrizzlyBears.class));
        cards.add(new SetCardInfo("Healing Salve", 206, Rarity.COMMON, mage.cards.h.HealingSalve.class));
        cards.add(new SetCardInfo("Hill Giant", 158, Rarity.COMMON, mage.cards.h.HillGiant.class));
        cards.add(new SetCardInfo("Holy Armor", 207, Rarity.COMMON, mage.cards.h.HolyArmor.class));
        cards.add(new SetCardInfo("Holy Strength", 208, Rarity.COMMON, mage.cards.h.HolyStrength.class));
        cards.add(new SetCardInfo("Howl from Beyond", 20, Rarity.COMMON, mage.cards.h.HowlFromBeyond.class));
        cards.add(new SetCardInfo("Howling Mine", 247, Rarity.RARE, mage.cards.h.HowlingMine.class));
        cards.add(new SetCardInfo("Hurloon Minotaur", 159, Rarity.COMMON, mage.cards.h.HurloonMinotaur.class));
        cards.add(new SetCardInfo("Hurricane", 109, Rarity.UNCOMMON, mage.cards.h.Hurricane.class));
        cards.add(new SetCardInfo("Hypnotic Specter", 21, Rarity.UNCOMMON, mage.cards.h.HypnoticSpecter.class));
        cards.add(new SetCardInfo("Ice Storm", 110, Rarity.UNCOMMON, mage.cards.i.IceStorm.class));
        cards.add(new SetCardInfo("Icy Manipulator", 248, Rarity.UNCOMMON, mage.cards.i.IcyManipulator.class));
        cards.add(new SetCardInfo("Instill Energy", 111, Rarity.UNCOMMON, mage.cards.i.InstillEnergy.class));
        cards.add(new SetCardInfo("Invisibility", 60, Rarity.COMMON, mage.cards.i.Invisibility.class));
        cards.add(new SetCardInfo("Ironclaw Orcs", 160, Rarity.COMMON, mage.cards.i.IronclawOrcs.class));
        cards.add(new SetCardInfo("Ironroot Treefolk", 112, Rarity.COMMON, mage.cards.i.IronrootTreefolk.class));
        cards.add(new SetCardInfo("Iron Star", 250, Rarity.UNCOMMON, mage.cards.i.IronStar.class));
        cards.add(new SetCardInfo("Island", 281, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 282, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island Sanctuary", 209, Rarity.RARE, mage.cards.i.IslandSanctuary.class));
        cards.add(new SetCardInfo("Ivory Cup", 251, Rarity.UNCOMMON, mage.cards.i.IvoryCup.class));
        cards.add(new SetCardInfo("Jade Monolith", 252, Rarity.RARE, mage.cards.j.JadeMonolith.class));
        cards.add(new SetCardInfo("Jayemdae Tome", 254, Rarity.RARE, mage.cards.j.JayemdaeTome.class));
        cards.add(new SetCardInfo("Juggernaut", 255, Rarity.UNCOMMON, mage.cards.j.Juggernaut.class));
        cards.add(new SetCardInfo("Jump", 61, Rarity.COMMON, mage.cards.j.Jump.class));
        cards.add(new SetCardInfo("Karma", 210, Rarity.UNCOMMON, mage.cards.k.Karma.class));
        cards.add(new SetCardInfo("Keldon Warlord", 161, Rarity.UNCOMMON, mage.cards.k.KeldonWarlord.class));
        cards.add(new SetCardInfo("Kormus Bell", 256, Rarity.RARE, mage.cards.k.KormusBell.class));
        cards.add(new SetCardInfo("Lance", 211, Rarity.UNCOMMON, mage.cards.l.Lance.class));
        cards.add(new SetCardInfo("Ley Druid", 114, Rarity.UNCOMMON, mage.cards.l.LeyDruid.class));
        cards.add(new SetCardInfo("Library of Leng", 257, Rarity.UNCOMMON, mage.cards.l.LibraryOfLeng.class));
        cards.add(new SetCardInfo("Lich", 22, Rarity.RARE, mage.cards.l.Lich.class));
        cards.add(new SetCardInfo("Lifeforce", 115, Rarity.UNCOMMON, mage.cards.l.Lifeforce.class));
        cards.add(new SetCardInfo("Lifelace", 116, Rarity.RARE, mage.cards.l.Lifelace.class));
        cards.add(new SetCardInfo("Lifetap", 62, Rarity.UNCOMMON, mage.cards.l.Lifetap.class));
        cards.add(new SetCardInfo("Lightning Bolt", 162, Rarity.COMMON, mage.cards.l.LightningBolt.class));
        cards.add(new SetCardInfo("Living Artifact", 117, Rarity.RARE, mage.cards.l.LivingArtifact.class));
        cards.add(new SetCardInfo("Living Lands", 118, Rarity.RARE, mage.cards.l.LivingLands.class));
        cards.add(new SetCardInfo("Living Wall", 258, Rarity.UNCOMMON, mage.cards.l.LivingWall.class));
        cards.add(new SetCardInfo("Llanowar Elves", 119, Rarity.COMMON, mage.cards.l.LlanowarElves.class));
        cards.add(new SetCardInfo("Lord of Atlantis", 63, Rarity.RARE, mage.cards.l.LordOfAtlantis.class));
        cards.add(new SetCardInfo("Lord of the Pit", 23, Rarity.RARE, mage.cards.l.LordOfThePit.class));
        cards.add(new SetCardInfo("Lure", 120, Rarity.UNCOMMON, mage.cards.l.Lure.class));
        cards.add(new SetCardInfo("Mahamoti Djinn", 65, Rarity.RARE, mage.cards.m.MahamotiDjinn.class));
        cards.add(new SetCardInfo("Manabarbs", 164, Rarity.RARE, mage.cards.m.Manabarbs.class));
        cards.add(new SetCardInfo("Mana Flare", 163, Rarity.RARE, mage.cards.m.ManaFlare.class));
        cards.add(new SetCardInfo("Mana Short", 66, Rarity.RARE, mage.cards.m.ManaShort.class));
        cards.add(new SetCardInfo("Mana Vault", 259, Rarity.RARE, mage.cards.m.ManaVault.class));
        cards.add(new SetCardInfo("Meekstone", 260, Rarity.RARE, mage.cards.m.Meekstone.class));
        cards.add(new SetCardInfo("Merfolk of the Pearl Trident", 67, Rarity.COMMON, mage.cards.m.MerfolkOfThePearlTrident.class));
        cards.add(new SetCardInfo("Mind Twist", 24, Rarity.RARE, mage.cards.m.MindTwist.class));
        cards.add(new SetCardInfo("Mons's Goblin Raiders", 165, Rarity.COMMON, mage.cards.m.MonssGoblinRaiders.class));
        cards.add(new SetCardInfo("Mountain", 283, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 284, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mox Emerald", 261, Rarity.RARE, mage.cards.m.MoxEmerald.class));
        cards.add(new SetCardInfo("Mox Jet", 262, Rarity.RARE, mage.cards.m.MoxJet.class));
        cards.add(new SetCardInfo("Mox Pearl", 263, Rarity.RARE, mage.cards.m.MoxPearl.class));
        cards.add(new SetCardInfo("Mox Ruby", 264, Rarity.RARE, mage.cards.m.MoxRuby.class));
        cards.add(new SetCardInfo("Mox Sapphire", 265, Rarity.RARE, mage.cards.m.MoxSapphire.class));
        cards.add(new SetCardInfo("Natural Selection", 121, Rarity.RARE, mage.cards.n.NaturalSelection.class));
        cards.add(new SetCardInfo("Nether Shadow", 25, Rarity.RARE, mage.cards.n.NetherShadow.class));
        cards.add(new SetCardInfo("Nevinyrral's Disk", 266, Rarity.RARE, mage.cards.n.NevinyrralsDisk.class));
        cards.add(new SetCardInfo("Nightmare", 27, Rarity.RARE, mage.cards.n.Nightmare.class));
        cards.add(new SetCardInfo("Northern Paladin", 213, Rarity.RARE, mage.cards.n.NorthernPaladin.class));
        cards.add(new SetCardInfo("Obsianus Golem", 267, Rarity.UNCOMMON, mage.cards.o.ObsianusGolem.class));
        cards.add(new SetCardInfo("Orcish Artillery", 166, Rarity.UNCOMMON, mage.cards.o.OrcishArtillery.class));
        cards.add(new SetCardInfo("Orcish Oriflamme", 167, Rarity.UNCOMMON, mage.cards.o.OrcishOriflamme.class));
        cards.add(new SetCardInfo("Paralyze", 28, Rarity.COMMON, mage.cards.p.Paralyze.class));
        cards.add(new SetCardInfo("Pearled Unicorn", 214, Rarity.COMMON, mage.cards.p.PearledUnicorn.class));
        cards.add(new SetCardInfo("Pestilence", 29, Rarity.COMMON, mage.cards.p.Pestilence.class));
        cards.add(new SetCardInfo("Phantasmal Forces", 68, Rarity.UNCOMMON, mage.cards.p.PhantasmalForces.class));
        cards.add(new SetCardInfo("Phantasmal Terrain", 69, Rarity.COMMON, mage.cards.p.PhantasmalTerrain.class));
        cards.add(new SetCardInfo("Phantom Monster", 70, Rarity.UNCOMMON, mage.cards.p.PhantomMonster.class));
        cards.add(new SetCardInfo("Pirate Ship", 71, Rarity.RARE, mage.cards.p.PirateShip.class));
        cards.add(new SetCardInfo("Plague Rats", 30, Rarity.COMMON, mage.cards.p.PlagueRats.class));
        cards.add(new SetCardInfo("Plains", 285, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 286, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plateau", 287, Rarity.RARE, mage.cards.p.Plateau.class));
        cards.add(new SetCardInfo("Power Sink", 73, Rarity.COMMON, mage.cards.p.PowerSink.class));
        cards.add(new SetCardInfo("Prodigal Sorcerer", 74, Rarity.COMMON, mage.cards.p.ProdigalSorcerer.class));
        cards.add(new SetCardInfo("Psionic Blast", 75, Rarity.UNCOMMON, mage.cards.p.PsionicBlast.class));
        cards.add(new SetCardInfo("Psychic Venom", 76, Rarity.COMMON, mage.cards.p.PsychicVenom.class));
        cards.add(new SetCardInfo("Purelace", 216, Rarity.RARE, mage.cards.p.Purelace.class));
        cards.add(new SetCardInfo("Raise Dead", 31, Rarity.COMMON, mage.cards.r.RaiseDead.class));
        cards.add(new SetCardInfo("Red Elemental Blast", 170, Rarity.COMMON, mage.cards.r.RedElementalBlast.class));
        cards.add(new SetCardInfo("Red Ward", 217, Rarity.UNCOMMON, mage.cards.r.RedWard.class));
        cards.add(new SetCardInfo("Regeneration", 122, Rarity.COMMON, mage.cards.r.Regeneration.class));
        cards.add(new SetCardInfo("Regrowth", 123, Rarity.UNCOMMON, mage.cards.r.Regrowth.class));
        cards.add(new SetCardInfo("Resurrection", 218, Rarity.UNCOMMON, mage.cards.r.Resurrection.class));
        cards.add(new SetCardInfo("Reverse Damage", 219, Rarity.RARE, mage.cards.r.ReverseDamage.class));
        cards.add(new SetCardInfo("Righteousness", 220, Rarity.RARE, mage.cards.r.Righteousness.class));
        cards.add(new SetCardInfo("Roc of Kher Ridges", 171, Rarity.RARE, mage.cards.r.RocOfKherRidges.class));
        cards.add(new SetCardInfo("Rock Hydra", 172, Rarity.RARE, mage.cards.r.RockHydra.class));
        cards.add(new SetCardInfo("Rod of Ruin", 268, Rarity.UNCOMMON, mage.cards.r.RodOfRuin.class));
        cards.add(new SetCardInfo("Royal Assassin", 32, Rarity.RARE, mage.cards.r.RoyalAssassin.class));
        cards.add(new SetCardInfo("Sacrifice", 33, Rarity.UNCOMMON, mage.cards.s.Sacrifice.class));
        cards.add(new SetCardInfo("Samite Healer", 221, Rarity.COMMON, mage.cards.s.SamiteHealer.class));
        cards.add(new SetCardInfo("Savannah", 288, Rarity.RARE, mage.cards.s.Savannah.class));
        cards.add(new SetCardInfo("Savannah Lions", 222, Rarity.RARE, mage.cards.s.SavannahLions.class));
        cards.add(new SetCardInfo("Scathe Zombies", 34, Rarity.COMMON, mage.cards.s.ScatheZombies.class));
        cards.add(new SetCardInfo("Scavenging Ghoul", 35, Rarity.UNCOMMON, mage.cards.s.ScavengingGhoul.class));
        cards.add(new SetCardInfo("Scrubland", 289, Rarity.RARE, mage.cards.s.Scrubland.class));
        cards.add(new SetCardInfo("Scryb Sprites", 124, Rarity.COMMON, mage.cards.s.ScrybSprites.class));
        cards.add(new SetCardInfo("Sea Serpent", 77, Rarity.COMMON, mage.cards.s.SeaSerpent.class));
        cards.add(new SetCardInfo("Sedge Troll", 173, Rarity.RARE, mage.cards.s.SedgeTroll.class));
        cards.add(new SetCardInfo("Sengir Vampire", 36, Rarity.UNCOMMON, mage.cards.s.SengirVampire.class));
        cards.add(new SetCardInfo("Serra Angel", 223, Rarity.UNCOMMON, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Shanodin Dryads", 125, Rarity.COMMON, mage.cards.s.ShanodinDryads.class));
        cards.add(new SetCardInfo("Shatter", 174, Rarity.COMMON, mage.cards.s.Shatter.class));
        cards.add(new SetCardInfo("Shivan Dragon", 175, Rarity.RARE, mage.cards.s.ShivanDragon.class));
        cards.add(new SetCardInfo("Sinkhole", 38, Rarity.COMMON, mage.cards.s.Sinkhole.class));
        cards.add(new SetCardInfo("Siren's Call", 78, Rarity.UNCOMMON, mage.cards.s.SirensCall.class));
        cards.add(new SetCardInfo("Smoke", 176, Rarity.RARE, mage.cards.s.Smoke.class));
        cards.add(new SetCardInfo("Sol Ring", 269, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Soul Net", 270, Rarity.UNCOMMON, mage.cards.s.SoulNet.class));
        cards.add(new SetCardInfo("Spell Blast", 80, Rarity.COMMON, mage.cards.s.SpellBlast.class));
        cards.add(new SetCardInfo("Stasis", 81, Rarity.RARE, mage.cards.s.Stasis.class));
        cards.add(new SetCardInfo("Steal Artifact", 82, Rarity.UNCOMMON, mage.cards.s.StealArtifact.class));
        cards.add(new SetCardInfo("Stone Giant", 177, Rarity.UNCOMMON, mage.cards.s.StoneGiant.class));
        cards.add(new SetCardInfo("Stone Rain", 178, Rarity.COMMON, mage.cards.s.StoneRain.class));
        cards.add(new SetCardInfo("Stream of Life", 126, Rarity.COMMON, mage.cards.s.StreamOfLife.class));
        cards.add(new SetCardInfo("Sunglasses of Urza", 271, Rarity.RARE, mage.cards.s.SunglassesOfUrza.class));
        cards.add(new SetCardInfo("Swamp", 290, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 291, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swords to Plowshares", 224, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Taiga", 292, Rarity.RARE, mage.cards.t.Taiga.class));
        cards.add(new SetCardInfo("Terror", 39, Rarity.COMMON, mage.cards.t.Terror.class));
        cards.add(new SetCardInfo("The Hive", 272, Rarity.RARE, mage.cards.t.TheHive.class));
        cards.add(new SetCardInfo("Thicket Basilisk", 127, Rarity.UNCOMMON, mage.cards.t.ThicketBasilisk.class));
        cards.add(new SetCardInfo("Thoughtlace", 83, Rarity.RARE, mage.cards.t.Thoughtlace.class));
        cards.add(new SetCardInfo("Throne of Bone", 273, Rarity.UNCOMMON, mage.cards.t.ThroneOfBone.class));
        cards.add(new SetCardInfo("Timetwister", 85, Rarity.RARE, mage.cards.t.Timetwister.class));
        cards.add(new SetCardInfo("Time Vault", 274, Rarity.RARE, mage.cards.t.TimeVault.class));
        cards.add(new SetCardInfo("Time Walk", 84, Rarity.RARE, mage.cards.t.TimeWalk.class));
        cards.add(new SetCardInfo("Tranquility", 129, Rarity.COMMON, mage.cards.t.Tranquility.class));
        cards.add(new SetCardInfo("Tropical Island", 293, Rarity.RARE, mage.cards.t.TropicalIsland.class));
        cards.add(new SetCardInfo("Tsunami", 130, Rarity.UNCOMMON, mage.cards.t.Tsunami.class));
        cards.add(new SetCardInfo("Tundra", 294, Rarity.RARE, mage.cards.t.Tundra.class));
        cards.add(new SetCardInfo("Tunnel", 179, Rarity.UNCOMMON, mage.cards.t.Tunnel.class));
        cards.add(new SetCardInfo("Twiddle", 86, Rarity.COMMON, mage.cards.t.Twiddle.class));
        cards.add(new SetCardInfo("Two-Headed Giant of Foriys", 180, Rarity.RARE, mage.cards.t.TwoHeadedGiantOfForiys.class));
        cards.add(new SetCardInfo("Underground Sea", 295, Rarity.RARE, mage.cards.u.UndergroundSea.class));
        cards.add(new SetCardInfo("Unholy Strength", 40, Rarity.COMMON, mage.cards.u.UnholyStrength.class));
        cards.add(new SetCardInfo("Unsummon", 87, Rarity.COMMON, mage.cards.u.Unsummon.class));
        cards.add(new SetCardInfo("Uthden Troll", 181, Rarity.UNCOMMON, mage.cards.u.UthdenTroll.class));
        cards.add(new SetCardInfo("Verduran Enchantress", 131, Rarity.RARE, mage.cards.v.VerduranEnchantress.class));
        cards.add(new SetCardInfo("Vesuvan Doppelganger", 88, Rarity.RARE, mage.cards.v.VesuvanDoppelganger.class));
        cards.add(new SetCardInfo("Volcanic Eruption", 89, Rarity.RARE, mage.cards.v.VolcanicEruption.class));
        cards.add(new SetCardInfo("Wall of Air", 90, Rarity.UNCOMMON, mage.cards.w.WallOfAir.class));
        cards.add(new SetCardInfo("Wall of Bone", 41, Rarity.UNCOMMON, mage.cards.w.WallOfBone.class));
        cards.add(new SetCardInfo("Wall of Brambles", 132, Rarity.UNCOMMON, mage.cards.w.WallOfBrambles.class));
        cards.add(new SetCardInfo("Wall of Fire", 182, Rarity.UNCOMMON, mage.cards.w.WallOfFire.class));
        cards.add(new SetCardInfo("Wall of Ice", 133, Rarity.UNCOMMON, mage.cards.w.WallOfIce.class));
        cards.add(new SetCardInfo("Wall of Stone", 183, Rarity.UNCOMMON, mage.cards.w.WallOfStone.class));
        cards.add(new SetCardInfo("Wall of Swords", 226, Rarity.UNCOMMON, mage.cards.w.WallOfSwords.class));
        cards.add(new SetCardInfo("Wall of Water", 91, Rarity.UNCOMMON, mage.cards.w.WallOfWater.class));
        cards.add(new SetCardInfo("Wall of Wood", 134, Rarity.COMMON, mage.cards.w.WallOfWood.class));
        cards.add(new SetCardInfo("Wanderlust", 135, Rarity.UNCOMMON, mage.cards.w.Wanderlust.class));
        cards.add(new SetCardInfo("War Mammoth", 136, Rarity.COMMON, mage.cards.w.WarMammoth.class));
        cards.add(new SetCardInfo("Warp Artifact", 42, Rarity.RARE, mage.cards.w.WarpArtifact.class));
        cards.add(new SetCardInfo("Water Elemental", 92, Rarity.UNCOMMON, mage.cards.w.WaterElemental.class));
        cards.add(new SetCardInfo("Weakness", 43, Rarity.COMMON, mage.cards.w.Weakness.class));
        cards.add(new SetCardInfo("Web", 137, Rarity.RARE, mage.cards.w.Web.class));
        cards.add(new SetCardInfo("Wheel of Fortune", 184, Rarity.RARE, mage.cards.w.WheelOfFortune.class));
        cards.add(new SetCardInfo("White Knight", 227, Rarity.UNCOMMON, mage.cards.w.WhiteKnight.class));
        cards.add(new SetCardInfo("White Ward", 228, Rarity.UNCOMMON, mage.cards.w.WhiteWard.class));
        cards.add(new SetCardInfo("Wild Growth", 138, Rarity.COMMON, mage.cards.w.WildGrowth.class));
        cards.add(new SetCardInfo("Will-o'-the-Wisp", 44, Rarity.RARE, mage.cards.w.WillOTheWisp.class));
        cards.add(new SetCardInfo("Winter Orb", 275, Rarity.RARE, mage.cards.w.WinterOrb.class));
        cards.add(new SetCardInfo("Wooden Sphere", 276, Rarity.UNCOMMON, mage.cards.w.WoodenSphere.class));
        cards.add(new SetCardInfo("Wrath of God", 229, Rarity.RARE, mage.cards.w.WrathOfGod.class));
        cards.add(new SetCardInfo("Zombie Master", 46, Rarity.RARE, mage.cards.z.ZombieMaster.class));
    }
}
