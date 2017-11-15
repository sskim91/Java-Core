package JsonTutorial.MapDatabindingJson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonToMapExample {
    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();
            String json = "{\"name\":\"sskim\", \"age\":27}";

            Map<String, Object> map = new HashMap<>();

            //JSON 문자열을 Map으로 변환
            map = mapper.readValue(json, new TypeReference<Map<String, String>>(){});

            System.out.println(map);
        } catch (JsonGenerationException e) {
            e.printStackTrace();

        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
