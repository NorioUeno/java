import java.io.IOException;
import practice.training.no19_6Combination.ApplicationServer;
import practice.training.no19_6Combination.DataBase;
import practice.training.no19_6Combination.Frameworks;

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
//    Employee.load(new FileInputStream("employee.csv"));
//    InputStream is = new FileInputStream("employee.csv"); //バイト

//    training 19-3 MultiString
//    String[] array = { "hello", "world" };
//    MultiLineString.join(array);

//    training 19-4 Range-Constrains
//    Range range = new Range(0.0,10.5);
//    range.contains(0.0);

//    training 19-6 Framework combination enum
//    ApplicationServer as = ApplicationServer.GlassFish;
//    DataBase db = DataBase.DB2;
//    Frameworks.isSupport(as, db);
    Frameworks frameworks = new Frameworks();
    ApplicationServer as = ApplicationServer.Tomcat;
    DataBase db = DataBase.DB2;
    System.out.println(frameworks.isSupport(as, db));

  }

}
