package practice.section7TestFixture.mockit;

import java.util.HashMap;
import java.util.Map;

public class Service {

  private Map contents = new HashMap();

  public Service() {
    genContents();
  }

  public String getContentById(Object id) {
    String content;
    content = (String) contents.get(id);
    return content;
  }

  public void genContents() {
    for (int i = 0; i < 10; i++) {
      contents.put(i, "content:"+i);
    }
  }

}
