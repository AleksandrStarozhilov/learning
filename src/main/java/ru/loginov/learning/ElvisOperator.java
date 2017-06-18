package ru.loginov.learning;

public class ElvisOperator {

    public static void main(String[] args) {
        int i = 5;
        if (i == 5) {
            System.out.println("five");
        } else {
            System.out.println("not");
        }

        System.out.println(i == 5 ? "five" : "not");
        int j = i > 3 ? 10 : 20;
    }

}

