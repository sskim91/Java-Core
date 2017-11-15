package JsonTutorial.ObjectDatabindingJson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JacksonExample {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        //For testing
        User user = createDummyUser();

        try {
            //객체를 JSON 문자열로 변환하고 파일로 직접 저장
            mapper.writeValue(new File("/Users/sskim/Downloads/user.json"), user);

            //객체를 JSON 문자여로 변환
            String jsonInString = mapper.writeValueAsString(user);
            System.out.println(jsonInString);

            //객체를 JSON 문자열로 변환하고 보기 좋게 함
            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            System.out.println(jsonInString);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static User createDummyUser() {

        User user = new User();

        user.setName("sskim");
        user.setAge(27);

        List<String> msg = new ArrayList<>();
        msg.add("hello jackson 1");
        msg.add("hello jackson 2");
        msg.add("hello jackson 3");

        user.setMessages(msg);

        return user;
    }
}
