package designPatterns.abstractFactory.factory;

public abstract class Factory {

  public static Factory getfactory(String classname) {
    Factory factory = null;
    try {
      // use reflection リフレクション
      factory = (Factory) Class.forName(classname).newInstance();
    } catch (ClassNotFoundException e) {
      System.err.println("クラス" + classname + "がみつかりません。");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return factory;
  }

  public abstract Link createLink(String caption, String url);

  public abstract Tray createTray(String caption);

  public abstract Page createPage(String title, String author);

}
