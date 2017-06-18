package ru.loginov.learning;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = new int[10];
        //indexes start with 0
        for (int i = 0; i < 10; i++) {
            arr[i] = i*i;
        }

        for (int myElem: arr) { //foreach
            System.out.println(myElem);
        }

        int i = 5;
        long l = i;
//        long[] longs = arr; //primitive arrays can not be casted

        int[] ints = new int[] {1, 2, 5};
    }

}
