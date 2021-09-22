package Practice;

import java.util.Scanner;

public class Practice3 {
  private static final Scanner SCANNER = new java.util.Scanner(System.in);

  public static void main(String[] args) {
    // 3-1
    // weight == 60
    // (age1 + age2) * 2 >= 60 → (age1 + age2) * 2 > 60
    // age == odd → age % 2 == 1
    // name.equals("湊")

    // 3-2
    // C → C,D,E

    // 3-3
    // int isHungry = 1;
    // String food = "ハンバーガー";
    // System.out.println("こんにちは");
    // if (isHungry == 0) {
    // System.out.println("お腹がいっぱいです");
    // } else {
    // System.out.println("腹ぺこです");
    // System.out.println(food + "をいただきます。");
    // System.out.println("ごちそうさまでした");
    // }

    // 3-4
    // else後に{}がついていないため2目以降は反映されない状態となっている
    // boolean tenki = false;
    // if (tenki == true) {
    // System.out.println("洗濯をします");
    // System.out.println("散歩に行きます");
    // } else {
    // System.out.println("DVDを見ます");
    // System.out.println("寝ます");
    // }

    // 3-5
    // System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
    // int selected = new java.util.Scanner(System.in).nextInt();
    // switch (selected) {
    // case 1:
    // System.out.println("検索します");
    // break;
    // case 2:
    // System.out.println("登録します");
    // break;
    // case 3:
    // System.out.println("削除します");
    // break;
    // case 4:
    // System.out.println("変更します");
    // break;
    // }

    // 3-6
    System.out.println("【数当てゲーム】");
    int ans = new java.util.Random().nextInt(10);
    for (int i = 0; i < 5; i++) {
      System.out.println("０～９の数字を入力してください");
      int number = SCANNER.nextInt();
      if (ans == number) {
        System.out.println("あたり！");
        break;
      } else {
        System.out.println("ちがいます");
      }
    }
    System.out.println("Gameを終了します");
  }
}
