import jsonsolution.urljsonparser.UrlJsonParser;

public class Main {
    public static void main(String[] args) {
        System.out.println(args[1]);
        String jsonAddress = "https://api.ipify.org/?format=json";
        UrlJsonParser jPars = new UrlJsonParser();
        jPars.findAndSaveJsonFromUrl(jsonAddress, args[1]);
    }
}
