/**
 * 
 * 
 * @author Sanjana
 * @version 1.0
 * @since 2025-01
 */


 public class Lion extends Animal {
    private String maneColor;

    /**
     * This constructor sets the lion class and it's mane color
     * @param mc Color of the lion's mane
     */
    public Lion(String mc) {
        super("lion", "lions", "pride", "roar!");
        maneColor = mc;
    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String mc) {
        maneColor = mc;
    }
 }