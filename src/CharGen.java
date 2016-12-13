import java.util.Random;
/**
 * Chooses a background for your character according to Requiem's rules. half of the code may or may not actually be vestigial.
 * 
 * @author anoobindisguise
 * 
 */
public class CharGen
{
    // instance variables - replace the example below with your own
    private static int race; //0 is Nord, 1 is Breton, 2 is Redguard, 3 is Imperial, 4 is Altmer, 5 is Dunmer, 6 is Bosmer, 7 is Orsimer, 8 is Khajiit, 9 is Argonian
    private static String raceName;
    private static int standingStone; //0 is warrior, 1 is lord, 2 is steed, 3 is lady, 4 is thief, 5 is shadow, 6 is tower, 7 is lover, 8 is mage, 9 is atronach, 10 is apprentice, 11 is ritual, 12 is serpent
    private static String standingStoneName;
    //private int archetype = 0; //0 is pure mage, 1 is spellsword, 2 is battlemage, 3 is magic knight, 4 is sword and board, 5 is barbarian, 6 is weaponmaster (dualwield), 8 is combat archer, 9 nightblade, 10 is stealth archer
    //private string archetypeName = "Mage";
    private static int preferenceOnehanded; //0 is sword, 1 is longsword, 2 is scimitar, 3 4 5 are waraxe, 6 7 8 are mace, 9 10 11 are unarmed
    private static String preferenceOnehandedName;
    private static int preferenceTwohanded; // 0 1 are greatsword, 2 3 are battleaxe, 4 is warhammer, 5 is battlestaff
    private static String preferenceTwohandedName;
    private static int preferenceArchery; //0 is crossbow, 1 is bow
    private static String preferenceArcheryName;
    private static int preferenceConjuration; //0 is daedra summoning, 1 is necromancy, 2 is ghost evocation
    private static String preferenceConjurationName;
    private static int preferenceDestruction; // 0 is fire, 1 is frost, 2 is shock
    private static String preferenceDestructionName;
    private static int preferenceEvasion; //0 is armor, 1 is robes
    private static String preferenceEvasionName;
    private static int lawful;
    private static String lawfulName;

    private static int destruction; //0
    private static int restoration; //1
    private static int conjuration; //2
    private static int alteration; //3
    private static int illusion; //4
    private static int onehanded; //5 
    private static int twohanded; //6
    private static int archery; //7
    private static int block; //8
    private static int heavyarmor; //9
    private static int evasion; //10
    private static int speechcraft; //11
    private static int alchemy; //12
    private static int smithing; //13
    private static int enchanting; //14
    private static int stealth; //15
    private static int lockpicking; //16
    private static int pickpocket; //17

    private static int perk1;
    private static String perk1Name;
    private static int perk2;
    private static String perk2Name;
    private static int perk3;
    private static String perk3Name;

    //can't have evasion and heavyarmor, onehanded and twohanded, sneak and heavyarmor, pickpocket and heavyarmor

    /**
     * Constructor for objects of class CharGen
     */
    public static void main(String[] args)
    {
        race = 0; //0 is Nord, 1 is Breton, 2 is Redguard, 3 is Imperial, 4 is Altmer, 5 is Dunmer, 6 is Bosmer, 7 is Orsimer, 8 is Khajiit, 9 is Argonian
        raceName = "Nord";
        standingStone = 0;
        standingStoneName = "Warrior";
        //preference was decided to not do anything as it was better left to player choice, however some hidden preferences do influence lawfulness
        preferenceOnehanded = 0;
        preferenceOnehandedName = "";
        preferenceTwohanded = 0; 
        preferenceTwohandedName = "";
        preferenceArchery = 0; 
        preferenceArcheryName = "";
        preferenceConjuration = 0;
        preferenceConjurationName = "";
        preferenceDestruction = 0;
        preferenceDestructionName = "";
        preferenceEvasion = 0; 
        preferenceEvasionName = "";
        lawful = 0;

        destruction = 5; //0
        restoration = 5; //1
        conjuration = 5; //2
        alteration = 5; //3
        illusion = 5; //4
        onehanded = 5; //5 
        twohanded = 5; //6
        archery = 5; //7
        block = 5; //8
        heavyarmor = 5; //9
        evasion = 5; //10
        speechcraft = 5; //11
        alchemy = 5; //12
        smithing = 5; //13
        enchanting = 5; //14
        stealth = 5; //15
        lockpicking = 5; //16
        pickpocket = 5; //17

        chooseRace();
        chooseStandingStone();
        chooseLawful();
        choosePerkSkill1();
        choosePerkSkill2();
        choosePerkSkill3();
        buildCharacter();

    }

