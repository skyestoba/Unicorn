package com.company;
import java.util.Random;
public class Unicorn {
    String name;
    String color;
    int coolness;
    int hornLength;


    public Unicorn(String name, String color, int coolness, int hornLength) {
        this.name = name;
        this.color = color;
        this.coolness = coolness;
        this.hornLength = hornLength;
    }
    //Getters and Setters for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Getters and Setters for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Getters and Setters for coolness
    public int getCoolness() {
        return coolness;
    }

    public void setCoolness(int coolness) {
        this.coolness = coolness;
    }
    //Getters and Setters for horn length
    public int getHornLength() {
        return hornLength;
    }

    public void setHornLength(int hornLength) {
        this.hornLength = hornLength;
    }

    public boolean isCool(){
        if(coolness>=10){
            return true;
        }
        return false;
    }

    public String doATrick(){
        Random rand = new Random();
        int upperBound = 4;
        int choice = rand.nextInt(upperBound);

        if(choice==3){
            coolness = coolness+3;
            return name + " did a kickflip! your coolness is now " + coolness;
        }

        if(choice==2){
            coolness = coolness+2;
            return name + " did a front flip! your coolness is now " + coolness;
        }

        else{
            coolness = coolness +1;
            return name + " did a cool little dance! your coolness is now " + coolness;
        }
    }
}
