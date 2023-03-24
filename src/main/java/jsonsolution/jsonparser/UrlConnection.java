package jsonsolution.jsonparser;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

@Slf4j
public class UrlConnection {
    private static final String JSON_ADDRESS = "https://api.ipify.org/?format=json";

    public Document connect() {
        Document doc = null;
        try {
            doc = Jsoup.connect(JSON_ADDRESS).ignoreContentType(true).get();
        } catch (IOException e) {
            log.error("Error url connection:\n", e);
        }
        return doc;
    }
}
