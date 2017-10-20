package com.saliev.yegor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Halvasan on 19.10.2017.
 */
public class JsonReadFile implements Json {

    private String jsonFileName;

    public JsonReadFile(String jsonFileName){
        this.jsonFileName = jsonFileName;
    }

    public String jsonRead() {
        Path subjectFile = Paths.get("src/main/resources/",  jsonFileName + ".json");
        String json = "";
        try {
            json = new String (Files.readAllBytes(subjectFile));
        } catch (IOException e) {
            System.out.println("cant read file" + e);
        }
        return json;
    }
}
