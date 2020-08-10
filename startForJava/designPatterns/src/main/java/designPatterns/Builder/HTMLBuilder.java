package designPatterns.Builder;

import java.io.PrintWriter;

public class HTMLBuilder extends Builder {

  private String filename;
  private PrintWriter writer;
  public HTMLBuilder() {
    // TODO 自動生成されたコンストラクター・スタブ
  }

  @Override
  public void makeTitle(String title) {
    // TODO 自動生成されたメソッド・スタブ

  }

  @Override
  public void makeString(String str) {
    // TODO 自動生成されたメソッド・スタブ

  }

  @Override
  public void makeItems(String[] items) {
    // TODO 自動生成されたメソッド・スタブ

  }

  @Override
  public void close() {
    // TODO 自動生成されたメソッド・スタブ

  }

  public String getResult() {
    return filename;

  }

  @Override
  protected void buildTitle(String title) {
    // TODO 自動生成されたメソッド・スタブ

  }

  @Override
  protected void buildString(String str) {
    // TODO 自動生成されたメソッド・スタブ

  }

  @Override
  protected void buildItems(String[] items) {
    // TODO 自動生成されたメソッド・スタブ

  }

  @Override
  protected void buildclose() {
    // TODO 自動生成されたメソッド・スタブ

  }

}
