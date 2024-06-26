package com.javarush.rogulenko.cryptoanalizer.constants;

import java.util.*;

public class Alphabet {
    private Alphabet() {
    }

    private static final String rus = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String symbols = "\n★☆✿✤✦❉❥❤❧❶❷❸❹❺";

    public static final char[] CHARS = (rus.toLowerCase() + symbols).toCharArray();

    public final static Map<Character, Integer> index = new HashMap<>();

    static {
        for (int i = 0; i < CHARS.length; i++) {
            index.put(CHARS[i], i);
        }
    }
}
