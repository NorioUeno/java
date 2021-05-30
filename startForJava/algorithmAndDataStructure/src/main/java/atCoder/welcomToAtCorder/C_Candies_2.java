package atCoder.welcomToAtCorder;
import java.util.*;

public class C_Candies_2 {


    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[][] S = new int[2][N+1];
      int m = 0,Max = 0;

      S[0][0] = 0;
      S[1][0] = 0;

      for(int step = 0; step < 2; step++){
        for(int i = 1; i < N+1; i++){
          S[step][i] = S[step][i-1] + sc.nextInt();
        }
      }

      for(int i = 1; i < N+1; i++){
          //累積和
          m = S[0][i] + S[1][N] - S[1][i-1];
          Max = Math.max(m,Max);

       }
       System.out.println(Max);


    }
}
