package jsonsolution.jsonparser;

import com.google.gson.Gson;
import jsonsolution.dto.UserDto;

public class JsonSaver {

    public UserDto connectAndSaveJson() {
        UrlConnection urlConnection = new UrlConnection();
        String json = urlConnection.connect().body().text();
        return new Gson().fromJson(json, UserDto.class);
    }
}
