package useful.tools.UsefulTools.jsonParse.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties({"code", "sqlcode"})
//@JsonIgnoreProperties(ignoreUnknown=true) //存在しないpropertyは無視するようにする。
public class ApiCommonRes<K, V> {

  @JsonProperty("code")
  private String code;

  @JsonProperty("comp.")
  private String component;

  @JsonProperty("message")
  private String message;

  @JsonProperty("sqlcode")
  private String sqlcode;

  private Map<K, V> map = new HashMap<K, V>();

  private Validations validations;

  private List<Validations> list;

//  getter setter
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setMap(K key, V value) {
    this.map.put(key, value);
  }

  public String getSqlcode() {
    return sqlcode;
  }

  public void setSqlcode(String sqlcode) {
    this.sqlcode = sqlcode;
  }

  @Override
  public String toString() {
    return "ApiCommonRes [code=" + code + ", message=" + message + ", getComponent=" + component + ", sqlcode=" + sqlcode + "]";
  }

  public Validations getValidations() {
    return validations;
  }

  public void setValidations(Validations validations) {
    this.validations = validations;
  }

  public List<Validations> getList() {
    return list;
  }

  public void setList(List<Validations> list) {
    this.list = list;
  }

}
