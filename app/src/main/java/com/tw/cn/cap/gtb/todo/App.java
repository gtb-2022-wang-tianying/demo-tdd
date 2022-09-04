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

    public List<String> run() throws IOException {
        List<String> list = Files.readAllLines(Paths.get("E:\\gtb-2022-wang-tianying\\demo-tdd\\app\\src\\main\\java\\com\\tw\\cn\\cap\\gtb\\todo\\tasks"));
        return list;

    }
}

