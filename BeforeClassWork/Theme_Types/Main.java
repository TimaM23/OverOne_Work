package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.print("Введите целое число i: ");
	    int i = new Scanner(System.in).nextInt();
	    System.out.print("Введите целое число j: ");
	    int j = new Scanner(System.in).nextInt();
	    System.out.print("Введите дробное число: ");
	    double v = new Scanner(System.in).nextDouble();
        System.out.print("Введите свою строку: ");
	    String line = new Scanner(System.in).nextLine();
        System.out.println(i + j + v);
        System.out.println(line);
    }
}
