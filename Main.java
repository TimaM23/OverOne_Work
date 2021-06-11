package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String test = "И, и, од и - капуста! два а";
        String[] textWithoutSpaces = test.split("\\s");//Делим текст на части по пробелам
        String newTextWithoutSigns = test.replaceAll("[,!-]", " ");//готовим текст к делению на слова
        String[] words = newTextWithoutSigns.split("\\s+");//делим подготовленный текст на слова
        Map<String, Integer> wordsLessThan4Digits = new HashMap<>(), wordsMoreThan4Digits = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String toLow = words[i].toLowerCase();
            if (toLow.length() <= 4) {//делим слова по кол-ву букв
                if (!(wordsLessThan4Digits.containsKey(toLow))) wordsLessThan4Digits.put(toLow, 1);
                else wordsLessThan4Digits.put(toLow, wordsLessThan4Digits.get(toLow) + 1);
            }else {
                if (!(wordsMoreThan4Digits.containsKey(toLow))) wordsMoreThan4Digits.put(toLow, 1);
                else wordsMoreThan4Digits.put(toLow, wordsMoreThan4Digits.get(toLow) + 1);
            }
        }
        String[] wordsReplaceToX = new String[wordsLessThan4Digits.size()];
        int placeInStr = 0;
        for (String s: wordsLessThan4Digits.keySet()) {//вносим в отдельный массив слова, подлежащие замене
            if (wordsLessThan4Digits.get(s) < 2){
                wordsReplaceToX[placeInStr] = s;
                placeInStr++;
            }
        }
        //String newText = test;
        for (int i = 0; i < textWithoutSpaces.length; i++) {//Запись в консоль изначального текста
            System.out.print(textWithoutSpaces[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < textWithoutSpaces.length; i++)
        {//пропуск кусков текста со словами в 4+ букв(врядли сработает со словами через дефиз, например, раз-поразу -> ххх-поразу)
            boolean flag = false;
            for (String s: wordsMoreThan4Digits.keySet()) {
                if (textWithoutSpaces[i].contains(s)){
                    flag = true;
                    break;
                }
            }
            if (flag) continue;
            else if (textWithoutSpaces[i].contains(wordsReplaceToX[placeInStr-1]))
            {//замена нужных слов, учитывая особенности добавления новой ячейки в мапы
             //при добавлении второй ячейки в мапу, первая ячейка станет в позицию 2, а новая - в 1-ю
             //т.е. если первая ячейка имеет ключ "а", а новая - "б", то в мапе хранятся как ["б","а"] по ключам
                textWithoutSpaces[i] = textWithoutSpaces[i].replace(wordsReplaceToX[placeInStr-1],
                        replaceToX(wordsReplaceToX[placeInStr-1].length()));
                placeInStr--;
            }
        }
        for (int i = 0; i < textWithoutSpaces.length; i++) {//вывод текста с заменёнными словами
            System.out.print(textWithoutSpaces[i] + " ");
        }
    }

    private static String replaceToX(int lengthOfWord)//метод для замены слова в n букв сторокой из "х" длиной в n символов
    {
        String howMuchXNeed = "";
        for (int i = 0; i < lengthOfWord; i++) {
            howMuchXNeed += "x";
        }
        return howMuchXNeed;
    }

}
