package designPatterns.abstractFactory.listfactory;

import designPatterns.abstractFactory.factory.Factory;
import designPatterns.abstractFactory.factory.Link;
import designPatterns.abstractFactory.factory.Page;
import designPatterns.abstractFactory.factory.Tray;

public class ListFactory extends Factory {

  @Override
  public Link createLink(String caption, String url) {
    return new ListLink(caption, url);
  }

  @Override
  public Tray createTray(String caption) {
    // TODO 自動生成されたメソッド・スタブ
    return new ListTray(caption);
  }

  @Override
  public Page createPage(String title, String author) {
    // TODO 自動生成されたメソッド・スタブ
    return new ListPage(title, author);
  }
}
