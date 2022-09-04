package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //change the color of main(original color is yellow)
        throw new UnsupportedOperationException() ;
    }

    public List<String> run() {
        try {
            return Files.readAllLines(Paths.get("/Users/Dell/.todo/tasks")) ;
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }
    }
}
