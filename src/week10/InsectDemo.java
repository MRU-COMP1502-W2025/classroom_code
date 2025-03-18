package week10;

import java.util.ArrayList;

import week10.insect.FlyingInsect;
import week10.insect.Insect;
import week10.insect.StingingInsect;

public class InsectDemo {
    public static void main(String[] args) {

        // 1.
        // cannot do this anymore since Insect is now an abstract class
        // Insect beetle = new Insect("beetle");

        // 2.
        // declare an insect object called 'ladybug
        // instatiate it with the implicit 0-parameter FlyingInsect constructor
        Insect ladybug = new FlyingInsect();
        // call the implemented makeNoise() method in FlyingInsect
        System.out.println(ladybug.makeNoise());

        // 3.
        // declare an insect object called 'bee'
        // instatiate it with the implicit 0-parameter StingingInsect constructor
        Insect bee = new StingingInsect();
        // call the implemented makeNoise() method in FlyingInsect
        System.out.println(bee.makeNoise());

        ArrayList<Insect> listOfInsects = new ArrayList<>();
        // 4.
        // write code to add all the objects created above into the array list
        // 'listOfInsects'
        listOfInsects.add(bee);
        listOfInsects.add(ladybug);

        // 5.
        // create a new variable called 'dungBeetle' of type
        //
        Insect dungBeetle;

        // 6.
        // test to see if the dungBeetle object is equal to the bee object
        //
        dungBeetle = new FlyingInsect();
        dungBeetle.setName("Dung Beetle");
        /*
         * remember we cannot use == to test for the equality of two objects
         */
        if (bee.equals(dungBeetle)) {
            System.out.println("they are the same!");
        } else {
            System.out.println("DIFFERENT");
        }

        // 7.
        // using the variable 'bee', set the name for the bee to 'bumble bee'
        //
        bee.setName("bumble bee");

        // 8.
        // using the index location in the arraylist where the ladybug is stored,
        // set the name for the ladybug to 'queen elizabeth'
        //
        listOfInsects.get(0).setName("queen elizabeth");

        // 9.
        // print out the array list
        //
        System.out.println(listOfInsects);
    }
}