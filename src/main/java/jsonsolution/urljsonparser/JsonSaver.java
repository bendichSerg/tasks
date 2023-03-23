package jsonsolution.urljsonparser;

import jsonsolution.enums.JsonEnumStrategy;

public class JsonSaver {

    public void connectAndSaveJson(String arg) {
        UrlConnection urlConnection= new UrlConnection();
        String json = urlConnection.connect().body().text();
        JsonEnumStrategy outputStrategy;
        outputStrategy = JsonEnumStrategy.getStrategyByName(arg);
        outputStrategy.getObject().output(json);
    }
}
