import dto.Address;
import jsonparser.JsonPrinter;
import jsonparser.JsonSaver;

public class Main {
    public static void main(String[] args) {
        JsonSaver jsonSaver = new JsonSaver();
        Address address = jsonSaver.connectAndSaveJson();
        JsonPrinter jsonPrinter = new JsonPrinter();
        jsonPrinter.printJsonFromDto(address, args[1]);
    }
}
