package processToString;

public class ProcessString {
  /**
   * 文字処理
   * Todo
   * 1.基本的な文字列操作
   * 2.正規表現
   *
   * @param args voidメイン
   */
  public static void main(String[] args) {

    // TODO 自動生成されたメソッド・スタブ
    System.out.println("start:main");

    // variables
    String str1 = "hoge";
    String str2 = "テストだよ";
    String str3 = "hoge";
    StringBuilder sb = new StringBuilder();

    // call method
    // equal(str3);

    // 文字数カウンタ
    System.out.println("文字数カウンタ:start");
    sb.append("文字数:");
    int strCount = str1.length();
    System.out.println(sb.append(strCount));

    /**
     * // 文字の位置カウント
     * System.out.println("文頭からどの位置にいるか");
     * sb.delete(1, 1000); //初期化
     * sb.append("文頭からどの位置にいるか:");
     * int indexofCon = str2.indexOf("だよ");
     * sb.append(indexofCon);
     * System.out.println(sb.append(strCount));
     */

    // 正規表現（パターンマッチング）
    String word = "adfa";
    System.out.println("正規表現:start 判定word= " + word);
    pternMaching(word);

    // split
    String splitWord = "abaa,adfa";
    // String[] splitWord = new String[] {"aaa","beeaa"};
    System.out.println("split:start 判定word" + splitWord);
    splitWord(splitWord);

  } // main end

  /**
   * method 呼び出し例
   * @
   * public static 戻り値の型 methodName (引数)
   */
  public static String equal(String copmpareChar) {

    // 文字列処理
    String str1 = "hoge";
    if (str1.equals(copmpareChar)) {
      System.out.println("equal");
    }
    return (str1);
  }

  /**
   * 正規表現メソッド
   * ちなみに静的メソッドの場合は以下の３つの特徴がある
   * 1.method自体がクラスに属し、[class.メソッド名]でコールができる
   * 2.インスタンスが無くても呼び出し可能
   * 3.インスタンス変数目.メッソッド名で呼び出し可能
   *
   * @param word
   */
  public static void pternMaching(String word) {

    // 英数字など [0-9]=¥d,[a-zA-Z_0-9]=¥w,空白文字=¥s
    System.out.println("英数字");
    System.out.println(word.matches("[A-Za-z1-9]{5}"));

    // n回以上の繰り返し
    System.out.println("n回以上の繰り返し");
    System.out.println(word.matches("[a-z]{5}"));
    // n回以上m会未満の繰り返し
    System.out.println("n回以上m会未満の繰り返し");
    System.out.println(word.matches("[a-z]{1,5}"));
    // 先頭^と末尾$
    System.out.println("先頭^と末尾$");
    System.out.println(word.matches("^a*$a"));
    // 任意の１文字文字.(ピリオド) 直前の繰り返し(*)
    System.out.println("先頭^と末尾$");
    System.out.println(word.matches("^a.*a$"));
  }

  public static void splitWord(String splitwords) {

    String[] split = splitwords.split("[,:]");
//    System.out.println(":"+split[0]+":"+split[1]);
    System.out.println(split[0]);
  }

} // java end
