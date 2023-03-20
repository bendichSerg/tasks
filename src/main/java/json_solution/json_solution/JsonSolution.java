package json_solution.json_solution;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import json_solution.print_strategy.PrintJsonStrategyInterface;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class JsonSolution {

    public static String jsonParsingFile(String nameFile) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Document doc = Jsoup.connect(nameFile).ignoreContentType(true).get();
            return gson.toJson(doc.text());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nameFile;
    }

    public static void main(String[] args) throws IOException {
        String jsonAddress = "https://api.ipify.org/?format=json";
        try (FileWriter writer = new FileWriter("output.txt", false)) {
            System.out.println("Write f for print in file, k - for print on keyboard");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            if (Objects.equals(input, "f")) {
                PrintJsonStrategyInterface.fileOutput(writer, jsonParsingFile(jsonAddress));
            } else if (Objects.equals(input, "k")) {
                PrintJsonStrategyInterface.keyboardOutput(jsonParsingFile(jsonAddress));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
