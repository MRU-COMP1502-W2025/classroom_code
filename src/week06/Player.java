package week06;

import java.util.ArrayList;
import java.util.Date;

public class Player {
    private int jersey;
    private String position;
    private String name;
    private double height;
    private double weight;
    private Date birthdate;
    private ArrayList<String> uniform;

    public Player() {
        this.jersey = -1;
        this.position = "";
        this.name = "";

        this.height = 0;
        this.weight = 0;
        // default to today as the birthdate
        this.birthdate = new Date();
        this.uniform = new ArrayList<>();
    }

    public Player(int jersey, String name) {
        this.jersey = jersey;
        this.position = "";
        this.name = name;

        this.height = 0;
        this.weight = 0;
        // default to today as the birthdate
        this.birthdate = new Date();
        this.uniform = new ArrayList<>();
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
    public ArrayList<String> getUniform() {
        return uniform;
    }
    public void setUniform(ArrayList<String> uniform) {
        this.uniform = uniform;
    }


}
