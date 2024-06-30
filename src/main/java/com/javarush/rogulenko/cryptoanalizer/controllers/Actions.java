package com.javarush.rogulenko.cryptoanalizer.controllers;

import com.javarush.rogulenko.cryptoanalizer.commands.*;
import com.javarush.rogulenko.cryptoanalizer.exceptions.AppException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder()),
    EXIT(new Exit());

    private final Action action;

    Actions(Action action){
        this.action = action;
    }

    public static Action getAction(String actionName){
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        } catch (IllegalArgumentException e) {
            throw new AppException("this command does not exist -> " + "\"" + actionName + "\"", e);
        }
    }
}
