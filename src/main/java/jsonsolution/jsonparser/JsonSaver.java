package jsonsolution.jsonparser;

import com.google.gson.Gson;
import jsonsolution.dto.UserDto;

public class JsonSaver {

    public UserDto connectAndSaveJson() {
        UrlConnection urlConnection = new UrlConnection();
        String jsonLine = urlConnection.connect().body().text();
        return new Gson().fromJson(jsonLine, UserDto.class);
    }
}
