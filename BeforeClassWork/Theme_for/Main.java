package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int beg, end, step;
        System.out.print("Введите начало последовательности: ");
        beg = new Scanner(System.in).nextInt();
        System.out.print("Введите конец последовательности: ");
        end = new Scanner(System.in).nextInt();
        System.out.print("Введите шаг последовательности: ");
        step = new Scanner(System.in).nextInt();
        for (int i = beg; i <= end; i += step)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 55; j < 9184; j+= 5)
        {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("Введите свой текст: ");
        String text = new Scanner(System.in).nextLine();
        String sen = "";
        System.out.print("Введите удаляемый из текста символ: ");
        String sim = new Scanner(System.in).nextLine();
        for (int i = 0; i <= text.length()-1; i++)
        {
            char e = text.charAt(i);
            String equal = String.valueOf(e);
            if (!sim.equals(equal))
            {
                sen += equal;
            }
        }
        System.out.print("Новый текст: " + sen);
        //double s = 0;
        /*for (int i = 1; i >=0; i++) //цикл с бесконечным повторением
        {
            s+= i;
        }*/
    }
}
