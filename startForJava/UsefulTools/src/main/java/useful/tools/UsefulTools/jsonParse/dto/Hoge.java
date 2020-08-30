
package useful.tools.UsefulTools.jsonParse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hoge {

  @JsonProperty("id")
  public int id;

  @JsonProperty("name")
  public String name;

  @Override
  public String toString() {
    return "Hoge [id=" + id + ", name=" + name + "]";
  }
}
