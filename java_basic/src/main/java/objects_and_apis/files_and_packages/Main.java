package objects_and_apis.files_and_packages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {


    public static void main(String[] args) {
        // write your code here
        String sourceFile = "java_basic/src/main/java/objects_and_apis/files_and_pacages/files/loremipsum.txt";
        String targetFile = "java_basic/src/main/java/objects_and_apis/files_and_pacages/files/target.txt";
//        readerAndWriter(sourceFile,targetFile);

        Path sourceFilePath = Paths.get("java_basic/src/main/java/objects_and_apis/files_and_pacages/files/", "loremipsum.txt");
        Path targetFilePath = Paths.get("java_basic/src/main/java/objects_and_apis/files_and_pacages/files/", "target.txt");

        try {
            Files.copy(sourceFilePath,targetFilePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readerAndWriter(String sourceFile, String targetFile) {



        try (
                FileReader fileReader = new FileReader(sourceFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(targetFile);
        ) {
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                fileWriter.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
