package jsonsolution.urljsonparser;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import jsonsolution.jsonoutput.ConsoleOutputStrategy;
import jsonsolution.jsonoutput.FileOutputStrategy;
import jsonsolution.jsonoutput.printstrategy.PrintJsonStrategy;
import jsonsolution.dto.UserDto;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Objects;

public class UrlJsonParser {
    private PrintJsonStrategy outputStrategy;

    public UserDto convertJsonToDto(String json) {
        UserDto userDto = null;
        try {
            userDto = new Gson().fromJson(json, UserDto.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return userDto;
    }

    public Document urlConnection(String url) {
        Document doc = null;
        try {
            doc = Jsoup.connect(url).ignoreContentType(true).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    public void chooseDataOutputStrategy(String arg) {
        if (Objects.equals(arg, "file")) {
            outputStrategy = new FileOutputStrategy();
        } else if (Objects.equals(arg, "console")) {
            outputStrategy = new ConsoleOutputStrategy();
        }
    }

    public void findAndSaveJsonFromUrl(String url, String arg) {
        String json = urlConnection(url).body().text();

        UserDto userDto = convertJsonToDto(json);
        System.out.println(userDto.getIp());

        chooseDataOutputStrategy(arg);

        outputStrategy.output(json);
    }
}
