package com.javarush.rogulenko.cryptoanalizer.controllers;

import com.javarush.rogulenko.cryptoanalizer.commands.Action;
import com.javarush.rogulenko.cryptoanalizer.entity.Result;
import com.javarush.rogulenko.cryptoanalizer.entity.ResultCode;
import com.javarush.rogulenko.cryptoanalizer.exceptions.AppException;

public class MainController {
    public Result doAction(String actionName, String[] parameters) {
        Action action = Actions.getAction(actionName);
        try {
            return action.execute(parameters);
        } catch (NumberFormatException | AppException e) {
            return new Result(e.getMessage(), ResultCode.ERROR);
        }
    }
}
