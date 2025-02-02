/**
 * 
 * @author
 * @version 1.0
 * @since 2025-01
 */


import java.util.ArrayList;

public class Zoo {

    public static void main(String [] args) {
            // create a new ArrayList of animals
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(new Lion("yellow"));
        zoo.add(new Donkey("purple"));
        for (Animal a : zoo) {
            System.out.println("Singular name: " + a.getSingularName());
            System.out.println("Plural name: " + a.getPluralName());
            System.out.println("Group name: " + a.getGroupName());
            System.out.println("Sound: " + a.getSound());
        }

        Lion l1 = new Lion("purple");
        System.out.println("1 " + l1.getSingularName());
        System.out.println("2: " + l1.getPluralName());
        System.out.println("A: " + l1.getGroupName() + "of " + l1.getPluralName());
        System.out.println("The " + l1.getSingularName() + "goes" + l1.getSound());
        System.out.println("The lion's mane color is " + l1.getManeColor());


        Donkey d1 = new Donkey("yellow");
        Pig p1 = new Pig("blue");
        Chimpanzee c1 = new Chimpanzee(50);


    }
}