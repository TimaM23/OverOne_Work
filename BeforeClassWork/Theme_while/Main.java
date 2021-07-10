package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int i = 15;
        while (i >= 1)
        {
            System.out.print(i-- + " ");
        }
        System.out.println();
        System.out.print("Введите первое число: ");
        int val_1 = new Scanner(System.in).nextInt();
        System.out.print("Введите второе число: ");
        int val_2 = new Scanner(System.in).nextInt();
        if (val_1 >= 0 && val_2 >= 0)
                    System.out.print("В этом диапазоне нет отриц. чисел");
        else if (val_1 >= 0)
                {
                    i = ++val_2;//В задании введённое отрицательное число не учитывалось при выводе
                    while (i < 0)
                    {
                        System.out.print(i++ + " ");
                    }
                }
        else if (val_2 >= 0)
                {
                    i = ++val_1;//см. строку 25
                    while (i < 0)
                    {
                        System.out.print(i++ + " ");
                    }
                }
        System.out.println();

        BigInteger huge =BigInteger.valueOf(1); //new BigInteger("1"); для чисел, доступных как строка!!!
        int num = 2;
        while (num < 9435)
        {
            huge = huge.multiply(BigInteger.valueOf(num));
            num += 2;
        }
        System.out.println(huge);
    }
}
