package jsonsolution.jsonoutput.strategyinterface;

public interface ConsoleOutputStrategy extends jsonsolution.jsonoutput.strategyinterface.PrintJsonStrategy{
    @Override
    public default void output(String json){
        System.out.println(json);
    }
}
