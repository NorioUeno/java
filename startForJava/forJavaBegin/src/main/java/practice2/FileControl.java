package practice2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import java.util.zip.GZIPOutputStream;

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
    p.setProperty("bbb","test-bbb");
    p.setProperty("ccc","ueno");
    p.setProperty("ccc","yukawa");
    p.store(fw, "test");
    fw.close();
  }

  // csv処理 library open-csv
  // https://qiita.com/sunnycloudy764/items/c117e769863dc96edc59



}
