package main.java.saturnaliam.convcommits;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.lang.Object;
import java.lang.Class;

public class Main {
    public static void main(String[] args) {
        try {
            CommitTag[] tags = readCommitTags("hi.json");
            System.out.println(tags[0].tagDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static CommitTag[] readCommitTags(String filename) throws IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            CommitTag[] tags = mapper.readValue(new File(filename), CommitTag[].class);
            return tags;
        } catch (IOException e) {
            throw e;
        }
    }
}