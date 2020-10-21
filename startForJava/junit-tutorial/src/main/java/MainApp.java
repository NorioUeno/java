import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MainApp {

  public static void main(String[] args) throws InterruptedException, IOException {
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("[junit-tutorial]");

//    Make LRUCashe
//    LruCache<String, String> cashe = new LruCache<String, String>();
//    cashe.put("key1", "value1");
//    cashe.put("key2", "value2");
//    cashe.put("key3", "value3");
//    cashe.getValue("key2");
//    cashe.getKey(2);

//  Section 7
//    Use SnakeYaml
//    Book book;
//    Yaml yaml = new Yaml();
//    book = yaml.loadAs(ClassLoader.getSystemResourceAsStream("testFixture.yml"), Book.class);
//    System.out.println(book);

//  try (InputStream in = Files.newInputStream(input)) {
//      Yaml yaml = new Yaml();
//      User user = yaml.loadAs(in, User.class);

//    Section 11
//    Make Random
//    RandomNumberGenerator rng = new RandomNumberGeneratorImpl();
//    System.out.println("Random : " + rng.nextInt());
//
//    Randoms randoms = new Randoms();
//
////    List<String> list = new ArrayList<String>();
//    randoms.choice(new ArrayList<String>());

//    use mockit
//    Controller controller = new Controller();
//    System.out.println(controller.getContent(2));

//    training1 StringUitls toSnake
//    StringUtilsSnake sus = new StringUtilsSnake();
//    System.out.println("Regex Result : " + StringUtilsSnake.toSnakeCase("AbCdE"));

//    training6 Thread
//    final AtomicReference<String> backgroundThreadName = new AtomicReference<String>();
//    final CountDownLatch latch = new CountDownLatch(1);
//    Runnable task = new Runnable() {
//      @Override
//      public void run() {
//        backgroundThreadName.set(Thread.currentThread().getName());
//        latch.countDown();
//        System.out.println(backgroundThreadName);
//      }
//    };
//    BackgroundTask bt = new BackgroundTask(task);
//    bt.invoke();
//    latch.await();

//    training 19-1 FizzBuzz
//    FizzBuzz fb = new FizzBuzz();
//    FizzBuzz.createFizzBuzzList(16);

//    training 19-2 csv inputStream
    // file input Reader処理
    InputStream is = new FileInputStream("employee.csv"); //バイト
    Reader reader = new InputStreamReader(is); //文字
    BufferedReader br = new BufferedReader(reader); //文字列

//    読み込み行
    String line;
    String[] arr;

    while((line = br.readLine()) != null) {
      arr = line.split(",");
      System.out.println("aaa:" + line);
      System.out.println("aaa:" + arr[0]);
    }

//    int i = is.read();
//    while (i != -1) {
//      char c = (char) i;
//      System.out.print(c);
//      i = is.read();
//    }

  }

}
