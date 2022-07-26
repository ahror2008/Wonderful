package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <=15 ; i++) {
            for (int j = 14; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.print("\n");

        }
    }
}
