package com.company;

import java.util.Scanner;

public class MainMechanics
{
    public static int letsPlay()
    {
        int bulletPlace = (int)(Math.random()*6+1);
        int coin = (int)(Math.random()+1);
        if (coin == 1) {
            System.out.println("Your first turn.");
        }
        else {
            System.out.println("Opponent's first turn");
        }
        int turn = 1, yourTurn = coin % 2;
        while (true)
        {
            if (turn % 2 == yourTurn){
                System.out.println("What will you do?\n1 - Fire\n2 - Give up and put down the gun");
                int yourChoice = new Scanner(System.in).nextInt();
                if (yourChoice == 2) return 0;
                else
                if (bulletPlace == turn) return 0;
                else {
                    System.out.println("You are still alive. Good luck is on your side.");
                    turn++;
                }
            }else if (bulletPlace == turn) return 1;
            else {
                System.out.println("Apparently, this test does not end yet.");
                turn++;
            }
        }
    }
}
