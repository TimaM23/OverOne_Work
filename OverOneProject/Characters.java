package com.company;

import java.util.Scanner;

public class Characters
{
    private String firstName;
    private String secondName;
    private int score;

    public Characters() {}

    public Characters(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.score = 0;
    }

    public Characters(String firstName, String secondName, int score) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", score=" + score +
                '}';
    }

    public void generateOpponentCharacter()
    {
        int firstNameNumber = (int)(Math.random()*5);
        int secondNameNumber = (int)(Math.random()*5);
        this.setFirstName(FirstAndSecondNames.getFIRSTNAMES(firstNameNumber));
        this.setSecondName(FirstAndSecondNames.getSECONDNAMES(secondNameNumber));
        this.setScore((int)(Math.random()*10));
    }

    public void createPlayerCharacter()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your first name: ");
        this.setFirstName(scanner.nextLine());
        System.out.print("Your second name: ");
        this.setSecondName(scanner.nextLine());
        this.setScore(0);
    }
}
