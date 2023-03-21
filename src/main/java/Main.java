import json_solution.json_parser.JsonParser;

public class Main {
    public static void main(String[] args) {
        String jsonAddress = "https://api.ipify.org/?format=json";
        JsonParser jPars = new JsonParser();
        jPars.findJsonSolution(jsonAddress);

    }

}
