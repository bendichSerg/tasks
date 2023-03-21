package jsonsolution.jsonoutput;

import jsonsolution.jsonoutput.printstrategy.PrintJsonStrategy;

public class ConsoleOutputStrategy implements PrintJsonStrategy {

    @Override
    public void output(String json) {
        System.out.println(json);
    }
}
