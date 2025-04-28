package com.example;

import org.openjdk.jol.info.ClassLayout;

public class JOLDemo {
    public static void main(String[] args) {
        System.out.println(ClassLayout.parseClass(String.class).toPrintable());
    }
}