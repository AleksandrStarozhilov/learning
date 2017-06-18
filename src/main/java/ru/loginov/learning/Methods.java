package ru.loginov.learning;

//functions, procedures
public class Methods {

    public static void main(String[] args) {
        printHelloWorld();
        int a = 1;
        int b = 2;
        int c = 10;
        System.out.println(a);
//        int mySum = sum(b, a, c);


//        sum(1, 1.0);
//        System.out.println(mySum);
//        System.out.println(a); //1
    }


    static void printHelloWorld() { //void - ничего не возвращает
        System.out.println("Hello world!!!!!");
    }

//    static int sum(int x, int y) {
////        x++;
//        return x + y;
//    }
//
//    static int sum(int x, int y, int z) { //overloading = перегрузка = методы с одинаковым именем но разным набором параметров
//        return x + y + z;
//    }

    static double sum(double x, double y) {
        return x + y;
    }

    //два метода с одинаковым именем и одинаковым набором параметров но с разным возвращаемым значением ?


}
