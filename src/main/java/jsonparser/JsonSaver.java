package jsonparser;

import com.google.gson.Gson;
import dto.AddressDto;

public class JsonSaver {

    public AddressDto connectAndSaveJson() {
        UrlConnection urlConnection = new UrlConnection();
        String jsonLine = urlConnection.getDoc().body().text();
        return new Gson().fromJson(jsonLine, AddressDto.class);
    }
}
