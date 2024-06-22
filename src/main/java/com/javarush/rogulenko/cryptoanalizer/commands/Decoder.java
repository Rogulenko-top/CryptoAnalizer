package com.javarush.rogulenko.cryptoanalizer.commands;

import com.javarush.rogulenko.cryptoanalizer.entity.Result;
import com.javarush.rogulenko.cryptoanalizer.entity.ResultCode;

public class Decoder implements Action{

    @Override
    public Result execute(String[] parameters) {
        System.out.println(parameters[0] + ", " + parameters[1] + ", " + parameters[2]);
        return new Result("All right Decoder", ResultCode.OK);
    }
}
