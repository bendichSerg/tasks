package jsonsolution.urljsonparser;

import com.google.gson.Gson;
import jsonsolution.dto.UserDto;

public class JsonSaver {

    public UserDto connectAndSaveJson() {
        UrlConnection urlConnection = new UrlConnection();
        String json = urlConnection.connect().body().text();

        UserDto userDto = new Gson().fromJson(json, UserDto.class);
        System.out.println(userDto.getIp());

        return new Gson().fromJson(json, UserDto.class);
    }
}
