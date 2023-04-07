package jsonsolution.jsonparser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

@Getter
@AllArgsConstructor
public class UrlConnection {
    private Document doc = null;
    private static final String JSON_ADDRESS = "https://api.ipify.org/?format=json";

    UrlConnection() {
        try {
            doc = Jsoup.connect(JSON_ADDRESS).ignoreContentType(true).get();
        } catch (IOException e) {
            System.err.println("Error url connection, please connect:\n" + e.getMessage());
        }
    }
}
