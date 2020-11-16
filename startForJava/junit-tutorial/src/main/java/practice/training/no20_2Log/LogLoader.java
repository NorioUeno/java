package practice.training.no20_2Log;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LogLoader {

  public Map<String, String> load(String fileName) throws IOException  {

    InputStream is = new FileInputStream(fileName);
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader reader = new BufferedReader(isr);

    return new HashMap<String, String>();

  }

}
