package ru.loginov.learning;

public class Loop {

    public static void main(String[] args) {
/*
        for (int i = 0; i < 10; i++) {
            boolean even = (i % 2) == 0; //% - modulus - остаток от деления
            System.out.println(i);
            if (even) {
                System.out.println("четное");
            } else {
                System.out.println("нечетное");
            }
        }

*/
/*
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            if (i >= 5) {
                break;
            }
            System.out.println(i);
        }
*/
/*
        boolean shouldBreak = false;
        for (int i = 0; i < 10; i++) {
            if (shouldBreak) {
                break;
            }
            for (int j = 0; j < 10; j++) {
                int m = i * j;
                if (m == 45) {
                    System.out.println("i = " + i + " j = " + j);
                    shouldBreak = true;
                    break;
                }
            }
        }
*/

        myLoopLabel:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int m = i * j;
                if (m == 45) {
                    System.out.println("i = " + i + " j = " + j);
                    break myLoopLabel;
                }
            }
        }

//        while (condition) { }
//        do { } while (condition);


    }

}
