package com.javarush.rogulenko.cryptoanalizer.commands;

import com.javarush.rogulenko.cryptoanalizer.entity.Result;
import com.javarush.rogulenko.cryptoanalizer.entity.ResultCode;

public class Decoder implements Action{

    @Override
    public Result execute(String[] parameters) {
        return new Result("All right Decoder", ResultCode.OK);
    }
}
