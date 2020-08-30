package useful.tools.UsefulTools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import useful.tools.UsefulTools.jsonParse.dto.ApiCommonRes;
import useful.tools.UsefulTools.jsonParse.dto.Validations;
import useful.tools.UsefulTools.jsonParse.service.JsonServices;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) throws IOException {
    System.out.println("★★★Start Main★★★");

    Validations validations = new Validations();
    validations.setCode("id1");
    validations.setField("XX");
    validations.setMessage("error!");

    List<Validations> list = new ArrayList<Validations>();
    Validations validations1 = new Validations();
    validations1.setCode("list1");
    validations1.setField("XX");
    validations1.setMessage("List1");

    Validations validations2 = new Validations();
    validations2.setCode("list2");
    validations2.setField("XX");
    validations2.setMessage("List2");

    list.add(validations1);
    list.add(validations2);

    ApiCommonRes<String, String> acr = new ApiCommonRes<String, String>();
    acr.setCode("AMEM001R001");
    acr.setComponent("契約SC");
    acr.setValidations(validations);
    acr.setList(list);

    String json = "{\n" + "  \"code\" : \"AMEM001R001\",\n" + "  \"aaaaa\" : \"aaa\",\n" + "  \"message\" : \"Validation Error\",\n" + "  \"component\" : \"MemberManagement\",\n" + "  \"sqlcode\" : \"\"\n" + "}";
    String jsonhoge = "[{\"id\":15, \"name\":\"hoge\"}, {\"id\":16, \"name\":\"fuga\"}]";

//    ★Call jsonServeices
    JsonServices.readJson(jsonhoge);
//    JsonServices.makeJson(json);
//    JsonServices.makeJson(acr);
//    JsonServices.readJsonFile("/Users/aa572057/Documents/GitHub/testJavaFirst/startForJava/UsefulTools/acnt0401_response.json");

    System.out.println("★★★End Main★★★");

  }

}
