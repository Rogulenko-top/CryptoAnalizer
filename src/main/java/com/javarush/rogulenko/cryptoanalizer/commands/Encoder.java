package com.javarush.rogulenko.cryptoanalizer.commands;

import com.javarush.rogulenko.cryptoanalizer.entity.Result;
import com.javarush.rogulenko.cryptoanalizer.entity.ResultCode;

import static com.javarush.rogulenko.cryptoanalizer.constants.Constants.ALPHABET;

public class Encoder implements Action{
    @Override
    public Result execute(String[] parameters) {
        System.out.println(parameters[0] + ", " + parameters[1] + ", " + parameters[2]);
        return new Result("All right Encoder", ResultCode.OK);
    }
}
