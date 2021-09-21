import java.util.Scanner;

public class Main {
  private static final Scanner SCANNER = new java.util.Scanner(System.in);

  public static void main(String[] args) {
    // final double PI = 3.14;
    // int pie = 5;
    // System.out.println("半径" + pie + "cmのパイの面積は、");
    // System.out.println(pie * pie * PI);

    // 2-5
    // float f = 3;
    // double d = f;
    // System.out.println(f);
    // System.out.println(d);

    // 2-14
    // int r = new java.util.Random().nextInt(90);
    // System.out.println("あなたは多分" + r + "歳ですよね？");

    // 2-15
    System.out.println("あなたの名前を入力してください。");
    String name = SCANNER.nextLine();
    System.out.println("あなたの年齢を入力してください。");
    int age = SCANNER.nextInt();
    System.out.println("ようこそ、" + age + "歳の" + name + "さん");
  }
}
