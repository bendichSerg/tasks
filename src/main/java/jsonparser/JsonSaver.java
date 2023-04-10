package jsonparser;

import com.google.gson.Gson;
import dto.Address;

public class JsonSaver {

    public Address connectAndSaveJson() {
        UrlConnection urlConnection = new UrlConnection();
        String jsonLine = urlConnection.getDoc().body().text();
        return new Gson().fromJson(jsonLine, Address.class);
    }
}
