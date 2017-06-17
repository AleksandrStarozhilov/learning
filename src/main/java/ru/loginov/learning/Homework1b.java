package ru.loginov.learning;

public class Homework1b {

    public static void main(String[] args) {

        System.out.println("Таблица умножения четных чисел");
        for (int i=1; i<=9; i++){
           if (i % 2 != 0) continue;
              for(int j=1;j<=9;j++){
               if (j % 2 != 0) continue;
               System.out.println(i + "x" + j + "=" + i*j);
               //вывести таблицу умножения 1..9 на 1..9, но только для четных множителей
           }
       }
        //2 * 2 = 4
        //2 * 4 = 8
        //...
        //8 * 8 = 64
        //используя оператор continue
    }

}
