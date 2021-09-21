package Practice;

import java.util.Scanner;

public class Practice2 {
  private static final Scanner SCANNER = new java.util.Scanner(System.in);

  // 2-1
  public static void main(String[] args) {
    // int x = 5;
    // int y = 10;
    // String ans = "x+yは" + (x + y);
    // System.out.println(ans);

    // 2-2
    // 1,4,5 → 2,4,5,7

    // 2-3
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String name = SCANNER.nextLine();
    System.out.println("あなたの年齢を入力してください");
    var ageString = SCANNER.nextLine();
    Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    System.out.println("占い結果が出ました！");
    System.out.println(ageString + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
    System.out.println("1:大吉 2:中吉 3:吉 4:凶");
  }
}
