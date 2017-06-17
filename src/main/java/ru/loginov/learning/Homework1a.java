package ru.loginov.learning;

public class Homework1a {

    // a * x^2 + b * x + c = 0 - квадратное уравнение  (а м.б. = 0)
    //требуется вывести корни уравнения или написать что их нет
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 1;
        //вычислим дискриминант D=a^2-4ac
        double D;
        D = Math.pow(b, 2) - (4*a * c);
        //Если D > 0, то уравнение имеет два корня.
        if (D > 0){
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
        //Если D = 0, то уравнение имеет один корень.
        else if (D == 0){
            double x;
            x = -b / (2 * a);
            System.out.println("x=" + x);
        }
        //Если D < 0, то уравнение не имеет корней.
        else {
            System.out.println("Корней нет");
        }

        System.out.println("Дискриминант равен " + D);

        //System.out.println(14 / (double)5); //int by int division



        //double z = Math.sqrt(9); //квадратный корень
        //System.out.println(z);
    }

}
