package jsonparser;

import dto.AddressDto;
import enums.OutputStrategies;

public class JsonPrinter {
    public void printJsonFromDto(AddressDto address, String arg) {
        OutputStrategies.valueOf(arg.toUpperCase()).getOutputStrategy().output(address.getIp());
    }
}
