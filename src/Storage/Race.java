package Storage;

/**
 * @author Octopork
 *         Date 13/12/2016.
 *  Storage for racial data
 */


public class Race {

    /**
     * Usually you want getter and setter methods for these
     * However as this is just a class for storage I choose to leave them as public variables because lazy
     * Also final as once they are set we don't want to change them.
     */
    public final Races raceEnum;
    public final String raceName;
    public final String longDescription;

    public final Skills[] masterAffinities;
    public final Skills[] majorAffinities;
    public final Skills[] minorAffinities;

    /***
     * Notice Method is named the same as the class
     * This is called a constructor, when you use something like "Storage.Race breton = new Storage.Race()" this method is called
     * This is a great place to pass all the data you wish to add into the object as it's created or do something upon creation
     *
     * @param raceEnum The enum of the race, not used currently but easy enough to just put there if it's needed in the future
     * @param raceName The name of the race in text.
     * @param masterAffinities For skills like archery for Bosmer that have a +15 modifier by default.
     * @param majorAffinities For skills that are given +10 by default
     * @param minorAffinities For +5 by default skills, you get the idea.
     * @param longDescription Long description of the race.
     */
    public Race(Races raceEnum, String raceName, Skills[] masterAffinities, Skills[] majorAffinities, Skills[] minorAffinities, String longDescription){
        //using this rather than different names is personal preferrence, i find this easy to read.
        this.raceEnum = raceEnum;
        this.raceName = raceName;
        this.masterAffinities = masterAffinities;
        this.majorAffinities = majorAffinities;
        this.minorAffinities = minorAffinities;
        this.longDescription = longDescription;
    }


    //some GUI elements in javaFX will pull the name of an object using this method, by overriding it we change what this object will display as in something like a combo box.
    @Override
    public String toString(){
        return raceName;
    }
}
