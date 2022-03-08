/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.advanced.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TestFile {
//    File

    static String inFilePath = "C:\\Users\\EMAM\\Desktop\\New_folder\\input.txt";
    static String outFilePath = "C:\\Users\\EMAM\\Desktop\\New_folder\\output.txt";

    public static void main(String[] args) throws IOException {
        File inFile = new File(inFilePath);
        File outFile = new File(outFilePath);
        System.setIn(new FileInputStream(inFile));
        System.setOut(new PrintStream(outFile));

        List lines = Files.readAllLines(Path.of(inFilePath));
        System.out.println(lines);
    }
}


