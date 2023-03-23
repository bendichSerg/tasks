package jsonsolution.urljsonparser;

import com.google.gson.Gson;
import jsonsolution.dto.UserDto;
import jsonsolution.enums.JsonEnumStrategy;

public class JsonPrinter {

    public void printJson(UserDto userDto, String arg) {
        String json = new Gson().toJson(userDto, String.class);
        JsonEnumStrategy outputStrategy;
        outputStrategy = JsonEnumStrategy.getStrategyByName(arg);
        outputStrategy.getObject().output(json);
    }
}
