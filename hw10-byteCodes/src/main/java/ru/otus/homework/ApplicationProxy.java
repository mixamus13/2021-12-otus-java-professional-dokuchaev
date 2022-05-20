package ru.otus.homework;

import ru.otus.homework.domain.TestLogging;
import ru.otus.homework.proxy.ProxyCustom;

public class ApplicationProxy {
    public static void main(String... args) {
        TestLogging testLogging = ProxyCustom.createMyClass();
        testLogging.calculation(6);
        testLogging.calculation(25,60);
        testLogging.calculation(44, 33, 13);
    }
}
