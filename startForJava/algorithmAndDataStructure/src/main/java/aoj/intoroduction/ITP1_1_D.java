package aoj.intoroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 秒を時刻に変換する
 * 1.Scannerから
 * 2.ファイルから変数取り込み
 * @author aa572057
 * @param Integer Second
 * @return hh:mm:ss
 */
public class ITP1_1_D {
  public static void main(String[] args) {

//    1.Scannerから
//    Scanner scan = new Scanner(System.in);
//    int Second = scan.nextInt();
//    int hh = Second / 3600;
////    int mm = Second - (hh * 360);
//    int mm = (Second - (hh * 3600)) / 60;
//    int ss = (Second - ((hh * 3600)) - (mm * 60));
//    System.out.println(hh + ":" + mm + ":" + ss );

//    int hh2 = Second / 3600;
//    int mm2 = (Second % 3600)/60;
//    int ss2 = (Second % 3600)%60;
//    System.out.println(hh2 + ":" + mm2 + ":" + ss2 );

//    InputStreamReaderより
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      int S = Integer.parseInt(br.readLine());
      System.out.printf("%d:%d:%d\n",S/3600,(S%3600)/60,S%60);


    }catch(IOException e){
      e.printStackTrace();
    }

  }
}
