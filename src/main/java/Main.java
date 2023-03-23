import jsonsolution.urljsonparser.JsonSaver;

public class Main {
    public static void main(String[] args) {
        JsonSaver jPars = new JsonSaver();
        jPars.connectAndSaveJson(args[1]);
    }
}
