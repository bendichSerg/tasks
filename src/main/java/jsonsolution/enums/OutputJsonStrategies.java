package jsonsolution.enums;

import jsonsolution.strategy.PrintJsonStrategy;
import jsonsolution.strategy.impl.ConsoleOutputStrategy;
import jsonsolution.strategy.impl.FileOutputStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OutputJsonStrategies {
    CONSOLE_OUTPUT_STRATEGY("console", new ConsoleOutputStrategy()),
    FILE_OUTPUT_STRATEGY("file", new FileOutputStrategy());
    private final String outputStrategy;
    private final PrintJsonStrategy object;

    public static PrintJsonStrategy getStrategyByName(String nameStrategy) {
        for (OutputJsonStrategies outputJsonStrategies : values()) {
            if (outputJsonStrategies.getOutputStrategy().equals(nameStrategy)) {
                return outputJsonStrategies.object;
            }
        }

        throw new IllegalArgumentException("Uncorrect name");
    }

}


