package practice.training.no20_2Log;

import java.io.IOException;
import java.util.Map;

public class LogAnalyzer {

  LogLoader logLoader = new LogLoader();

  public Object analyze(String file) {
    try {
      Map<String, String> rawData = logLoader.load(file);
      return doAnalyze(rawData);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      throw new AnalyzeException(e);
    }
  }

  private Object doAnalyze(Map<String, String> rawData) {

    return new Object();
  }

  static class AnalyzeException extends RuntimeException {
    public AnalyzeException(Throwable cause) {
      super(cause);
    }

  }

}
