package atCoder.welcomToAtCorder;

import java.util.Scanner;

public class ABC081A_PlacingMarbles {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int count = 0;
//    for(String ss :s.split("")){
    for(char ss :s.toCharArray()){
      count += Character.getNumericValue(ss);
    }
    System.out.printf("%d\n", count);

  }

}
