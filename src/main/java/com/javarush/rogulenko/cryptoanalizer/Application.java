package com.javarush.rogulenko.cryptoanalizer;

import com.javarush.rogulenko.cryptoanalizer.controllers.MainController;
import com.javarush.rogulenko.cryptoanalizer.entity.Result;
import com.javarush.rogulenko.cryptoanalizer.exceptions.AppException;

import java.util.Arrays;

public class Application {
    private final MainController mainController;

    public Application() {
        mainController = new MainController();
    }

    public Result run(String[] args) {
        if (args.length > 0) {
            String action = args[0];
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);
            return mainController.doAction(action, parameters);
        } else {
            throw  new AppException("Arguments entered incorrectly -> " + Arrays.toString(args));
        }
    }
}
