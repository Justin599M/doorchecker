package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static String quoteremover(String input){
        String send = "";
        char look = '"';
        if (input.charAt(0) == look){
            int inputlen = input.length();
            int gg = inputlen -1;
            for (int ind = 1; ind < gg; ind++){
                send = send + input.charAt(ind);
            }
        }else {
            return input;
        }
        return send;
    }
    public static void main(String[] args) {
        imageprocesser imageprocesser = new imageprocesser();
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter target file:");
        String beforetarget = sin.nextLine();
        String targetstring = quoteremover(beforetarget);
        System.out.println("Export:");
        String modifier = sin.nextLine();
        imageprocesser.startmethod(targetstring,modifier);
    }
}