    private static void chooseRace() //defines starting skills as well. Storage.Skills however are only used in a couple conditions so they can be largely ignored.
    {
        Random racial = new Random(); 
        race = racial.nextInt(10); 
        if (race == 0)
        {
            raceName = ("Nord ");
            block = 10;
            heavyarmor = 10;
            evasion = 10;
            onehanded = 10;
            smithing = 15;
            twohanded = 15;
        }
        if (race == 1)
        {
            raceName = ("Breton ");
            alchemy = 10;
            alteration = 10;
            conjuration = 20;
            illusion = 10;
            restoration = 10;
            speechcraft = 10;
        }
        if (race == 2)
        {
            raceName = ("Redguard ");
            alteration = 10;
            archery = 10;
            block = 10;
            destruction = 10;
            onehanded = 20;
            smithing = 10;
        }
        if (race == 3)
        {
            raceName = ("Imperial ");
            block = 10;
            destruction = 10;
            heavyarmor = 10;
            onehanded = 10;
            restoration = 15;
            speechcraft = 15;
        }
        if (race == 4)
        {
            raceName = ("Altmer ");
            alteration = 10;
            conjuration = 10;
            destruction = 15;
            enchanting = 10;
            illusion = 15;
            restoration = 10;
        }
        if (race == 5)
        {
            raceName = ("Dunmer ");
            alteration = 10;
            destruction = 15;
            illusion = 10;
            evasion = 10;
            onehanded = 15;
            stealth = 10;
        }
        if (race == 6)
        {
            raceName = ("Bosmer ");
            alchemy = 10;
            archery = 20;
            evasion = 10;
            lockpicking = 10;
            pickpocket = 10;
            stealth = 10;
        }
        if (race == 7)
        {
            raceName = ("Orsimer ");
            block = 10;
            heavyarmor = 15;
            evasion = 10;
            onehanded = 10;
            smithing = 15;
            twohanded = 10;
        } 
        if (race == 8)
        {
            raceName = ("Khajiit ");
            alchemy = 10;
            archery = 10;
            lockpicking = 10;
            onehanded = 10;
            pickpocket = 10;
            stealth = 15;
        }
        if (race == 9)
        {
            raceName = ("Argonian ");
            alteration = 10;
            evasion = 15;
            lockpicking = 15;
            pickpocket = 10;
            restoration = 10;
            stealth = 10;
        } 
    }

    private static void chooseStandingStone() //starting standing stone
    {
        Random stone = new Random(); 
        standingStone = stone.nextInt(13);
        if (standingStone == 0)
        {
            standingStoneName = ("Warrior");
        }
        if (standingStone == 1)
        {
            standingStoneName = ("Lord");
        }
        if (standingStone == 2)
        {
            standingStoneName = ("Steed");
        }
        if (standingStone == 3)
        {
            standingStoneName = ("Lady");
        }
        if (standingStone == 4)
        {
            standingStoneName = ("Thief");
        }
        if (standingStone == 5)
        {
            standingStoneName = ("Shadow");
        }
        if (standingStone == 6)
        {
            standingStoneName = ("Tower");
        }
        if (standingStone == 7)
        {
            standingStoneName = ("Lover");
        }
        if (standingStone == 8)
        {
            standingStoneName = ("Mage");
        }
        if (standingStone == 9)
        {
            standingStoneName = ("Atronach");
        }
        if (standingStone == 10)
        {
            standingStoneName = ("Apprentice");
        }
        if (standingStone == 11)
        {
            standingStoneName = ("Ritual");
        }
        if (standingStone == 12)
        {
            standingStoneName = ("Serpent");
        }

    }

