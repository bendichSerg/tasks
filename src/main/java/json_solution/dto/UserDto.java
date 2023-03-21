package json_solution.dto;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class UserDto {
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public static UserDto convertJsonToDto(String json) {
        UserDto userDto = null;
        try {
            userDto = new Gson().fromJson(json, UserDto.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return userDto;
    }

}
