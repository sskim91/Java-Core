package JsonTutorial.GsonExample;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GsonJavaObejctToJson {
    public static void main(String[] args) {

        Staff staff = createDummyObject();

        //JSON 문자열로 객체 변환
        Gson gson = new Gson();
        String json = gson.toJson(staff);
        System.out.println(json);

        //객체를 JSON 문자열로 변환하고 파일에 직접 저장
        try (FileWriter writer = new FileWriter("/Users/sskim/Downloads/gsontojson.json")) {
            gson.toJson(staff, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Staff createDummyObject() {

        Staff staff = new Staff();

        staff.setName("sskim");
        staff.setAge(27);
        staff.setPosition("worker");
        staff.setSalary(new BigDecimal("10000"));

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("python");
        skills.add("ruby");

        staff.setSkills(skills);

        return staff;
    }
}
