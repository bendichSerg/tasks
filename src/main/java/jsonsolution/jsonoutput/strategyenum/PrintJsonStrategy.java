package jsonsolution.jsonoutput.strategyenum;

import jsonsolution.jsonoutput.strategyinterface.impl.ConsoleOutputStrategy;
import jsonsolution.jsonoutput.strategyinterface.impl.FileOutputStrategy;

public enum PrintJsonStrategy implements jsonsolution.jsonoutput.strategyinterface.PrintJsonStrategy {
    CONSOLE_OUTPUT_STRATEGY("console") {
        public void output(String json) {
            ConsoleOutputStrategy consoleOutputStrategy = new ConsoleOutputStrategy();
            consoleOutputStrategy.output(json);
        }
    },
    FILE_OUTPUT_STRATEGY("file") {
        public void output(String json) {
            FileOutputStrategy fileOutputStrategy = new FileOutputStrategy();
            fileOutputStrategy.output(json);
        }
    };
    private final String outputStrategy;

    public String getOutputStrategy() {
        return outputStrategy;
    }

    private PrintJsonStrategy(String arg) {
        this.outputStrategy = arg;
    }

    public static PrintJsonStrategy getStrategyByName(String nameStrategy) {
        for (PrintJsonStrategy tmpPrintJsonStrategy : values()) {
            if (tmpPrintJsonStrategy.getOutputStrategy().equals(nameStrategy)) {
                return tmpPrintJsonStrategy;
            }
        }

        throw new IllegalArgumentException("Uncorrect name");
    }

}

