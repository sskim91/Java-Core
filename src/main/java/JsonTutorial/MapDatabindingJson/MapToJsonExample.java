package JsonTutorial.MapDatabindingJson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapToJsonExample {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = "";

            Map<String, Object> map = new HashMap<>();
            map.put("name", "sskim");
            map.put("age", 29);

            //Map을 JSON 문자열로 변환
            json = mapper.writeValueAsString(map);

            System.out.println(json);

            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

            System.out.println(json);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
