package com.javarush.rogulenko.cryptoanalizer.commands;

import com.javarush.rogulenko.cryptoanalizer.entity.Result;
import com.javarush.rogulenko.cryptoanalizer.util.FileActionHandler;

public class Decoder implements Action{

    @Override
    public Result execute(String[] parameters) {
        String encryptedFilename = parameters[0];
        String decryptedFilename = parameters[1];
        int key = Integer.parseInt(parameters[2]);
        FileActionHandler fileActionHandler = new FileActionHandler();
        return fileActionHandler.processFileWithKey(encryptedFilename, decryptedFilename, -1 * key);
    }
}
