package designPatterns.abstractFactory.listfactory;

import designPatterns.abstractFactory.factory.Tray;

public class ListTray extends Tray{


  public ListTray(String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    // TODO 自動生成されたメソッド・スタブ
    return "makeHTMLListTray";
  }

}
