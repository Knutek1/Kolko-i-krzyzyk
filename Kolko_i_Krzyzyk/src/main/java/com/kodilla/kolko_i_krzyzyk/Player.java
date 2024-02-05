package com.kodilla.kolko_i_krzyzyk;

public class Player {
    private final String name;
    private final char character;
    private final int numberOfWinningRounds;
    private int point;

    public Player(String name, char character, int numberOfWinningRounds, int points) {
        this.name = name;
        this.character = character;
        this.numberOfWinningRounds = numberOfWinningRounds;
        this.point = points;
    }

    public String getName() {
        return name;
    }

    public char getCharacter() {
        return character;
    }

    public int getNumberOfWinningRounds() {
        return numberOfWinningRounds;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", character=" + character +
                ", numberOfWinningRounds=" + numberOfWinningRounds +
                ", points=" + point +
                '}';
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
