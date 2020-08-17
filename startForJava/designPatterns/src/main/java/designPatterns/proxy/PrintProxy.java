package designPatterns.proxy;

import java.lang.reflect.InvocationTargetException;

public class PrintProxy implements Printable {
  private String name;
  private Printable real;
  private String classname;

  public PrintProxy() {
  }

  public PrintProxy(String name, String classname) {
    this.name = name;
    this.classname = classname;
  }

  @Override
  public synchronized void setPrinterName(String name) {
    if (real != null) {
      real.setPrinterName(name);
    }
    this.name = name;
  }

  @Override
  public String getPrinterName() {
    return name;
  }

  @Override
  public void print(String string) {
    realize();
    try {
      real.print(string);
    } catch (IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
    }
  }

  @SuppressWarnings("deprecation")
  private synchronized void realize() {
    if (real == null) {
      try {
        // リフレクションを用いたインスタンスの生成
        Class cl = Class.forName(classname);
        real = (Printable)cl.newInstance();

        //real = (Printable)Class.forName(classname).newInstance();
        real.setPrinterName(name);
      } catch (ClassNotFoundException e) {
        // TODO 自動生成された catch ブロック
        System.err.println("クラス" + classname + "が見つかりません。");
        e.printStackTrace();
      } catch (InstantiationException | IllegalAccessException e) {
        // TODO 自動生成された catch ブロック
        e.printStackTrace();
      }
    }
  }

}
