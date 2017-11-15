package JsonTutorial.MapDatabindingJson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class JsonFileToMap {
    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();

            //파일로부터 JSON을 읽어들인다.
            Map<String, Object> map = mapper.readValue(
                    new File("/Users/sskim/Downloads/maptofilejson.json"),
                    new TypeReference<Map<String, Object>>(){}
            );

            ArrayList<String> list = (ArrayList<String>) map.get("messages");

            list.forEach(System.out::println);

        }catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
