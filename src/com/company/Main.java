package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    private static ArrayList<String>board =new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        System.out.println("enter length of list:" );
        int length = Integer.parseInt(UserInput());
        makeBoard(length);
        System.out.println("enter name");
        String name = UserInput();


    }
    public static void game(int length,String name){
        int goes = 0;
        while(goes*2< length){
            int userInt = Integer.parseInt(UserInput());

        }
    }
    public static String UserInput() {
        Scanner input = new Scanner(System.in);
        String userin;
        while (true) {
            try {
                userin = input.next();
                break;
            } catch (Exception e) {
                System.out.println("not a valid input " + e);
                input.next();
            }
        }
        return userin;
    }
    public static void makeBoard(int length){
        for (int i = 0; i < length; i++) {
            board.add("[ ]");
        }
    }
    public static int RandNum(int min,int max){
        Random random = new Random();
        return random.nextInt(max-min)+min;
    }

}
