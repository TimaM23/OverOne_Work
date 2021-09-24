package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Leaderboard
{
    public static void showLeaderboard() throws FileNotFoundException {
        String readFile = "G:\\IntelJ\\Projects\\FinalProject_RussianRoulette\\src\\Leaderboard";
        File file = new File(readFile);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String leaderboardLine = scanner.nextLine();
            String[] splitedLine = leaderboardLine.split("_");
            for (String part:splitedLine) {
                System.out.print("\t" + part);
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void updateTheLeaderboard(Characters player) throws IOException {
        FileInputStream file = new FileInputStream("G:\\IntelJ\\Projects\\FinalProject_RussianRoulette\\src\\Leaderboard");
        Scanner scanner = new Scanner(file);
        ArrayList<Characters> leaders = new ArrayList<>();
        while (scanner.hasNextLine()){
            String leaderboardLine = scanner.nextLine();
            String[] splitedLine = leaderboardLine.split("_");
            Characters characters = new Characters(splitedLine[1],splitedLine[2],Integer.parseInt(splitedLine[3]));
            leaders.add(characters);
        }
        scanner.close();
        leaders.add(player);
        Characters[] arrayOfLeaders = leaders.toArray(new Characters[0]);
        for (int i = arrayOfLeaders.length; i > 0; i--) {
            for (int j = arrayOfLeaders.length - 1; j > 0; j--) {
                if (arrayOfLeaders[j].getScore() > arrayOfLeaders[j-1].getScore()){
                    Characters swap = arrayOfLeaders[j-1];
                    arrayOfLeaders[j-1] = arrayOfLeaders[j];
                    arrayOfLeaders[j] = swap;
                }
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(file));
        for (int i = 0; i < arrayOfLeaders.length; i++)
        {
            String leaderPlace = String.valueOf(i+1);
            String toLeaderboardLine = leaderPlace + "_" + arrayOfLeaders[i].getFirstName() +
                    "_" + arrayOfLeaders[i].getSecondName() + "_" + arrayOfLeaders[i].getScore() + "\n\r";
            fileOutputStream.write(toLeaderboardLine.getBytes());
        }
        fileOutputStream.close();
    }
}
