import jsonsolution.dto.UserDto;
import jsonsolution.urljsonparser.JsonPrinter;
import jsonsolution.urljsonparser.JsonSaver;

public class Main {
    public static void main(String[] args) {
        JsonSaver jPars = new JsonSaver();
        UserDto userDto = jPars.connectAndSaveJson();
        JsonPrinter jsonPrinter = new JsonPrinter();
        jsonPrinter.printJson(userDto, args[1]);

    }
}
