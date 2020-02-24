package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationNIO2 {
    public static void main(String[] args) throws IOException {
        Path src = Paths.get("c:\\data\\1.txt");
        System.out.println(src.getFileName() + " in " + src.getFileSystem());
        System.out.println(src.getRoot());

        for (Path element : src) {
            System.out.println(element);
        }

        Path patDirectory = Paths.get("c:\\data\\newdir");
//        Path newDir= Files.createDirectory(patDirectory);

        System.out.println(Files.isReadable(patDirectory));
        System.out.println(Files.isWritable(patDirectory));
        System.out.println(Files.isExecutable(patDirectory));

        Files.deleteIfExists(patDirectory);

    }

}
