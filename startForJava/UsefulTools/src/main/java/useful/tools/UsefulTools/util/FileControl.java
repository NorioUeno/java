package useful.tools.UsefulTools.util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import java.util.zip.GZIPOutputStream;

/**
 * @author aa572057
 *
 */
public class FileControl {

  private String copyfrom;
  private String copyto;

//  public Filecopy (String copyfrom,String copyto) {
//
//    this.copyfrom =copyfrom;
//    this.copyto=copyto;
//
//  }

  // ファイルリーダー・らいたー textデータ
  public void fileread(String readfile) throws IOException {

    System.out.println("★★Fileread:" + readfile + "★★");
    System.out.println("----");
    FileReader fr = new FileReader(readfile);
    int i = fr.read();
    while (i != -1) {
      char c = (char) i;
      System.out.print(c);
      i = fr.read();
    }
    fr.close();
    System.out.println("----");
  }

  // file write
  public void filewrite(String writefile) throws IOException {
    FileWriter fw = new FileWriter(writefile);
    fw.write("A");
    fw.flush();
    fw.close();
  }

  public void filecopy(Path frompath, Path topath) throws IOException {
    // copy
    Files.copy(frompath, topath);
  }

  // FileInputStreamバイナリデータ エンコーディングの時に利用可能
  public void fileReadBin(String readfile) throws IOException {
    FileInputStream fis = new FileInputStream(readfile);
    int i = fis.read();
    while (i != -1) {
      char c = (char) i;
      System.out.print(c);
      i = fis.read();
    }
    fis.close();
    System.out.println("----");
  }

  public void filewritebin(String witefile) throws IOException {
    FileOutputStream fos = new FileOutputStream(witefile);
    fos.write(65);
    fos.flush();
    fos.close();

  }

  // FileCompression
  public void fileCompression(String readfile, String witefile) throws IOException {
    FileInputStream fis = new FileInputStream(readfile);
    FileOutputStream fos = new FileOutputStream(witefile);
    BufferedOutputStream bos = new BufferedOutputStream(fos);
    GZIPOutputStream gzos = new GZIPOutputStream(bos);
    int i = fis.read();
    while (i != -1) {
      gzos.write(i);
      i = fis.read();
    }
    gzos.finish();
    gzos.close();
    fis.close();
  }

  // プロパティファイル読み込み & 処理
  public void readPropertyFile(String readfile) throws IOException {
    Reader fr = new FileReader(readfile);
    Properties p = new Properties();
    p.load(fr);
    String prefectrureName = p.getProperty("aaa");
    String prefectrureName2 = p.getProperty("bbb");
    System.out.println(prefectrureName + ":" + prefectrureName2);
  }

  // プロパティファイル書き込み
  public void writePropertyFile(String writefile) throws IOException {
    Writer fw = new FileWriter(writefile);
    Properties p = new Properties();
    p.setProperty("bbb", "test-bbb");
    p.setProperty("ccc", "ueno");
    p.setProperty("ccc", "yukawa");
    p.store(fw, "test");
    fw.close();
  }

  // csv処理 library open-csv
  // https://qiita.com/sunnycloudy764/items/c117e769863dc96edc59
  public void readCsvByInputStream() throws IOException {

//    file input Reader処理
    InputStream is = null;
    try {
//      InputStream取り込み use FileInputStream
      is = new FileInputStream("employee.csv");
//      InputStream取り込み2 use リフレクション
//      InputStream is2 = getClass().getResourceAsStream("employee.csv");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } // バイト
    Reader reader = new InputStreamReader(is); // 文字
    BufferedReader br = new BufferedReader(reader); // 文字列

//    読み込み行
    String line;
    String[] arr;

    while ((line = br.readLine()) != null) {
      arr = line.split(",");
      System.out.println("aaa:" + line);
      System.out.println("aaa:" + arr[0]);
    }
  }

  public void readFileByInputStream() {

    final String propertyFile = "framework.csv";
    try {

      InputStream is = new FileInputStream(propertyFile);
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader reader = new BufferedReader(isr);

    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  /**
   * 標準入力
   */
  public void standardInputFromConsole() {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    try {
      String line;
      while ((line = stdin.readLine()) != null) {
          System.out.println(line);
      }

   // 標準入力から与えられる値が数値の場合は自ら変換する必要がある。
      while ((line = stdin.readLine()) != null) {
          int i = Integer.valueOf(line);
          System.out.println(i);
      }

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
