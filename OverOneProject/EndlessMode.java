package com.company;

import java.io.IOException;
import java.util.Scanner;

public class EndlessMode implements GameMode
{
    public static void start() throws IOException {
        Characters player = new Characters();
        player.createPlayerCharacter();
        while (true)
        {
            System.out.println("Score: " + player.getScore() +
                    "\nSearch an opponent...");
            Characters opponent = new Characters();
            opponent.generateOpponentCharacter();
            System.out.println("Your opponent is " + opponent.getFirstName() +
                    " " + opponent.getSecondName() + ". Let's flip the coin and start!");
            int resultOfTheMatch = MainMechanics.letsPlay();
            if (resultOfTheMatch == 1) {
                System.out.println("Your opponent lose.\n");
                player.setScore(player.getScore() + 1);
            }
            else {
                System.out.println("GAME OVER\nWanna try again?\n1 - Yes\n2 - No(go back to main menu)");
                int yourChoice = new Scanner(System.in).nextInt();
                if (yourChoice == 1) player.createPlayerCharacter();
                else {
                    Leaderboard.updateTheLeaderboard(player);
                    break;
                }
            }
        }
    }
}