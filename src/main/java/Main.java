import jsonsolution.dto.UserDto;
import jsonsolution.jsonoperations.JsonPrinter;
import jsonsolution.jsonoperations.JsonSaver;

public class Main {
    public static void main(String[] args) {
        JsonSaver jsonSaver = new JsonSaver();
        UserDto userDto = jsonSaver.connectAndSaveJson();
        JsonPrinter jsonPrinter = new JsonPrinter();
        jsonPrinter.printJsonFromDto(userDto, args[1]);

    }
}
