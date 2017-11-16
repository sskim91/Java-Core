package JsonTutorial.GsonExample;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class GsonJsonToJavaObject {
    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Reader reader = new FileReader("/Users/sskim/Downloads/gsontojson.json")) {

            //JSON을 JAVA객체로 변환
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println(staff);

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*TypeToken을 사용하여 JSON 배열을 리스트로 변환
         *
         *  String json = "[{\"name\":\"sskim\"}, {\"name\":\"27\"}]";
            List<Staff> list = gson.fromJson(json, new TypeToken<List<Staff>>(){}.getType());
            list.forEach(x -> System.out.println(x));
         *
         *
         *JSON을 Map으로 변환
         *
         *  String json = "{\"name\":\"sskim\", \"age\":27}";
            Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>(){}.getType());
            map.forEach((x,y)-> System.out.println("key : " + x + " , value : " + y));
         */
    }
}
