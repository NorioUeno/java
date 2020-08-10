package designPatterns.Builder;

public class TextBuilder extends Builder {

  private StringBuffer buffer = new StringBuffer();
  private String br = System.getProperty("line.separator");

  @Override
  public void makeTitle(String title) {
    // TODO 自動生成されたメソッド・スタブ
    buffer.append("================" + System.getProperty("line.separator"));
    buffer.append("[" + title + "]" + System.getProperty("line.separator"));
    buffer.append(br);

  }

  @Override
  public void makeString(String str) {
    // TODO 自動生成されたメソッド・スタブ
    buffer.append('■' + str + br);
    buffer.append(br);
  }

  @Override
  public void makeItems(String[] items) {
    // TODO 自動生成されたメソッド・スタブ
    for (int i = 0; i < items.length; i++) {
      buffer.append(" ・" + items[i] + br);
    }
    buffer.append(br);

  }

  @Override
  public void close() {
    // TODO 自動生成されたメソッド・スタブ
    buffer.append("================" + System.getProperty("line.separator"));

  }

  public String getResult() {
    return buffer.toString();
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
