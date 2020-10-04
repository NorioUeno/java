import practice.section7TestFixture.LruCache;

public class MainApp {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("[junit-tutorial]");

    LruCache<String, String> cashe = new LruCache<String, String>();
    cashe.put("key1", "value1");
    cashe.put("key2", "value2");
    cashe.put("key3", "value3");
    cashe.getValue("key2");
    cashe.getKey(2);

  }

}
