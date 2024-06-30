package com.javarush.rogulenko.cryptoanalizer;

import com.javarush.rogulenko.cryptoanalizer.entity.Result;

import java.util.Scanner;


public class ConsoleRunner {
    public static void main(String[] args) {
        Application application = new Application(); // из консольного аргумента передали в класс Application
        args = getArgs(args);
        Result result = application.run(args);
        System.out.println(result);
    }

    public static final String[][][] QUESTIONS = new String[][][]{
            {
                    {"encode"},
                    {"Enter source (full path OR only filename OR Enter for text.txt)", "text.txt"},
                    {"Enter destination (full path OR only filename OR Enter for encrypted.txt)", "encrypted.txt"},
                    {"Enter key (int number OR Enter for key=1) :", "1"},
            },
            {
                    {"decode"},
                    {"Enter source (full path OR only filename OR Enter for text.txt)", "encrypted.txt"},
                    {"Enter destination (full path OR only filename OR Enter for decrypted.txt)", "decrypted.txt"},
                    {"Enter key (int number OR Enter for key=1) :", "1"},
            },
            {
                    {"Exit"},
            }

    };

    public static final String MESSAGE_SELECTED_MODE = """
            Please select mode:
            1.Encrypt
            2.Decrypt
            3.Exit
            """;

    public static final String INCORRECT_SELECTION = "Incorrect selection";

    private static String[] getArgs(String[] args) {
     if (args.length == 0) {
         Scanner keyboard = new Scanner(System.in);
         int mode = getMode(keyboard);
         mode--;
         args = new String[QUESTIONS[mode].length];
         args[0] = QUESTIONS[mode][0][0];
         for (int i = 1; i < args.length; i++) {
            String quest = QUESTIONS[mode][i][0];
             System.out.println(quest);
             String answer = keyboard.nextLine();
             args[i] = answer.isEmpty() ? QUESTIONS[mode][i][1] : answer;
         }
     }
     return args;
    }
    private static int getMode(Scanner keyboard) {
        int mode;
        do{
            System.out.println(MESSAGE_SELECTED_MODE);
            String input = keyboard.nextLine();
            mode = switch (input){
                case "1" -> 1;
                case "2" -> 2;
                case "3" -> 3;
                default -> {
                    System.out.println(INCORRECT_SELECTION);
                    yield -1;
                }
            };
        } while(mode < 0);
        return mode;
    }
}
