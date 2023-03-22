package jsonsolution.jsonoutput.strategyinterface.impl;

import jsonsolution.jsonoutput.strategyinterface.PrintJsonStrategy;

public class ConsoleOutputStrategy implements PrintJsonStrategy {
    @Override
    public void output(String json) {
        System.out.println(json);
    }
}
