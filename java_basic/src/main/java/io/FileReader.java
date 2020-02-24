package io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReader {

    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream = new BufferedReader(new java.io.FileReader("c:\\data\\in.txt"));
            outputStream = new PrintWriter(new FileWriter("c:\\data\\out.txt"));
            String line = inputStream.readLine();
            while (line != null) {
                outputStream.println(line);
                line = inputStream.readLine();
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
