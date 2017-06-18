package ru.loginov.learning;

import java.io.File;

public class RecursionDirs {

    public static void main(String[] args) {
        printFiles(new File("C:\\Users\\user\\IdeaProjects\\learning"));
    }

    static void printFiles(File file) {
        for (File subfile : file.listFiles()) {
            System.out.println(subfile.getName());
            if (subfile.isDirectory()) {
                printFiles(subfile);
            }
        }
    }

}
