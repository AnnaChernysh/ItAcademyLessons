package Lesson_02;

 /*Запросить у пользователя 2слова.Если они одинаковы
   вывести "Отлично! Слова одинаковы".
         Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
         Если они отличаются,но одной длины -"Ну, хотя бы они одной длины
         "
         Использовать
         методы
         класса
         String:
         equals
         (String
         string),
         equalsIgnoreCase
         (String string),
         length
         ()*/

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 любых слова: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();


        if (str1.equals(str2)) {
            System.out.println("Отлично! Слова одинаковы");
        }
        if (str1.equalsIgnoreCase(str2) || str2.equalsIgnoreCase(str1)) {
            System.out.println("Хорошо! Почти одинаковы");
        }
        if (len1.equals(len2)){ System.out.println("Ну, хотя бы они одной длины");
    }
}


