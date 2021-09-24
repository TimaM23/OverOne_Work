package com.company;

import java.util.Scanner;

public class CompanyMode implements GameMode
{
    public static void start() throws InterruptedException {
        Characters player = new Characters("Adam","Forest");
        while (true)
        {
            System.out.println("*You wake up and find yourself in a small room with dim lights,\n" +
                    "a table and two chairs, to one of which you are tied*");
            Thread.sleep(3000);
            System.out.println("-Oh, you woke up, good. Well, " + player.getFirstName() + " " +
                    player.getSecondName() + ", you owe our boss a large sum to open your store.\n" +
                    "Now almost four months have passed, and you have not returned the money.");
            Thread.sleep(3000);
            System.out.println("-Do not misunderstand, the Family tries not to resort to such methods,\n" +
                    "but the debts should be repaid as well.");
            Thread.sleep(3000);
            System.out.println("-*Sigh* ...Ok, we can forgive you the debt,\n" +
                    "but you will have to play the same game with the same debtor as you.\n" +
                    "If you refuse, you will die. If you lose, you die too.\n" +
                    "But if you win, you stay alive and you don't have to return the money.\n" +
                    "So which will you choose?\n\n" +
                    "1 - Accept\n" +
                    "2 - Refuse(Game over)");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 2) {
                System.out.println("-Well, this is your choice. *Bang!*");
                System.out.println("GAME OVER\nWanna try again?\n1 - Yes\n2 - No(go back to main menu)");
                int yourChoice = new Scanner(System.in).nextInt();
                if (yourChoice == 2) break;
                Thread.sleep(3000);
            } else {
                Characters opponent = new Characters();
                opponent.generateOpponentCharacter();
                System.out.println("-Good decision. Your friend in misfortune, what was his name...\n" +
                        "Oh yes, " + opponent.getFirstName() + " " + opponent.getSecondName() + ".\n" +
                        "Well, let's start.");
                int resultOfTheGame = MainMechanics.letsPlay();
                if (resultOfTheGame == 0) {
                    System.out.println("GAME OVER\nWanna try again?\n1 - Yes\n2 - No(go back to main menu)");
                    int yourChoice = new Scanner(System.in).nextInt();
                    if (yourChoice == 2) break;
                }
            }
        }
    }
}
