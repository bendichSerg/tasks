package jsonsolution.jsonoutput.strategyenum;

import java.io.FileWriter;
import java.io.IOException;

public enum PrintJsonStrategy implements jsonsolution.jsonoutput.strategyinterface.ConsoleOutputStrategy {
    CONSOLE_OUTPUT_STRATEGY("console") {
        @Override
        public void output(String json) {
            System.out.println(json);
        }
    },
    FILE_OUTPUT_STRATEGY("file") {
        @Override
        public void output(String json) {
            try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
                writer.write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };
    private static final String FILE_NAME = "output.json";
    private final String outputStrategy;

    public String getOutputStrategy() {
        return outputStrategy;
    }

    private PrintJsonStrategy(String arg) {
        this.outputStrategy = arg;
    }

    public static PrintJsonStrategy getStrategyByName(String nameStrategy){
        for(PrintJsonStrategy tmpPrintJsonStrategy : values()){
            if(tmpPrintJsonStrategy.getOutputStrategy().equals(nameStrategy)){
                return tmpPrintJsonStrategy;
            }
        }

        throw new IllegalArgumentException("Uncorrect name");
    }


}

