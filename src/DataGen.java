import Storage.Race;
import Storage.Races;
import Storage.Skill;
import Storage.Skills;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Octopork
 *         Date 13/12/2016.
 */
public class DataGen {

/*
* Here we have some new code that generates the values for the races, instead of having everything in seperate objects, it's all in one
* This is then all stored in a Map
* To get the information just use:
* races.get(Storage.Races.Altmer);
* in order to get all the information on Altmer.
*/
    public Map<Races,Race> createRaceData(){
        Map<Races,Race> races = new HashMap<Races,Race>();

        races.put(Races.Altmer, new Race(Races.Nord, "Nord",
                null, //master, note it's null here because nords don't have any +15 modifiers
                new Skills[]{Skills.smithing, Skills.twoHanded}, //major
                new Skills[]{Skills.block,Skills.heavyArmor, Skills.evasion, Skills.oneHanded}, //minor
                "aaa \n aaa")); // \n adds a new line to the string

        races.put(Races.Breton, new Race(Races.Breton, "Breton",
                new Skills[] {Skills.conjuration},
                null,
                new Skills[]{Skills.alchemy, Skills.alteration, Skills.illusion, Skills.restoration, Skills.speechCraft},
                "aaa \n aaa"));

        races.put(Races.Redguard, new Race(Races.Redguard, "Redguard",
                new Skills[] {Skills.oneHanded},
                null,
                new Skills[]{Skills.alteration, Skills.archery, Skills.block,Skills.destruction, Skills.smithing},
                "aaa \n aaa"));

        races.put(Races.Imperial, new Race(Races.Imperial, "Imperial",
                null,
                new Skills[] {Skills.restoration, Skills.speechCraft},
                new Skills[]{Skills.block,Skills.destruction, Skills.heavyArmor, Skills.oneHanded},
                "aaa \n aaa"));


        //TODO: Complete all races
        races.put(Races.Altmer, new Race(Races.Altmer, "Altmer",
                new Skills[] {Skills.conjuration},
                null,
                new Skills[]{Skills.alchemy, Skills.alteration, Skills.illusion, Skills.restoration, Skills.speechCraft},
                "aaa \n aaa"));



        return races;
    }


    public Map<Skills, Skill> createSkillData(){
      Map<Skills, Skill> skills = new HashMap<Skills,Skill>();


        return skills;

    }
}
