package jsonsolution.strategy.impl;

import jsonsolution.strategy.PrintJsonStrategy;

public class ConsoleOutputStrategy implements PrintJsonStrategy {
    @Override
    public void output(String json) {
        System.out.println(json);
    }
}
