package com.javarush.rogulenko.cryptoanalizer.commands;

import com.javarush.rogulenko.cryptoanalizer.entity.Result;
import com.javarush.rogulenko.cryptoanalizer.entity.ResultCode;

public class BrudeForce implements Action{
    @Override
    public Result execute(String[] parameters) {
        return new Result("BrudeForce complete!", ResultCode.OK);
    }
}
