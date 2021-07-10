package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.print("Введите первое значение: ");
	    double value_1 = new Scanner(System.in).nextDouble();
        System.out.print("Введите операцию: ");
	    String line = new Scanner(System.in).nextLine();
        System.out.print("Введите второе значение: ");
	    double value_2 = new Scanner(System.in).nextDouble();
	    if (line.equals("+"))
            {
                System.out.println(value_1 + value_2);
            }
	    else if (line.equals("-"))
            {
                System.out.println(value_1 - value_2);
            }
	    else if (line.equals("/"))
            {
                System.out.println(value_1 / value_2);
            }
	    else if (line.equals("*"))
            {
                System.out.println(value_1 * value_2);
            }

        /*switch (line)
        {
            case "+": System.out.println(value_1 + value_2); break;
            case "-": System.out.println(value_1 - value_2); break;
            case "/": System.out.println(value_1 / value_2); break;
            case "*": System.out.println(value_1 * value_2); break;
        }*/
    }
}
