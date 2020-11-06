package practice.training.no20_2NetworkResources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class NetworkLoader {

  private final String fileName = "networkLoader.txt";

  public InputStream getInput() {

    try {
      InputStream is = new FileInputStream(fileName);
      return is;
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return null;

  }

}
