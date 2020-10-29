package practice.training.no19_6Combination;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Frameworks {

  private final String propertyFile = "framework.csv";
  private String[] frameworkValue;
  private String db;
  private String app;
  private String value;
  private static List<Framework> frameworks;

//  Constructor
  public Frameworks() {
    try {

      InputStream is = new FileInputStream(propertyFile);
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader reader = new BufferedReader(isr);

      String line;
      frameworks = new ArrayList<Framework> ();

      try {
        while((line = reader.readLine()) != null) {
          frameworkValue = line.split(",");
          frameworks.add(
              FrameworkFactory.create(frameworkValue[0], frameworkValue[1], frameworkValue[2])
              );
        }
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }


  public static boolean isSupport(ApplicationServer as, DataBase db) {

    boolean result = false;
    for (Framework f : frameworks) {

      if ((f.getApp().equals(as.toString()))
          && (f.getDb().equals(db.toString()))
          ) {
        System.out.println("Request data exits in framework Combination list! app : " +as.toString() + "db : " + db.toString());
        return Boolean.valueOf(f.getValue());
      }
    }
    return result;

  }

  public List<Framework> getFrameworks() {
    return frameworks;
  }


  public void setFrameworks(List<Framework> frameworks) {
    this.frameworks = frameworks;
  }
}
