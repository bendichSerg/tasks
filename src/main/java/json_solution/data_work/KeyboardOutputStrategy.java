package json_solution.data_work;

import json_solution.data_work.print_strategy.PrintJsonStrategy;

public class KeyboardOutputStrategy implements PrintJsonStrategy {

    @Override
    public void output(String json) {
        System.out.println(json);
    }
}
