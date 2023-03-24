package jsonsolution.jsonoperations;

import com.google.gson.Gson;
import jsonsolution.dto.UserDto;
import jsonsolution.enums.OutputJsonStrategies;
import jsonsolution.strategy.PrintJsonStrategy;

public class JsonPrinter {
    public void printJsonFromDto(UserDto userDto, String arg) {
        String json = new Gson().toJson(userDto, String.class);
        PrintJsonStrategy printJsonStrategy = OutputJsonStrategies.getStrategyByName(arg);
        printJsonStrategy.output(json);
    }
}
