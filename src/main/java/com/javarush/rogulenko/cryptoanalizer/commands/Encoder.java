package com.javarush.rogulenko.cryptoanalizer.commands;

import com.javarush.rogulenko.cryptoanalizer.entity.Result;
import com.javarush.rogulenko.cryptoanalizer.util.FileActionHandler;

public class Encoder implements Action {

    public Result execute(String[] parameters) {
        String sourceTextFile = parameters[0];
        String encryptedFile = parameters[1];
        int key = Integer.parseInt(parameters[2]);
        FileActionHandler fileActionHandler = new FileActionHandler();
        return fileActionHandler.processFileWithKey(sourceTextFile, encryptedFile, key);
    }
}
