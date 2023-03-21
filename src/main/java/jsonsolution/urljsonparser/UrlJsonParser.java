package jsonsolution.urljsonparser;

import jsonsolution.jsonoutput.ConsoleOutputStrategy;
import jsonsolution.jsonoutput.FileOutputStrategy;
import jsonsolution.jsonoutput.printstrategy.PrintJsonStrategy;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Objects;

public class UrlJsonParser {
    private PrintJsonStrategy outputStrategy;

    public Document urlConnection(String url) {
        Document doc = null;
        try {
            doc = Jsoup.connect(url).ignoreContentType(true).get();
        } catch (HttpStatusException e) {
            System.out.println(e.getMessage() + "\nError url connection");
        } catch (IOException e) {
            throw new RuntimeException(e);
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

        chooseDataOutputStrategy(arg);

        outputStrategy.output(json);
    }
}
