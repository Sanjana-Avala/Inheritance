

public class Chimpanzee extends Animal {
    
    
    private int height;

    /**
     * This constructor sets the chimpanzee class and it's height 
     * @param h height of the chimpanzee
     */
    public Chimpanzee(int h) {
        super("chimpanzee", "chimpanzees", "tribe", "hoot-hoot!");
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        height = h;
    }

}
