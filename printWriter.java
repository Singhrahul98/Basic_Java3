package com.samplepage.Relevel.AnjaliJava;


import java.io.PrintWriter;

public class printWriter {
    public static void main(String[] args) {
        //To write a stream on console with or without add line breaks
        PrintWriter printWriter = new PrintWriter(System.out);
            printWriter.write("This is first line.");
            printWriter.println();
            printWriter.write("This is second line.");
            printWriter.println();
            printWriter.write("This is third line.");
            printWriter.flush();
            printWriter.close();
        }

    }

