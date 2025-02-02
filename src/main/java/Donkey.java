    public class Donkey extends Animal {
    private String tailColor;

    /**
     * This constructor sets the donkey class and it's tail color
     * @param tc Color of the donkey's mane
     */
    public Donkey(String tc) {
        super("donkey", "donkeys", "drove", "hee-haw!");
        tailColor = tc;
    }

    public String getTailColor() {
        return tailColor;
    }

    public void setManeColor(String tc) {
        tailColor = tc;
    }
}
