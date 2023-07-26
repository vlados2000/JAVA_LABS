package com.qa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class MyConsoleReader {
    public void readInputPrint() {
        StringBuffer buffer = new StringBuffer();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Enter a line of text or 'stop'");
            String line = br.readLine();

            while(!line.equals("stop")) {
                buffer.append(line);
                buffer.append("\n");

                System.out.println("Enter a line of text or 'stop'");
                line = br.readLine();
            }
            System.out.println(buffer);

        } catch (IOException ex) {
            System.out.println("ERROR reading input :" + ex);
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        MyConsoleReader reader = new MyConsoleReader();
        reader.readInputPrint();
    }

}
