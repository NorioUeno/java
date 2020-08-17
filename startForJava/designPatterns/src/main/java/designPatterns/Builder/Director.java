package designPatterns.Builder;

public class Director {

  private Builder builder;

  public Director(Builder builder) {

    this.builder = builder;

  }

  public void construct() { // 文章構築
    builder.makeString("朝からひるにかけて"); // 文字列
    builder.makeTitle("Greeting"); // タイトル
    builder.makeString("朝からひるにかけて"); // 文字列
    builder.makeItems(new String[] { "おはよう御座います", "こんにちは" });
    builder.makeString("夜に");
    builder.makeItems(new String[] { "こんばんは", "おやすみなさい", "さようなら" });
    builder.close();
  }

}
