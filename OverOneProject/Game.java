package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Game
{
    public static void start(String[] array) throws IOException, InterruptedException {
        System.out.println("Welcome! Please, choose the action:\n\t1. Start Company\n\t2. Endless mode\n\t" +
                "3. Leaderboard(for \"Endless mode\" best 10 players)\n\t4. Exit");
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your choiсe: ");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    CompanyMode.start();
                    System.out.println("Please, choose the action:\n\t1. Start Company\n\t2. Endless mode\n\t" +
                            "3. Leaderboard(for \"Endless mode\" best 10 players)\n\t4. Exit");
                    break;
                case 2:
                    EndlessMode.start();
                    System.out.println("Please, choose the action:\n\t1. Start Company\n\t2. Endless mode\n\t" +
                            "3. Leaderboard(for \"Endless mode\" best 10 players)\n\t4. Exit");
                    break;
                case 3:
                    Leaderboard.showLeaderboard();
                    System.out.println("Please, choose the action:\n\t1. Start Company\n\t2. Endless mode\n\t" +
                            "3. Leaderboard(for \"Endless mode\" best 10 players)\n\t4. Exit");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
        }
    }
}
