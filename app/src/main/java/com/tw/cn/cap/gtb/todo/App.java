package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class App {

    public static void main(String[] args) {
        //change the color of main(original color is yellow)
        throw new UnsupportedOperationException() ;
    }

    public List<String> run() throws IOException {
        List<String> list = Files.readAllLines(Constants.TASKS_FILE_PATH);
        return list;
    }
}

