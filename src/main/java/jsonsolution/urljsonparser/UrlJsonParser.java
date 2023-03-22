package jsonsolution.urljsonparser;

import jsonsolution.jsonoutput.strategyenum.PrintJsonStrategy;
import lombok.Data;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


@Data
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

    public void findAndSaveJsonFromUrl(String url, String arg) {
        String json = urlConnection(url).body().text();

        outputStrategy = PrintJsonStrategy.getStrategyByName(arg);
        outputStrategy.output(json);
    }
}
