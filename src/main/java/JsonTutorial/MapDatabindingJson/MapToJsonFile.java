package JsonTutorial.MapDatabindingJson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToJsonFile {
    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();

            Map<String, Object> map = new HashMap<>();
            map.put("name", "sskim");
            map.put("age", 27);

            List<Object> list = new ArrayList<>();
            list.add("msg1");
            list.add("msg2");
            list.add("msg3");

            map.put("messages", list);

            //JSON을 파일에 작성
            mapper.writeValue(new File("/Users/sskim/Downloads/maptofilejson.json"),map);

        }catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
