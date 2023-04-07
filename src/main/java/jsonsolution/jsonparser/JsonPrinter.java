package jsonsolution.jsonparser;

import jsonsolution.dto.UserDto;
import jsonsolution.enums.OutputJsonStrategies;

public class JsonPrinter {
    public void printJsonFromDto(UserDto userDto, String arg) {
        OutputJsonStrategies.valueOf(arg.toUpperCase()).getObject().output(userDto.getIp());
    }
}
