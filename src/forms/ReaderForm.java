package src.forms;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReaderForm {
    public static void readQuestions(){
        Path path = Paths.get("src/forms/forms.txt");
        try(BufferedReader br = Files.newBufferedReader(path)){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readQuestions();

    }
}
