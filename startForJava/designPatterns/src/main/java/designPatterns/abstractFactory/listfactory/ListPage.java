package designPatterns.abstractFactory.listfactory;

import designPatterns.abstractFactory.factory.Page;

public class ListPage extends Page{

  public ListPage(String title,String author) {
    super(title,author);
  }

  @Override
  public String makeHTML() {
    // TODO 自動生成されたメソッド・スタブ
    return "makeHTML:ListPage";
  }

}
