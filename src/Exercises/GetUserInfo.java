package Exercises;

import java.util.Scanner;

public class GetUserInfo {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter your age >> ");
        age = inputDevice.nextInt();
        System.out.println("Please enter your name >>");
        name = inputDevice.nextLine();
        System.out.println("Your name is " + name + " and you age " + age + " years old.");
    }
}
