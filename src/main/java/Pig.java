    public class Pig extends Animal {
    private String skinColor;

    /**
     * This constructor sets the pig's class and it's skin color
     * @param sc Color of the pig's color
     */
    public Pig(String sc) {
        super("pig", "pigs", "drift", "oink-oink!");
        skinColor = sc;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String sc) {
        skinColor = sc;
    }
}
