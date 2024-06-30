package com.javarush.rogulenko.cryptoanalizer.commands;

import com.javarush.rogulenko.cryptoanalizer.entity.Result;
import com.javarush.rogulenko.cryptoanalizer.entity.ResultCode;

import static com.javarush.rogulenko.cryptoanalizer.constants.Const.APPLICATION_CLOSED;

public class Exit implements Action{
    @Override
    public Result execute(String[] parameters) {
        return new Result(APPLICATION_CLOSED, ResultCode.OK);
    }
}
