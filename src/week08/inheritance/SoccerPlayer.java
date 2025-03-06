package week08.inheritance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SoccerPlayer {
    private int jersey;
    private String position;
    private String name;
    private double height;
    private double weight;
    private Date birthdate;
    private List<String> uniform;

    public SoccerPlayer() {
        this(0, "");
    }

    public SoccerPlayer(int jersey, String name) {
        this.jersey = jersey;
        position = "";
        this.name = name;

        height = 0;
        weight = 0;
        // default to today as the birthdate
        birthdate = new Date();
        uniform = new ArrayList<>();
    }

    public int getJersey() {
        return jersey;
    }

    public void setJersey(int jersey) {
        this.jersey = jersey;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public List<String> getUniform() {
        return uniform;
    }

    public void setUniform(List<String> uniform) {
        this.uniform = uniform;
    }

    /*
     * 
     */
    public void shoot() {
        System.out.println("whirrrrrllll....");
    }


    /*
     * override the default toString behaviour
     */
    @Override
    public String toString() {
        String returnString = "name: " + name + "\n" + "jersey #: " +jersey;
        return returnString;
    }
}