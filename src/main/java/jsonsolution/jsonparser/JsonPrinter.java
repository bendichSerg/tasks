package jsonsolution.jsonparser;

import jsonsolution.dto.UserDto;
import jsonsolution.enums.OutputStrategies;

public class JsonPrinter {
    public void printJsonFromDto(UserDto userDto, String arg) {
        OutputStrategies.valueOf(arg.toUpperCase()).getOutputStrategy().output(userDto.getIp());
    }
}
