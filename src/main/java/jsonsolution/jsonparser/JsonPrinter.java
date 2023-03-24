package jsonsolution.jsonparser;
import jsonsolution.dto.UserDto;
import jsonsolution.enums.OutputJsonStrategies;
import jsonsolution.strategy.PrintJsonStrategy;

public class JsonPrinter {
    public void printJsonFromDto(UserDto userDto, String arg) {
        PrintJsonStrategy printJsonStrategy = OutputJsonStrategies.getStrategyByName(arg);
        printJsonStrategy.output(userDto.getIp());
    }
}
