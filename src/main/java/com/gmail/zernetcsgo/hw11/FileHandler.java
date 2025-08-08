package com.gmail.zernetcsgo.hw11;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    public String createFile(String path) {
        try {
            Path newFile = Files.createFile(Path.of(path));
            return "Created " + newFile;
        } catch (FileAlreadyExistsException e) {
            return "File already exists!";
        } catch (IOException e) {
            return "Something wrong: " + e.getMessage();
        }
    }

    public String writeToFile(Path path, String content) {
        try {
            Files.writeString(path, content);
            return "Recorded in " + path;
        } catch (IOException e) {
            return "Something wrong: " + e.getMessage();
        }
    }

    public String readFromFile(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            return "Something wrong: " + e.getMessage();
        }
    }
}

