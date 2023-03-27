package jsonsolution.jsonparser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class UrlConnection {
    private static final String JSON_ADDRESS = "https://api.ipify.org/?format=json";

    public Document connect() {
        Document doc = null;
        try {
            doc = Jsoup.connect(JSON_ADDRESS).ignoreContentType(true).get();
        } catch (IOException e) {
            System.out.println("Error url connection:\n" + e.getMessage());
        }
        return doc;
    }
}
