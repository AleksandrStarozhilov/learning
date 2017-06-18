package ru.loginov.learning;

public class Homework1a {

    // a * x^2 + b * x + c = 0 - квадратное уравнение  (а м.б. = 0)
    //требуется вывести корни уравнения или написать что их нет
    //camelCase
    public static void main(String[] args) {
        System.out.println(solve(1, 1, 1));
    }
    
    static String solve(int a, int b, int c) {
        if (a == 0) {
            if (b != 0) {
                double x = -c / (double) b;
                return "x = " + x;
            } else {
                return c == 0 ? "x - любой" : "Нет решений";
            }
        } else {
            //вычислим дискриминант d=a^2-4ac
            double d = b * b - (4 * a * c);
            if (d > 0) { //Если d > 0, то уравнение имеет два корня.
                double x1 = (-b - Math.sqrt(d)) / (2 * a);;
                double x2 = (-b + Math.sqrt(d)) / (2 * a);;
                return "x1=" + x1 + ", x2 = " + x2;
            } else if (d == 0) {  //Если d = 0, то уравнение имеет один корень.
                double x = -b / (2 * (double)a);
                return "x=" + x;
            } else { //Если d < 0, то уравнение не имеет корней.
                return "Корней нет";
            }
        }
    }

}
