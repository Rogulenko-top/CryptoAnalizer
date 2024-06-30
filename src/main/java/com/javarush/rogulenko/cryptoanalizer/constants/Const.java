package com.javarush.rogulenko.cryptoanalizer.constants;

import java.io.File;

public interface Const {
    String APPLICATION_CLOSED = "application closed";

    public static final String TXT_FOLDER = System.getProperty("user.dir") + File.separator + "text" + File.separator;
}
