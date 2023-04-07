package jsonsolution.enums;

import jsonsolution.strategy.Printer;
import jsonsolution.strategy.impl.ConsoleOutputStrategy;
import jsonsolution.strategy.impl.FileOutputStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OutputStrategies {
    CONSOLE(new ConsoleOutputStrategy()),
    FILE(new FileOutputStrategy());
    private final Printer outputStrategy;
}