    private static void chooseLawful() //chooseperkskill may change this to unlawful. Lawful is intended to be slightly more common hence the strong weighting.
    {
        Random law = new Random(); 
        lawful = law.nextInt(4);
        if (lawful == 0)
        {
            lawfulName = " an unlawful ";
        }
        else
        {
            lawfulName = " a lawful ";
        }   

    }

    private static void choosePerkSkill1()
    {
        Random perk = new Random(); 
        perk1 = perk.nextInt(18);
        if (perk1 == 0)
        {
            perk1Name = "Destruction";
            Random pref = new Random(); 
            preferenceDestruction = perk.nextInt(7);
            if (preferenceDestruction == 0 || preferenceDestruction == 1)
            {
                preferenceDestructionName = "Fire";
            }
            if (preferenceDestruction == 2 || preferenceDestruction == 3)
            {
                preferenceDestructionName = "Frost";
            }
            if (preferenceDestruction == 4 || preferenceDestruction == 5)
            {
                preferenceDestructionName = "Shock";
            }
            if (preferenceDestruction == 6)
            {
                preferenceDestructionName = "Poison";
                lawfulName = " an unlawful ";
            }
        }
        if (perk1 == 1)
        {
            perk1Name = "Restoration";
        }
        if (perk1 == 2)
        {
            perk1Name = "Conjuration";
            Random pref = new Random(); 
            preferenceConjuration = perk.nextInt(3);
            if (preferenceConjuration == 0)
            {
                preferenceConjurationName = "Necromancy";
                lawfulName = " an unlawful ";
            }
            if (preferenceConjuration == 1)
            {
                preferenceConjurationName = "Ghost Summoning";
            }
            if (preferenceConjuration == 2)
            {
                preferenceConjurationName = "Daedra Summoning";
                lawfulName = " an unlawful ";
            }
        }
        if (perk1 == 3)
        {
            perk1Name = "Alteration";
        }
        if (perk1 == 4)
        {
            perk1Name = "Illusion";
        }
        if (perk1 == 5)
        {
            perk1Name = "One Handed";
            if (onehanded >= 10)
            {
                Random pref = new Random(); 
                preferenceOnehanded = perk.nextInt(11);
                if (preferenceOnehanded == 0 || preferenceOnehanded == 1 || preferenceOnehanded == 2)
                {
                    preferenceOnehandedName = "Swords";
                }
                if (preferenceOnehanded == 3 || preferenceOnehanded == 4 || preferenceOnehanded == 5)
                {
                    preferenceOnehandedName = "Axes";
                }
                if (preferenceOnehanded == 6 || preferenceOnehanded == 7 || preferenceOnehanded == 8)
                {
                    preferenceOnehandedName = "Maces";
                }
                if (preferenceOnehanded == 9 || preferenceOnehanded == 10)
                {
                    preferenceOnehandedName = "Unarmed";
                }
            }
            else
            {
                Random pref = new Random(); 
                preferenceOnehanded = perk.nextInt(9);
                if (preferenceOnehanded == 0 || preferenceOnehanded == 1 || preferenceOnehanded == 2)
                {
                    preferenceOnehandedName = "Swords";
                }
                if (preferenceOnehanded == 3 || preferenceOnehanded == 4 || preferenceOnehanded == 5)
                {
                    preferenceOnehandedName = "Axes";
                }
                if (preferenceOnehanded == 6 || preferenceOnehanded == 7 || preferenceOnehanded == 8)
                {
                    preferenceOnehandedName = "Maces";
                }

            }
        }
        if (perk1 == 6)
        {
            perk1Name = "Two Handed";
            Random pref = new Random(); 
            preferenceOnehanded = perk.nextInt(12);
            if (preferenceTwohanded == 0 || preferenceTwohanded == 1 || preferenceTwohanded == 2)
            {
                preferenceTwohandedName = "Greatswords";
            }
            if (preferenceTwohanded == 3 || preferenceTwohanded == 4 || preferenceTwohanded == 5)
            {
                preferenceTwohandedName = "Battleaxes";
            }
            if (preferenceTwohanded == 6 || preferenceTwohanded == 7 || preferenceTwohanded == 8)
            {
                preferenceTwohandedName = "Warhammers";
            }
            if (preferenceTwohanded == 9 || preferenceTwohanded == 10 || preferenceTwohanded == 11)
            {
                preferenceTwohandedName = "Quarterstaves";
            }
        }
        if (perk1 == 7)
        {
            perk1Name = "Marksmanship";
            Random pref = new Random(); 
            preferenceArchery = perk.nextInt(2);
            if (preferenceArchery == 0)
            {
                preferenceArcheryName = "Crossbows";
            }
            if (preferenceArchery == 1)
            {
                preferenceArcheryName = "Bows";
            }
        }
        if (perk1 == 8)
        {
            perk1Name = "Block";
        }
        if (perk1 == 9)
        {
            perk1Name = "Heavy Armor";
        }
        if (perk1 == 10)
        {
            perk1Name = "Evasion";
            Random pref = new Random(); 
            preferenceEvasion = perk.nextInt(2);
            if (preferenceEvasion == 0)
            {
                preferenceEvasionName = "Crossbows";
            }
            if (preferenceEvasion == 1)
            {
                preferenceEvasionName = "Bows";
            }
        }
        if (perk1 == 11)
        {
            perk1Name = "Speechcraft";
        }
        if (perk1 == 12)
        {
            perk1Name = "Alchemy";
        }
        if (perk1 == 13)
        {
            perk1Name = "Smithing";
        }
        if (perk1 == 14)
        {
            perk1Name = "Enchanting";
        }
        if (perk1 == 15)
        {
            perk1Name = "Stealth";
        }
        if (perk1 == 16)
        {
            perk1Name = "Lockpicking";
        }
        if (perk1 == 17)
        {
            perk1Name = "Pickpocket";
            lawfulName = " an unlawful ";
        }
    }

