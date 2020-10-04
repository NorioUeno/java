package useful.tools.UsefulTools.jsonParse.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import useful.tools.UsefulTools.jsonParse.dto.Hoge;

public class JsonServices {

  public static String makeJson (Object dto) throws JsonProcessingException {

    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT); // outputのインデント
    String json = mapper.writeValueAsString(dto);

    System.out.println(json);
    System.out.println( "" );

    return json;
  }

  /**
   * json ファイル出力
   * @param json
   * @param filepath
   * @throws IOException
   */
  public static String readJsonFile (String filepath) throws IOException {

//   read json-file
    BufferedReader fr = new BufferedReader(
        new FileReader(filepath)
        );

    // json varialbes
    StringBuffer json = new StringBuffer();
//    StringBuffer json2 = new StringBuffer();

    // fileRead process
    int i = fr.read();
    while(i != -1) {
      json.append((char)i);
      i = fr.read();
    }

//    String line = null;
//    while((line = fr.readLine()) != null) {
//      json2.append(line);
//      json2.append(System.getProperty("line.separator"));
//    }

    System.out.println(json.toString());
    return json.toString();

  }

  public static void readJson (String json) throws JsonMappingException, JsonProcessingException{

    ObjectMapper mapper = new ObjectMapper();
    // JsonをマッピングしたいDTOクラスのインスタンスを生成
//    ApiCommonRes<String, String> acr = mapper.readValue(json, ApiCommonRes.class);

    // 型引数を持つクラスにデシリアライズ(hogeの部分がdto)、
    List<Hoge> list = mapper.readValue(json, new TypeReference<List<Hoge>>() {});

    System.out.println("");
    System.out.println("- ReadJson start");
//    System.out.println(acr);
    System.out.println(list);
    System.out.println(list.get(1).id);

  }



}
