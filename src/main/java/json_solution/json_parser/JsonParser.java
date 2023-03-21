package json_solution.json_parser;

import json_solution.data_work.FileOutputStrategy;
import json_solution.data_work.KeyboardOutputStrategy;
import json_solution.data_work.print_strategy.PrintJsonStrategy;
import json_solution.dto.UserDto;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class JsonParser {
    PrintJsonStrategy outputStrategy;

    public Document jsonParsingFile(String nameFile) {
        Document doc = null;
        try {
            doc = Jsoup.connect(nameFile).ignoreContentType(true).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    public void saveJson(String json) {
        System.out.println("Write f for print in file, k - for print on keyboard");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        if (Objects.equals(input, "f")) {
            outputStrategy = new FileOutputStrategy();
        } else if (Objects.equals(input, "k")) {
            outputStrategy = new KeyboardOutputStrategy();
        }
        outputStrategy.output(json);
    }

    public void findJsonSolution(String jsonAddress) {
        String json = jsonParsingFile(jsonAddress).body().text();
        UserDto userDto = UserDto.convertJsonToDto(json);
        System.out.println(userDto.getIp());
        saveJson(json);
    }
}
