package jsonsolution.strategy.impl;

import jsonsolution.strategy.PrinterStrategy;

public class ConsoleOutputStrategy implements PrinterStrategy {
    @Override
    public void output(String lineToOutput) {
        System.out.println(lineToOutput);
    }
}
