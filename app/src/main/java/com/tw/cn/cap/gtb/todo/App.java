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

    public List<String> run() throws IOException {
        List<String> list = new ArrayList<>();
        list.add("# To be done");
        list.addAll(Files.readAllLines(Constants.TASKS_FILE_PATH));
        return list;
    }
}

