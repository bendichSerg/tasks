import jsonsolution.dto.UserDto;
import jsonsolution.jsonparser.JsonPrinter;
import jsonsolution.jsonparser.JsonSaver;

public class Main {
    public static void main(String[] args) {
        JsonSaver jsonSaver = new JsonSaver();
        UserDto userDto = jsonSaver.connectAndSaveJson();
        JsonPrinter jsonPrinter = new JsonPrinter();
        jsonPrinter.printJsonFromDto(userDto, args[1]);
    }
}
