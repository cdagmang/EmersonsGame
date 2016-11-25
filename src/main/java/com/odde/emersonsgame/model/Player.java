package com.odde.emersonsgame.model;

public class Player {
    private String speed;
    private int roll;
    private int steps;
    private int damage;

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Player() {
        setSteps(0);
        setDamage(0);
    }

    void takeTurn(){
        setRoll((int)(Math.random() * 6) + 1);
        takeSteps();
    }

    void takeSteps() {
        int stepsTaken = 0;

        if (getSpeed().equals("Normal")) {
            if ( roll % 2 == 1) {
                stepsTaken = 1 - damage;
            }
            else {
                stepsTaken = 2 - damage;
            }
        }
        else {
            int result = roll - damage;
            stepsTaken = result < 0 ? 0: result;
        }

        setSteps(steps + stepsTaken);
    }
}
