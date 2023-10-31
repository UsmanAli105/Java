package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String content;
        try {
            String filePath = "C:\\Users\\syedusman.alibukhari\\IdeaProjects\\JSON Reader\\src\\main\\java\\org\\example\\response.json";
            content = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
            ObjectMapper objectMapper = new ObjectMapper();
            Response person = objectMapper.readValue(content, Response.class);
            System.out.println(person.getReport().getRoot().getIndividualDetail());
            System.out.println(person.getReport().getRoot().getIndividualDetail());
            System.out.println(person.getReport().getRoot().getIndividualDetail());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}