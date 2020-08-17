package practice2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class UseReflection {

  private String fqcn;
  private String bootMethod;

  public UseReflection(String fqcn, String bootMethod) {
    this.fqcn = fqcn;
    this.bootMethod = bootMethod;
  }

  public void classinfo() {

    try {
      // リフレクション:Classクラス
      Class<?> cInfo = Class.forName(this.fqcn);
      System.out.println(cInfo.getSimpleName());
      System.out.println(cInfo.getName());
      System.out.println(cInfo.getSuperclass());

      // getMethod
      Method[] ms = cInfo.getDeclaredMethods();
      for (Method i : ms) {
        System.out.println(i.getName());
        if (i.getName() == "main") {
          System.out.println("★have main★");
        }
      }
      System.out.println("★★★Start:getConstructor★★★");

      // getConstructor
      Constructor<?>[] cs = cInfo.getConstructors();
      for (Constructor i : cs) {
        System.out.println(i.getName());
      }
      System.exit(0);

    } catch (ClassNotFoundException e) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
      System.out.println(e.getMessage());
      System.exit(1);
    }

  }

}
