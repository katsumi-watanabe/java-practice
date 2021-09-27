package practice;

import java.util.Scanner;

public class Practice4 {
  public static void main(String[] args) {

    // 4-1
    // int[] points = { 1, 2, 3, 4 };
    // double[] weights = { 1, 2, 3, 4, 5 };
    // boolean[] answers = { true, true, false };
    // String[] names = { "1", "2", "3" };

    // 4-1回答
    // int[] points = new int[4];
    // double[] weights = new double[5];
    // boolean[] answers = new boolean[3];
    // String[] names = new String[3];

    // 4-2
    // int[] moneyList = { 121902, 8302, 55100 };
    // for (int i = 0; i < moneyList.length; i++) {
    // System.out.println(moneyList[i]);
    // }
    // for (int xxx : moneyList) {
    // System.out.println(xxx);
    // }

    // 4-3
    // nullだからデータがない
    // floatじゃない
    // int[] counts = null;
    // float[] heights = { 171, 3F, 175, 0F };
    // System.out.println(counts[1]);
    // System.out.println(heights[2]);

    // 4-4
    int[] numbers = { 3, 4, 9 };
    System.out.println("1桁の数字を入力してください");
    int input = extracted().nextInt();
    for (int x : numbers) {
      if (input == x) {
        System.out.println("あたり！");
      }
    }
  }

  private static Scanner extracted() {
    return new java.util.Scanner(System.in);
  }
}
