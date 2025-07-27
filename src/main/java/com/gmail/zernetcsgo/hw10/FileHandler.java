package com.gmail.zernetcsgo.hw10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    private final static String BASE_PATH = "files/";

    public String writeFile(String fileName, String fileContent) {
        try (FileWriter fw = new FileWriter(BASE_PATH + fileName + ".txt")) {
            fw.write(fileContent);
            return "Success.";
        } catch (IOException e) {
            return "Failed: " + e.getMessage();
        }
    }

    public String readFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            StringBuilder sb = new StringBuilder();
            int sym;
            while ((sym = reader.read()) != -1) {
                sb.append((char) sym);
            }
            return sb.toString();
        } catch (IOException ex) {
            return "Failed to read: " + ex.getMessage();
        }
    }
}

