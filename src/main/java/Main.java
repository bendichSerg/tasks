import jsonsolution.urljsonparser.UrlJsonParser;

public class Main {
    private static final String JSON_ADDRESS = "https://api.ipify.org/?format=json";
    public static void main(String[] args) {
        UrlJsonParser jPars = new UrlJsonParser();
        jPars.findAndSaveJsonFromUrl(JSON_ADDRESS, args[0]);
    }
}
