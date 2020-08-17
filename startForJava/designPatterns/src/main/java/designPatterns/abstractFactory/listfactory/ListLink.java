package designPatterns.abstractFactory.listfactory;

import designPatterns.abstractFactory.factory.Link;

public class ListLink extends Link{

  public ListLink(String caption, String url) {
    super(caption,url);
  }

  @Override
  public String makeHTML() {
    // TODO 自動生成されたメソッド・スタブ
    return "<li><a href=¥" + url + "aaaa";
  }

}
