package com.odde.emersonsgame.model;

public class Player {
    String speed;
    int roll;
    int steps;
    int damage;
    int newDamaga;


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

    public int getNewDamaga() {
        return newDamaga;
    }

    public void setNewDamaga(int newDamaga) {
        this.newDamaga = newDamaga;
    }

    Player() {

    }
}
