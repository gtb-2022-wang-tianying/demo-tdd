package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        //change the color of main(original color is yellow)
        throw new UnsupportedOperationException();
    }

    public List<String> run() {
        List<String> lines = readTaskLines();
        List<String> list = new ArrayList<>();
        list.add("# To be done");
        list.addAll(lines);
        return list;
    }

    private List<String> readTaskLines() {
        try {
            return Files.readAllLines(Constants.TASKS_FILE_PATH);
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }
    }
}

