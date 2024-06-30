package com.javarush.rogulenko.cryptoanalizer.entity;

import com.javarush.rogulenko.cryptoanalizer.exceptions.FileProcessingException;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.List;

public class FilenameValidator {
    public static final List<String> FORBIDDEN_DIRS_FILES = List.of(".bash_history", ".bash_profile", "etc", "proc");

    public static final String SYSTEM_SEPARATOR = System.getProperty("file.separator");

    private Path validatePath(String filename){
        for(String pathPart : filename.split(SYSTEM_SEPARATOR)){
            if(FORBIDDEN_DIRS_FILES.contains(pathPart)){
                throw new FileProcessingException("Path contains forbidden part: " + pathPart);
            }
        }

        try {
            return Path.of(filename);
        } catch (InvalidPathException e) {
            throw new FileProcessingException("Invalid path.Reason" + e.getMessage(), e);
        }
    }

    public void validateForWriting(String filename) {
        Path path = validatePath(filename);

        if(Files.exists(path)){
            if(Files.isDirectory(path)){
                throw new FileProcessingException("File" + path + " is a directory");
            }

            if(Files.isWritable(path)){
                throw new FileProcessingException("File" + path + " is not accessible for writing");
            }
        }
    }

    public void validateForReading(String filename) {
        Path path = validatePath(filename);

        if(Files.notExists(path)){
            throw new FileProcessingException("File doesn't exist");
        }
        if(Files.isDirectory(path)){
            throw new FileProcessingException("File is a directory");
        }

        if(!Files.isReadable(path)){
            throw new FileProcessingException("You don't have permission to read file");
        }

    }
}
