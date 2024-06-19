package com.javarush.rogulenko.cryptoanalizer.controllers;

import com.javarush.rogulenko.cryptoanalizer.commands.Action;
import com.javarush.rogulenko.cryptoanalizer.entity.Result;

public class MainController {
    public Result doAction(String actionName, String[] parameters) {
        Action action = Actions.getAction(actionName);
        return action.execute(parameters);
    }
}
