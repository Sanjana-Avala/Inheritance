/**
 * A parent class that represents an Animal
 * 
 * @author
 * @version 1.0
 * @since 2025-01
 */

public class Animal {
    /** The singular name of the animal */
    private String singularName;
    /** The plural name of the animal */
    private String pluralName;
    /** The group name of the animal */
    private String groupName;
    /** The sound the animal makes */
    private String sound;

    /**
     * This is a constructor for the animal class
     * @param sn
     * @param pn
     * @param gn
     * @param snd
     */
    public Animal(String sn, String pn, String gn, String snd) {
        singularName = sn;
        pluralName = pn;
        groupName = gn;
        sound = snd;
    }

    public String getSingularName() {
        return singularName;
    }

    public String getPluralName() {
        return pluralName;
    }

    public String getGroupName() {
        return groupName;
    }

}
