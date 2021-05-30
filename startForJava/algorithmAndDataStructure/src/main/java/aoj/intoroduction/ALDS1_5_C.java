package aoj.intoroduction;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Koch Curve.
 *
 * @author norioueno
 *
 */
public class ALDS1_5_C {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scan = new Scanner(System.in);
    int depth = scan.nextInt();
    float[] begin = {0, 0};
    // int beginY = 0;
    float[] end = {100, 0};
    // int endY =0;
    System.out.printf("%.8f %.8f\n",begin[0], begin[1]); //p
    koch(depth, begin, end);
    System.out.printf("%.8f %.8f\n", end[0], end[1]); // t
  }

  public static void koch(int depth, float[] begin, float[] end) {

    double rad = 1.0471975511965976d;
    float sin = (float)Math.sin(rad);
    float cos = (float)Math.cos(rad);
    if(depth == 0) {
      return;
    }
    BigDecimal[] beginD = {BigDecimal.valueOf(begin[0]),BigDecimal.valueOf(begin[1])};
    BigDecimal[] endD = {BigDecimal.valueOf(end[0]),BigDecimal.valueOf(end[1])};

    float[] s = {
//        (2 * beginD[0] + 1 * end[0]) / 3 // x
        beginD[0].multiply(BigDecimal.valueOf(2f))
        .add(
            endD[0].multiply(BigDecimal.valueOf(1f))
        )
        .divide(BigDecimal.valueOf(3f),8,BigDecimal.ROUND_HALF_UP)
        .floatValue()
//        ,(2 * beginD[1] + 1 * end[1]) / 3 // y
        ,beginD[1].multiply(BigDecimal.valueOf(2f)).add(
        endD[1].multiply(BigDecimal.valueOf(1f))
        .divide(BigDecimal.valueOf(3f),8,BigDecimal.ROUND_HALF_UP)
        ).floatValue()
    };
    System.out.println("s[0]:" + s[0] + " s[1]" + s[1]);
    float[] t = {
        (1 * begin[0] + 2 * end[0]) / 3 // x
        ,(1 * begin[1] + 2 * end[1]) / 3 // y
    };
    float[] u = {
        (((t[0] - s[0]) * cos  - (((t[1] - s[1])* sin)) + s[0]))// x
        ,(((t[0] - s[0]) * sin) - (((t[1] - s[1])* cos)) + s[1])// y
    };

    koch(depth - 1, begin, s);
    System.out.printf("%.8f %.8f\n",s[0], s[1]); //s
    koch(depth - 1, s, u);
    System.out.printf("%.8f %.8f\n",u[0], u[1]); //u
    koch(depth - 1, u, t);
    System.out.printf("%.8f %.8f\n",t[0], t[1]); //t
    koch(depth - 1, t, end);
  }

}
