package jsonsolution.strategy.impl;

import jsonsolution.strategy.Printer;

public class ConsoleOutputStrategy implements Printer {
    @Override
    public void output(String lineToOutput) {
        System.out.println(lineToOutput);
    }
}
