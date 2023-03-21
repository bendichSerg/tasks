package json_solution.data_work;

import json_solution.data_work.print_strategy.PrintJsonStrategyInterface;

public class KeyboardOutputStrategy implements PrintJsonStrategyInterface {

    @Override
    public void output(String json) {
        System.out.println(json);
    }
}
