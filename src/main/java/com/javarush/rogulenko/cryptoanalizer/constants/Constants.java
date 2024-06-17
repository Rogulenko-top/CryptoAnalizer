package com.javarush.rogulenko.cryptoanalizer.constants;

import java.io.File;

public class Constants {
    private static final String rus = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String eng = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String cypher = "0123456789";
    private static final String diff_sym = "!@#$%^&*()[]{}";
    public static final String ALPHABET = rus.toLowerCase() + eng.toLowerCase() + cypher + diff_sym;
    public static final String TXT_FOLDER = System.getProperty("user.dir") + File.separator + "text" + File.separator;
}
