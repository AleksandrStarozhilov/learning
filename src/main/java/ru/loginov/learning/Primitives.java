package ru.loginov.learning;

public class Primitives {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int i; //int - type, i - name
        i = 5; //assignment (not "equals")
        i = 6;
        //i = 7;
        System.out.println(i);

        /*
        1 byte = 8 bit = 2^8 = 256
        1 bit - sign, 7 bits - number
        0 "+",  1 "-"
        00000101 = + 2^2 * 1 + 2^1 * 0 + 2^0 * 1 = 4 + 1 = +5
        Целочисленные типы
        byte = [-128; 127]
        char = -2^15 .. 2^15 - 1
        int = 32 bit
        long = 64 bit
        Числа с плавающей точкой
        3.14 3.00
        float - 32 bit
        double - 64 bit
        Логический тип
        boolean - true / false
         */
        i = 100;
        byte b = (byte) i; //casting

        i = b; //auto casting
        System.out.println(b);

        float f = 3.14f;
        double d = f;
        d = 3.0;

        d = i; //100.0
        System.out.println(d);

        i = 100 + 50;
        i = i + 5;
        i += 5; //syntax shugar
        i++; //i = i + 1

        i = 2 + 3 * 4;  //evaluation order:  * > +
        i = 2 - 3 + 4;
//        i = 100000000 * 100010000 / 123456;
        i = (2 + 4) * 4;

        /*  таблица истинности
         x y       AND  OR  XOR  NOT
                   &&   ||   ^   !
         0 0        0    0   0   1
         0 1        0    1   1
         1 0        0    1   1   0
         1 1        1    1   0
        * */

//        System.out.println(false && false);
//        System.out.println(false && true);
//        System.out.println(true && false);
//        System.out.println(true && true);

        System.out.println(!true);

    }

}
