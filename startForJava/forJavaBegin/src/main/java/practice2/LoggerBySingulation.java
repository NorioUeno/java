package practice2;

import java.io.FileWriter;
import java.io.IOException;
import practice.Time;

public final class LoggerBySingulation {

   //singleton シングルトン用のインスタンスとコンストラクタ
  private static LoggerBySingulation theInstance;
  private LoggerBySingulation() {}

  // file Path
  private static String logfile = "/Users/aa572057/Documents/GitHub/testJavaFirst/startForJava/forJavaBegin/logerr.txt";
  // 改行コード取得
  final String BR = System.getProperty("line.separator");


  /**
   * @param logmsg
   * @throws IOException
   */
  public void log(String logmsg) throws IOException {
    // logfile filewrite
    FileWriter fw = new FileWriter(logfile, true); // 上書き
    fw.write(Time.getDate().toString() + ":" + logmsg + BR);
    fw.flush();
    fw.close();

  }

  public static LoggerBySingulation getInstance() {
    if (theInstance == null) {
      theInstance = new LoggerBySingulation();
    }
    return theInstance;

  }

}
