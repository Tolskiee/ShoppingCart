package com.company;


import java.util.Scanner;

public class Main {
    public static int choice;
    public static Scanner s = new Scanner(System.in);


    public static void promptScreen(){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Press [1] Add Item | [2] Remove Item | [3] Checkout | [0] Exit");
        System.out.println("-------------------------------------------------------------------");

        choice = s.nextInt();
    }


    public static void main(String[] args) {
        promptScreen();
    }
}
