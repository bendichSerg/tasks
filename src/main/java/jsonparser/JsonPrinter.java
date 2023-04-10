package jsonparser;

import dto.Address;
import enums.OutputStrategies;

public class JsonPrinter {
    public void printJsonFromDto(Address address, String arg) {
        OutputStrategies.valueOf(arg.toUpperCase()).getOutputStrategy().output(address.getIp());
    }
}
