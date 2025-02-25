package test;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.fail;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import week06.Player;

public class PlayerTest {
/*
    @Test
    public void test() {
        fail("not yet implemented...");
    }
 */
    @Test
    public void testPlayerCreation() {
        Player testPlayer = new Player(23, "Apoorve");
        String testPlayerName = testPlayer.getName();

        assertEquals(testPlayerName, "Apoorve");
    }


    @Test
    public void testPlayerSetName() {
        Player testPlayer = new Player(23, "Apoorve");
        testPlayer.setName("Harry");
        String testPlayerName = testPlayer.getName();

        assertNotEquals(testPlayerName, "Apoorve");
    }

    @Test
    public void testPlayerToString() {
        Player testPlayer = new Player(23, "Apoorve");

        String printedString = "name: Apoorve\n"+
                                "jersey #: 23\n";

        assertEquals(printedString, testPlayer.toString());
    }

}