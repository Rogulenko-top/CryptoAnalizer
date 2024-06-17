package com.javarush.rogulenko.cryptoanalizer;

import com.javarush.rogulenko.cryptoanalizer.entity.Result;

public class ConsoleRunner {
    public static void main(String[] args) {
        Application application = new Application(); // из консольного аргумента передали в класс Application
        Result result = application.run(args);
        System.out.println(result);
    }
}
