package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        try {
            byte[] bytes = Files.readAllBytes(new File(args[0]).toPath());
            String s = Base64.getEncoder().encodeToString(bytes);
            System.out.println(s);
        } catch (IOException e) {
            System.out.println("Can't find file on " + args[0]);
        }
    }
}