package designPatterns.adapter.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

  public FileProperties() {
    // TODO 自動生成されたコンストラクター・スタブ

  }

  @Override
  public void readFromFile(String filename) throws IOException {
    // TODO 自動生成されたメソッド・スタブ
    Reader reader = new FileReader(filename);
    // Properties properties = new Properties();
    load(reader);
    System.out.println(get("year"));
  }

  @Override
  public void writeToFile(String filename) throws IOException {
    // TODO 自動生成されたメソッド・スタブ
    Writer writer = new FileWriter(filename);
    store(writer, "write");
  }

  @Override
  public void setValue(String key, String value) {
    // TODO 自動生成されたメソッド・スタブ
    setProperty(key, value);

  }

  @Override
  public String getValue(String key) {
    // TODO 自動生成されたメソッド・スタブ
    return null;
  }

}
