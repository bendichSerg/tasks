package jsonsolution.jsonoutput;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import jsonsolution.dto.UserDto;
import jsonsolution.jsonoutput.printstrategy.PrintJsonStrategy;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStrategy implements PrintJsonStrategy {
    private static final String FILE_NAME = "output.json";

    public UserDto convertJsonToDto(String json) {
        UserDto userDto = null;
        try {
            userDto = new Gson().fromJson(json, UserDto.class);
        } catch (JsonSyntaxException e) {
            System.out.println(e.getMessage() + "\nError mapping json in dto");
        }
        return userDto;
    }

    @Override
    public void output(String json) {
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
            writer.write(json);
            UserDto userDto = convertJsonToDto(json);
            System.out.println(userDto.getIp());
        } catch (IOException e) {
            e.printStackTrace(); //посмотреть про вывод и try catch
        }
    }
}
