package objects_and_apis.json;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

import objects_and_apis.json.model.Flower;

public class JsonMain {
    public static void main(String[] args) throws IOException {
        String fileName = "java_basic/src/main/java/objects_and_apis/json/files/data.json";

        Gson gson = new Gson();
        try (FileReader fileReader = new FileReader(fileName);
             JsonReader reader = new JsonReader(fileReader)
        ) {
            Flower[] data = gson.fromJson(reader, Flower[].class);
            for (Flower flower :
                    data) {
                System.out.println(flower);
            }
        }

    }
}
