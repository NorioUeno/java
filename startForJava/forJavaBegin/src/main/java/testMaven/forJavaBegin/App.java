package testMaven.forJavaBegin;

import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;
import practice2.Book;

/**
 * Hello world!
 * すっきりの練習問題
 *
 */
public class App {
  public static void main(String[] args) throws IOException, ParseException {
    System.out.println("★★★main:start★★★");

    // Practice3_3();
//    Cleric Ceric = new Cleric("ueno",40,22);
//    Cleric Ceric2 = new Cleric();
//    Cleric Ceric3 = new Cleric("ueno3");s
//    Cleric Ceric4 = new Cleric("ueno4",300);
//    System.out.println("ceric1 call : start");
//    Ceric.selfAid();
//    Ceric.pray(10);
//    Ceric2.selfAid();

    /*
     * // practice 10 カプセル化
     * Hero h = new Hero();
     * h.setName("Norio");
     * h.setHp(500);
     * Wizard w = new Wizard();
     * w.setHp(200);
     * w.setMp(20);
     * w.setName("kaho");
     * w.heal(h);
     * System.out.println("wizard call : end");
     */
    /*
     * // practice 11 継承
     * Hero h = new Hero();
     * PoisonMatango poMata = new PoisonMatango('A');
     * PoisonMatango poMata2 = new PoisonMatango('B');
     * poMata.poisonAttack(h);
     * poMata.poisonAttack(h);
     */

    // practice 12
//    Patend p = new Patend();
//    p.use();
//    System.out.println("poMata:");

    /*
     * // practice 13
     * TataiseiA obj = new TataiseiA();
     * TataiseiB obj2 = new TataiseiB();
     * // 配列の書き方。 型[] 変数 = new 型[2](インスタンス化)
     * TataiseiY[] list = new TataiseiY[2];
     * list[0] = new TataiseiA();
     * list[1] = new TataiseiB();
     * // 拡張for分 for (配列の型 変数: 配列変数)
     * for (TataiseiY y : list) {
     * y.a();
     * y.b();
     * }
     * System.out.println("poMata:");
     * System.out.println("aa");
     */

    /*
     * // practice 14
     * Time t = new Time();
     * t.timePrint();
     * Practice14VariousAPI a = new Practice14VariousAPI();
     * Practice14VariousAPI b = new Practice14VariousAPI();
     * a.setAccountNumber("4649");
     * a.setBalance(1592);
     * a.acccountInfo();
     * b.setAccountNumber(" 4649");
     * b.setBalance(1592);
     * b.acccountInfo();
     * System.out.println(a.equals(b));
     * if(a.equals(b) == true) {
     * System.out.println("equal");
     * }
     */

    /*
     * // practice 15 exception
     * try {
     * testException tes = new testException();
     * tes.testEx();
     * System.out.println("aa");
     * // FileWriter fw = new FileWriter("aaa.txt");
     * } catch (Exception e) {
     * throw new IOException();
     * // System.out.println("jjj");
     * }
     */

    /*
     * // java begin 2 paractice1
     * // 1-1
     * // ControllLetter.count();
     * // 1-2
     * ControllLetter.makePath();
     * // 1-3
     * ControllLetter.regex();
     * System.out.println("call2");
     */

    /*
     * // java begin 2 paractice3
     * Hero h1 = new Hero();
     * Hero h2 = new Hero();
     * h1.setName("sato");
     * h2.setName("suzuki");
     * ArrayList<Hero> list = new ArrayList<Hero>();
     * list.add(h1);
     * list.add(h2);
     * //拡張for文
     * for (Hero s : list) {
     * System.out.println(s.getName());
     * }
     */

    /*
    // practice4 controll instance
    String pubDateStr = "2020-06-01";
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date pubDate = dateFormat.parse(pubDateStr);

    String pubDateStr2 = "2019-06-02";
    SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
    Date pubDate2 = dateFormat2.parse(pubDateStr2);

    String pubDateStr3 = "2019-06-03";
    SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
    Date pubDate3 = dateFormat3.parse(pubDateStr3);

    Book b1 = new Book();
    b1.setTitle("ueno");
    b1.setPublishDate(pubDate);
    b1.setComment("テストb1");

    Book b2 = new Book();
    b2.setTitle("ueno");
    b2.setPublishDate(pubDate2);
    b2.setComment("テストb2");

    Book b3 = b2.clone();
    b3.setPublishDate(new Date());

    // call equals
    // System.out.println(b1.equals(b2));

    // use collection
    // HashSet<Book> hb = new HashSet<Book>();
    ArrayList<Book> hb = new ArrayList<Book>();
    hb.add(b1);
    hb.add(b2);
    hb.add(b3);
    for (Book a : hb) {
//    System.out.println(a.compareTo(b1));
      System.out.println(a.getPublishDate());
    }

    b2.setPublishDate(pubDate3);

    // sort
//    Collections.sort(hb, new Bookcomp());

    for (Book a : hb) {
      // System.out.println(a.compareTo(b1));
      System.out.println(a.getPublishDate());
    }
    */

    /*
    // practice 2-5
    // contents:enum gericsなど
    StrongBox<String> sb = new StrongBox<String>(KeyEnumTest.PADLOCK,100);
    sb.put("aaa");
    System.out.println(sb.get());
     *
     */

    /*
    // practice 2-6
    // 1.関数オブジェクト
    // 変数へのメソッド参照の格納
    // 変数名 = クラス::そのクラスの静的メソッド
    // SAMインターフェイスで型を定義する
    FunclistIsOddIF funcOdd = FunclistLambda::isOdd;
    System.out.println(funcOdd.call(6));

    Func2If func2 = FunclistLambda::addNamePrefix;
    System.out.println(func2.call(false, "norio"));

    // 変数名 = インスタンス変数名::そのクラスのメソッド名
    FunclistLambda sub = new FunclistLambda();
    IntBinaryOperator funcSub = sub::sub;
    System.out.println(funcSub.applyAsInt(5,8));

    //2.Lambda式
    FunclistIsOddIF func1lambda = (int x) -> {
      return (x % 2 == 1);
    };
    System.out.println(func1lambda.call(5));

    Func2If func2Lambda = (boolean male, String name) -> {
      if (male == true) {
        return "Mr." + name;
      } else {
        return "Ms." + name;
      }
    };
    System.out.println(func2Lambda.call(true, "ueno"));
    *
    */

    //prctice2-7
    // JVM制御とリフレクション
    // JAVAのgetProperty setPropertyもあるよ
    System.out.println(System.getProperty("java.version"));
    Properties p = System.getProperties();
    Iterator<String> i = p.stringPropertyNames().iterator(); //iteratorパターン
    System.out.println("★システムプロパティ一覧★");
    while(i.hasNext()){
      String key = i.next();
      System.out.print(key + "=");
      System.out.println(System.getProperty(key));
    }

    System.out.println("★★★★★★★★★");

    // リフレクション:Classクラス
    Class<?> info1 = Book.class;
    System.out.println(info1.getSimpleName());
    System.out.println(info1.getName());
    System.out.println(info1.getSuperclass());





    System.out.println("★★★main:end★★★");

  }