    private static void choosePerkSkill2() //uses a few conditions to determine whether the perk is valid because of perk 1
    {
        Random perk = new Random(); 
        perk2 = perk.nextInt(18);
        if (perk2 == 0)
        {
            if (perk1 != 0)
            {
                perk2Name = "Destruction";
                Random pref = new Random(); 
                preferenceDestruction = perk.nextInt(7);
                if (preferenceDestruction == 0 || preferenceDestruction == 1)
                {
                    preferenceDestructionName = "Fire";
                }
                if (preferenceDestruction == 2 || preferenceDestruction == 3)
                {
                    preferenceDestructionName = "Frost";
                }
                if (preferenceDestruction == 4 || preferenceDestruction == 5)
                {
                    preferenceDestructionName = "Shock";
                }
                if (preferenceDestruction == 6)
                {
                    preferenceDestructionName = "Poison";
                    lawfulName = " an unlawful ";
                }
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 1)
        {
            if (perk1 != 1)
            {
                perk2Name = "Restoration";
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 2)
        {
            if (perk1 != 2)
            {

                perk2Name = "Conjuration";
                Random pref = new Random(); 
                preferenceConjuration = perk.nextInt(3);
                if (preferenceConjuration == 0)
                {
                    preferenceConjurationName = "Necromancy";
                    lawfulName = " an unlawful ";
                }
                if (preferenceConjuration == 1)
                {
                    preferenceConjurationName = "Ghost Summoning";
                }
                if (preferenceConjuration == 2)
                {
                    preferenceConjurationName = "Daedra Summoning";
                    lawfulName = " an unlawful ";
                }
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 3)
        {
            if (perk1 != 3)
            {
                perk2Name = "Alteration";
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 4)
        {
            if (perk1 == 4 && illusion >= 15)
            {
                perk2Name = "Illusion";
            }
            else if (perk1 != 4)
            {
                perk2Name = "Illusion";
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 5)
        {
            if (perk1 == 5 && perk1 != 6)
            {
                perk2Name = "One Handed";        
            }
            else if (perk1 != 5  && perk1 != 6)
            {
                perk2Name = "One Handed";
                if (onehanded >= 10 && perk1 == 5)
                {
                    Random pref = new Random(); 
                    preferenceOnehanded = perk.nextInt(11);
                    if (preferenceOnehanded == 0 || preferenceOnehanded == 1 || preferenceOnehanded == 2)
                    {
                        preferenceOnehandedName = "Swords";
                    }
                    if (preferenceOnehanded == 3 || preferenceOnehanded == 4 || preferenceOnehanded == 5)
                    {
                        preferenceOnehandedName = "Axes";
                    }
                    if (preferenceOnehanded == 6 || preferenceOnehanded == 7 || preferenceOnehanded == 8)
                    {
                        preferenceOnehandedName = "Maces";
                    }
                    if (preferenceOnehanded == 9 || preferenceOnehanded == 10)
                    {
                        preferenceOnehandedName = "Unarmed";
                    }
                }
                else if (perk1 != 5)
                {
                    Random pref = new Random(); 
                    preferenceOnehanded = perk.nextInt(9);
                    if (preferenceOnehanded == 0 || preferenceOnehanded == 1 || preferenceOnehanded == 2)
                    {
                        preferenceOnehandedName = "Swords";
                    }
                    if (preferenceOnehanded == 3 || preferenceOnehanded == 4 || preferenceOnehanded == 5)
                    {
                        preferenceOnehandedName = "Axes";
                    }
                    if (preferenceOnehanded == 6 || preferenceOnehanded == 7 || preferenceOnehanded == 8)
                    {
                        preferenceOnehandedName = "Maces";
                    }

                }
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 6)
        {
            if (perk1 == 6 && perk1 != 5)
            {
                perk2Name = "Two Handed";
            }
            else if (perk1 != 6 && perk1 != 5)
            {
                perk2Name = "Two Handed";
                Random pref = new Random(); 
                preferenceOnehanded = perk.nextInt(12);
                if (preferenceTwohanded == 0 || preferenceTwohanded == 1 || preferenceTwohanded == 2)
                {
                    preferenceTwohandedName = "Greatswords";
                }
                if (preferenceTwohanded == 3 || preferenceTwohanded == 4 || preferenceTwohanded == 5)
                {
                    preferenceTwohandedName = "Battleaxes";
                }
                if (preferenceTwohanded == 6 || preferenceTwohanded == 7 || preferenceTwohanded == 8)
                {
                    preferenceTwohandedName = "Warhammers";
                }
                if (preferenceTwohanded == 9 || preferenceTwohanded == 10 || preferenceTwohanded == 11)
                {
                    preferenceTwohandedName = "Quarterstaves";
                }
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 7)
        {
            if (perk1 == 7)
            {
                perk2Name = "Marksmanship";
            }
            else if (perk1 != 7)
            {
                perk2Name = "Marksmanship";
                Random pref = new Random(); 
                preferenceArchery = perk.nextInt(2);
                if (preferenceArchery == 0)
                {
                    preferenceArcheryName = "Crossbows";
                }
                if (preferenceArchery == 1)
                {
                    preferenceArcheryName = "Bows";
                }
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 8)
        {
            if (perk1 != 8)
            {
                perk2Name = "Block";
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 9)
        {
            if (perk1 != 9 && perk1 != 10)
            {
                perk2Name = "Heavy Armor";
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 10)
        {
            if (perk1 != 10 && perk1 != 9)
            {
                perk2Name = "Evasion";
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 11)
        {
            if (perk1 != 11)
            {
                perk2Name = "Speechcraft";
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 12)
        {
            perk2Name = "Alchemy";
        }
        if (perk2 == 13)
        {
            if (perk1 != 13)
            {
                perk2Name = "Smithing";
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 14)
        {
            perk2Name = "Enchanting";
        }
        if (perk2 == 15)
        {
            perk2Name = "Stealth";
        }
        if (perk2 == 16)
        {
            if (perk1 != 16)
            {
                perk2Name = "Lockpicking";
            }
            else
            {
                choosePerkSkill2();
            }
        }
        if (perk2 == 17)
        {
            if (perk1 != 9)
            {
                perk2Name = "Pickpocket";
                lawfulName = " an unlawful ";
            }
            else
            {
                choosePerkSkill2();
            }
        }
    }

    private static void choosePerkSkill3() //uses a lot of conditions to determine whether the perk is invalid thanks to perk 1 and perk 2
    {
        Random perk = new Random();
        perk3 = perk.nextInt(18);

        if (perk3 == 0)
        {
            if (perk1 != 0 && perk2 != 0)
            {
                perk3Name = "Destruction";
                Random pref = new Random(); 
                preferenceDestruction = perk.nextInt(7);
                if (preferenceDestruction == 0 || preferenceDestruction == 1)
                {
                    preferenceDestructionName = "Fire";
                }
                if (preferenceDestruction == 2 || preferenceDestruction == 3)
                {
                    preferenceDestructionName = "Frost";
                }
                if (preferenceDestruction == 4 || preferenceDestruction == 5)
                {
                    preferenceDestructionName = "Shock";
                }
                if (preferenceDestruction == 6)
                {
                    preferenceDestructionName = "Poison";
                    lawfulName = " an unlawful ";
                }
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 1)
        {
            if (perk1 != 1 && perk2 != 1)
            {
                perk3Name = "Restoration";
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 2)
        {
            if (perk1 != 2 && perk2 != 2)
            {
                perk3Name = "Conjuration";
                Random pref = new Random(); 
                preferenceConjuration = perk.nextInt(3);
                if (preferenceConjuration == 0)
                {
                    preferenceConjurationName = "Necromancy";
                    lawfulName = " an unlawful ";
                }
                if (preferenceConjuration == 1)
                {
                    preferenceConjurationName = "Ghost Summoning";
                }
                if (preferenceConjuration == 2)
                {
                    preferenceConjurationName = "Daedra Summoning";
                    lawfulName = " an unlawful ";
                }
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 3)
        {
            if (perk1 != 3 && perk2 != 3)
            {
                perk3Name = "Alteration";
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 4)
        {
            if (((perk1 == 4 || perk2 == 4) && illusion >= 15) && !(perk1 == 4 && perk2 ==4))
            {
                perk3Name = "Illusion";
            }
            else if (perk1 != 4 && perk2 != 4)
            {
                perk3Name = "Illusion";
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 5)
        {
            if ((((perk1 == 5 || perk2 == 5) && !(perk1 == 5 && perk2 == 5)) || (perk1 == 5 && perk2 == 5 && onehanded >= 20) || (perk1 != 5 && perk2 != 5)) && (perk1 != 6 && perk2 != 6))
            {
                perk3Name = "One Handed";    
                if (onehanded >= 10 && perk1 == 5 && perk2 == 5)
                {
                    Random pref = new Random(); 
                    preferenceOnehanded = perk.nextInt(11);
                    if (preferenceOnehanded == 0 || preferenceOnehanded == 1 || preferenceOnehanded == 2)
                    {
                        preferenceOnehandedName = "Swords";
                    }
                    if (preferenceOnehanded == 3 || preferenceOnehanded == 4 || preferenceOnehanded == 5)
                    {
                        preferenceOnehandedName = "Axes";
                    }
                    if (preferenceOnehanded == 6 || preferenceOnehanded == 7 || preferenceOnehanded == 8)
                    {
                        preferenceOnehandedName = "Maces";
                    }
                    if (preferenceOnehanded == 9 || preferenceOnehanded == 10)
                    {
                        preferenceOnehandedName = "Unarmed";
                    }
                }
                else if (perk1 != 5 && perk2 != 5)
                {
                    Random pref = new Random(); 
                    preferenceOnehanded = perk.nextInt(9);
                    if (preferenceOnehanded == 0 || preferenceOnehanded == 1 || preferenceOnehanded == 2)
                    {
                        preferenceOnehandedName = "Swords";
                    }
                    if (preferenceOnehanded == 3 || preferenceOnehanded == 4 || preferenceOnehanded == 5)
                    {
                        preferenceOnehandedName = "Axes";
                    }
                    if (preferenceOnehanded == 6 || preferenceOnehanded == 7 || preferenceOnehanded == 8)
                    {
                        preferenceOnehandedName = "Maces";
                    }
                }
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 6)
        {
            if ((((perk1 == 6 || perk2 == 6) && !(perk1 == 6 && perk2 == 6)) || (perk1 == 6 && perk2 == 6 && twohanded >= 20) || (perk1 != 6 && perk2 != 6)) && (perk1 != 5 && perk2 != 5))
            {
                perk3Name = "Two Handed";
                if (perk1 != 6 && perk2 != 6)
                {
                    Random pref = new Random(); 
                    preferenceOnehanded = perk.nextInt(12);
                    if (preferenceTwohanded == 0 || preferenceTwohanded == 1 || preferenceTwohanded == 2)
                    {
                        preferenceTwohandedName = "Greatswords";
                    }
                    if (preferenceTwohanded == 3 || preferenceTwohanded == 4 || preferenceTwohanded == 5)
                    {
                        preferenceTwohandedName = "Battleaxes";
                    }
                    if (preferenceTwohanded == 6 || preferenceTwohanded == 7 || preferenceTwohanded == 8)
                    {
                        preferenceTwohandedName = "Warhammers";
                    }
                    if (preferenceTwohanded == 9 || preferenceTwohanded == 10 || preferenceTwohanded == 11)
                    {
                        preferenceTwohandedName = "Quarterstaves";
                    }
                }
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 7)
        {
            if (((perk1 == 7 || perk2 == 7) && !(perk1 == 7 && perk2 == 7)) || (perk1 == 7 && perk2 == 7 && archery >= 20) || (perk1 != 7 && perk2 != 7))
            {
                perk3Name = "Marksmanship";
                if (perk1 != 7 && perk2 != 7)
                {
                    Random pref = new Random(); 
                    preferenceArchery = perk.nextInt(2);
                    if (preferenceArchery == 0)
                    {
                        preferenceArcheryName = "Crossbows";
                    }
                    if (preferenceArchery == 1)
                    {
                        preferenceArcheryName = "Bows";
                    }
                }
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 8)
        {
            if (perk1 != 8 && perk2 != 8)
            {
                perk3Name = "Block";
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 9)
        {
            if (perk1 != 9 && perk1 != 10 && perk2 != 9 && perk2 != 10)
            {
                perk3Name = "Heavy Armor";
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 10)
        {
            if (perk1 != 10 && perk1 != 9 && perk2 != 10 && perk2 != 9)
            {
                perk3Name = "Evasion";
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 11)
        {
            if (perk1 != 11 && perk2 != 11)
            {
                perk3Name = "Speechcraft";
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 12)
        {
            if (!(perk1 == 12 && perk2 == 12))
            {
                perk3Name = "Alchemy";
            }
            else 
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 13)
        {
            if (perk1 != 13 && perk2 != 13)
            {
                perk3Name = "Smithing";
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 14)
        {
            if (!(perk1 == 14 && perk2 == 14))
            {
                perk3Name = "Enchanting";
            }
            else 
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 15)
        {
            if (!(perk1 == 15 && perk2 == 15))
            {
                perk3Name = "Stealth";
            }
            else 
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 16)
        {
            if (perk1 != 16 && perk2 != 16)
            {
                perk3Name = "Lockpicking";
            }
            else
            {
                choosePerkSkill3();
            }
        }
        if (perk3 == 17)
        {
            if (!(perk1 == 17 && perk2 == 17) && (perk2 != 9 && perk1 !=9))
            {
                perk3Name = "Pickpocket";
                lawfulName = " an unlawful ";
            }
            else 
            {
                choosePerkSkill3();
            }
        }
    }

    private static void buildCharacter() //it builds character
    {
        //System.console().writer().println
        System.out.println ("You are" + lawfulName + raceName + "born under the " + standingStoneName + ". Your background gives you perks in " + perk1Name + ", " + perk2Name + " and " + perk3Name + ".");

    }
}
