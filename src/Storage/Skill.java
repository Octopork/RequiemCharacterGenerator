package Storage;

/**
 * @author Octopork
 * Date 13/12/2016.
 *
 * Storage for skill releated data.
 */
public class Skill {
    public final Skills skillEnum;
    public final String skillName;
    public final String longDescription;

    /**
     *
     * @param skillEnum the enum value of the skill, not used currently
     * @param skillName the text name of the skill
     * @param longDescription the skills description
     */
    public Skill(Skills skillEnum, String skillName, String longDescription){
        this.skillEnum = skillEnum;
        this.skillName = skillName;
        this.longDescription = longDescription;
    }

    @Override
    public String toString(){
        return longDescription;
    }
}
