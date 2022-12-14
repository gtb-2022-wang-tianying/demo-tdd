package com.tw.cn.cap.gtb.todo;

import java.nio.file.Path;
import java.nio.file.Paths;

 public class Constants {
     private Constants (){}
    public static final String TODO_ROOT_PATH = ".todo";
    public static final String USER_HOME_PATH = System.getProperty("user.home");
    public static final String TASKS_FILENAME = "tasks";
    public static final Path TASKS_FILE_PATH = Paths.get(USER_HOME_PATH, TODO_ROOT_PATH, TASKS_FILENAME);
}