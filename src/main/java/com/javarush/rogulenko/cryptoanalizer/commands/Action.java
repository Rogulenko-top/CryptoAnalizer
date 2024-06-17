package com.javarush.rogulenko.cryptoanalizer.commands;

import com.javarush.rogulenko.cryptoanalizer.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
