package week08;

import java.util.ArrayList;

import week08.insect.FlyingInsect;
import week08.insect.Insect;
import week08.insect.StingingInsect;

public class InsectDemo {
    public static void main(String [] args) {
        // 1.
        // declare & create an insect object called 'beetle'
        // using the 1-parameter constructor with the parameter 'beetle'
        Insect beetle = new Insect("beetle");
        // System.out.println(beetle);

        // 2.
        // declare an insect object called 'ladybug', but 
        // instatiate it with the 0-parameter FlyingInsect constructor
        Insect ladybug = new FlyingInsect();
        // System.out.println(ladybug);

        // 3.
        // declare an insect object called 'bee', but 
        // instatiate it with the 0-parameter StingingInsect constructor
        Insect bee = new StingingInsect();
        // System.out.println(bee);

        ArrayList<Insect> listOfInsects = new ArrayList<>();
        // 4.
        // write the code to add all three objects created above into the array list 'listOfInsects' 
        //
        listOfInsects.add(bee);
        listOfInsects.add(beetle);
        listOfInsects.add(ladybug);
        // System.out.println(listOfInsects);

        // 5. 
        // create a new variable called 'dungBeetle' of type 
        // Insect and set it to the variable 'beetle'
        //
        Insect dungBeetle = beetle;

        // 6.
        // change the name of the 'beetle' variable to 'dung beetle'
        //
        System.out.println("\n\nchange the name of the 'beetle' variable to 'dung beetle'");
        beetle.setName("dung beetle");
        System.out.println(beetle.getName() + " <==> " +dungBeetle.getName());


        // 7.
        // test to see if the dungBeetle object is equal to the beetle object
        //
        /*
         * we will write this code in class on Tuesday, March 18th
         */
        dungBeetle = new FlyingInsect();
        dungBeetle.setName("Dung Beetle");
        if(beetle.equals(dungBeetle)) {
            System.out.println("they are the same!");
        } else {
            System.out.println("DIFFERENT");
        }



        // 8.
        // using the variable 'bee', set the name for the bee to 'bumble bee'
        //
        bee.setName("bumble bee");


        // 9.
        // using the index location in the arraylist where the ladybug is stored, 
        // set the name for the ladybug to 'queen elizabeth'
        //
        listOfInsects.get(2).setName("queen elizabeth");
        
        // 10.
        // print out the array list
        //
        System.out.println(listOfInsects);
    }
}
