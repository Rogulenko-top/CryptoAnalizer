package com.javarush.rogulenko.cryptoanalizer.entity;

import com.javarush.rogulenko.cryptoanalizer.exceptions.FileProcessingException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileProcessor {

    public static final StandardOpenOption[] FILE_WRITE_OPTIONS = {StandardOpenOption.CREATE, StandardOpenOption.WRITE};

    /**
     *
     * @param filename
     * @return
     * throws FileProcessingException
     */
    public List<String> readFile(String filename){
        try {
            Path filePath = Path.of(filename);
            return Files.readAllLines(filePath);
        } catch (IOException | InvalidPathException e) {
            throw new FileProcessingException(e.getMessage(), e);
        }
    }

    public void appendToFile(String filename, String content){
        try {
            Path filePath = Path.of(filename);
            Files.writeString(filePath, content, FILE_WRITE_OPTIONS);
        } catch (IOException e) {
            throw new FileProcessingException(e.getMessage(), e);
        }
    }
}
