package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //if, else if, else

        //declare and initialize scanner
        Scanner keyboard = new Scanner(System.in);

        //Prompt user input
        System.out.println("Hello. This is the magic 8 ball. Think of a question & type a number and an answer will come your way.");

        //create integer
        Integer number = keyboard.nextInt();

        //creating possible responses

        if(number == 1 || number == 100) {
            System.out.println("Only if you think so.");
        }

        else if(number > 1 && number < 10) {
            System.out.println("Maybe someday.");
        }

        else if(number >= 10 && number <20) {
            System.out.println("Never.");
        }

        else if(number >= 20 && number <30) {
            System.out.println("Always.");
        }

        else if(number >= 30 && number <40){
            System.out.println("Of course.");
        }

        else if(number >= 40 && number <50) {
            System.out.println("Of course not.");
        }
        else if(number >=50 && number <60) {
            System.out.println("Why not?");
        }

        else if(number >=60 && number <70) {
            System.out.println("Not if you keep that attitude.");
        }

        else if(number >=70 && number <80) {
            System.out.println("Surely.");
        }

        else if(number >=80 && number <90) {
            System.out.println("No way");
        }

        else if(number >=90 && number <100) {
            System.out.println("Yeah, aight.");
        }

        else if(number < 0 || number > 100) {
            System.out.println("Funny... that's not what I asked for.");
        }
    }
}