  /**
   * すっきりの練習問題
   * 1-1
   */
  public static void Practice1_2() {
    int verticalLength = 3;
    int horizonLength = 5;
    System.out.println("vertical:" + verticalLength + "horzizon:" + horizonLength + " = " + horizonLength * verticalLength);
  }

  public static void Practice2_3() {
    // sdf
    System.out.println("Practice2_3");
    // Scaaner関数 システムinputを受付
    // patern1
    @SuppressWarnings("resource")
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("Systemin:" + name);

    // patern2
    Scanner scan = new java.util.Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    scan.close();
    System.out.println(num1 + num2);

  }

  public static void Practice3_1() {
    // 3-1
    int weight = 11;
    if (weight >= 80) {
      System.out.println("over 80");
//    } else if (weight < 80 && weight >= 50) { // And
//      System.out.println("under 80");
//    } else if (weight >= 100 || weight < 50) // or
//      System.out.println("or condition");
    } else if (weight % 2 == 1) {
      System.out.println("奇数");
    }
  }

  public static void Practice3_2() {
    System.out.println("practice_3-3 switch");
    int count = 1;
    switch (count) {
      case 1:
        System.out.println(true);
        break;
      case 2:
        System.out.println(false);
        break;
    }
  }

  /**
   * ランダムに数字を生成、乱数
   * 画面から入力
   * for
   */
  public static void Practice3_3() {
    System.out.println("practice_3-3 for & randum");
    int fortune = new java.util.Random().nextInt(5);
    int i;
    Scanner ans = new java.util.Scanner(System.in);
    for (i = 1; i <= 2; i++) {
      int ansbyclient = ans.nextInt();
      if (ansbyclient == fortune) {
        System.out.println(fortune + " good " + ansbyclient);
      }
      System.out.println(fortune);
    }
    ans.close();
  }

  /**
   * Practice 5 methodいろいろ
   */
  public void introduceOneself() {

  }

  public void email(String title, String address, String test) {

  }

  public double calcTriangleArea(double bottom, double height) {
    return (bottom * height);
  }

}
