package jsonsolution.enums;

import jsonsolution.strategy.PrintJsonStrategy;
import jsonsolution.strategy.impl.ConsoleOutputStrategy;
import jsonsolution.strategy.impl.FileOutputStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum JsonEnumStrategy {
    CONSOLE_OUTPUT_STRATEGY("console", new ConsoleOutputStrategy()),
    FILE_OUTPUT_STRATEGY("file", new FileOutputStrategy());
    private final String outputStrategy;
    private final PrintJsonStrategy object;

    public static JsonEnumStrategy getStrategyByName(String nameStrategy) {
        for (JsonEnumStrategy tmpPrintJsonStrategy : values()) {
            if (tmpPrintJsonStrategy.getOutputStrategy().equals(nameStrategy)) {
                return tmpPrintJsonStrategy;
            }
        }

        throw new IllegalArgumentException("Uncorrect name");
    }

}


