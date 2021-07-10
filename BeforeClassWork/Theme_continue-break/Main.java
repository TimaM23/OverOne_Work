package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 100; i++)
        {
            if (i >= 30 && i <= 80) continue;
            else System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Введите проверяемый текст: ");
        String text = new Scanner(System.in).nextLine();
        boolean f = false;
        for (int i = 0; i <= text.length()-1; i++)
        {
            char sim = text.charAt(i);
            if (sim == 'q')
            {
                f = true;
                break;
            }
        }
        if (f) System.out.println("Досрочное прекращение осмотра текста! Обнаружен символ q!");
        else System.out.println("Программа успешно отработала, символ q не обнаружен.");
    }
}
