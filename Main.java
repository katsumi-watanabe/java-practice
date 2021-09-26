
public class Main {
  // private static final Scanner SCANNER = new java.util.Scanner(System.in);

  // 5-14
  // public static int[] makeArray(int size) {
  // int[] newArray = new int[size];
  // for (int i = 0; i < newArray.length; i++) {
  // newArray[i] = i;
  // }
  // return newArray;
  // }

  // public static void main(String[] args) {
  // int[] array = makeArray(3);
  // for (int i : array) {
  // System.out.println(i);
  // }
  // }

  // 5-13
  // public static void incArray(int[] array) {
  // for (int i = 0; i < array.length; i++) {
  // array[i]++;
  // }
  // }

  // public static void main(String[] args) {
  // int[] array = { 1, 2, 3 };
  // incArray(array);
  // for (int i : array) {
  // System.out.println(i);
  // }
  // }

  // 5-12
  // public static void printArray(int[] array) {
  // for (int element : array) {
  // System.out.println(element);
  // }
  // }

  // public static void main(String[] args) {
  // int[] array = { 1, 2, 3 };
  // printArray(array); // 配列を渡す
  // }

  // 5-11
  // public static int add(int x, int y) {
  // return x + y;
  // }

  // public static int add(int x, int y, int z) {
  // return x + y + z;
  // }

  // public static void main(String[] args) {
  // System.out.println("10+20=" + add(10, 20));
  // System.out.println("10+20+30=" + add(10, 20, 30));
  // }

  // 5-10
  // public static int add(int x, int y) {
  // return x + y;
  // }

  // public static double add(double x, double y) {
  // return x + y;
  // }

  // public static String add(String x, String y) {
  // return x + y;
  // }

  // public static void main(String[] args) {
  // System.out.println(add(10, 20));
  // System.out.println(add(3.5, 2.7));
  // System.out.println(add("Hello", "World"));
  // }

  // 5-8
  // public static int add(int x, int y) {
  // int ans = x + y;
  // return ans;
  // }

  // public static void main(String[] args) {
  // System.out.println(add(add(10, 20), add(30, 40)));
  // }

  // 5-7
  // public static int add(int x, int y) {
  // int ans = x + y;
  // return ans;
  // }

  // public static void main(String[] args) {
  // int ans = add(100, 10);
  // System.out.println("100 + 10 = " + ans);
  // }

  // 5-5
  // public static void main(String[] args) {
  // add(100, 20);
  // add(200, 50);
  // }

  // // 複数の値を受け取るaddメソッド
  // public static void add(int x, int y) {
  // int ans = x + y;
  // System.out.println(x + "+" + y + "=" + ans);
  // }

  // 5-4
  // public static void main(String[] args) {
  // System.out.println("メソッドを呼び出します");
  // hello("aaaa");
  // hello("iiii");
  // hello("uuuu");
  // System.out.println("メソッドの呼び出しが終わりました");
  // }

  // public static void hello(String name) {
  // System.out.println(name + "さん、こんにちは");
  // }

  // 5-3
  // public static void methodA() {
  // System.out.println("methodA");
  // methodB();
  // }

  // public static void methodB() {
  // System.out.println("methodB");
  // }

  // public static void main(String[] args) {
  // methodA();
  // }

  // 5-2
  // public static void main(String[] args) {
  // System.out.println("メソッドを呼び出します");
  // hello();
  // System.out.println("メソッドの呼び出しが終わりました");
  // }

  // public static void hello() {
  // System.out.println("マルちゃん、こんにちは");
  // System.out.println("mainさん、こんにちは");
  // }

  // 5-2以前
  // public static void main(String[] args) {
  // System.out.println("メソッドを呼び出します");
  // hello();
  // System.out.println("メソッドの呼び出しが終わりました");
  // int[][] scores = { { 40, 50, 60 }, { 80, 60, 70 } };
  // System.out.println(scores.length);
  // System.out.println(scores[0].length);

  // 文字数をカウントするときはlengthの後に()をつける
  // String str = "Javaで開発";
  // System.out.println(str.length());

  // 4-17
  // int[] array = { 1, 2, 3 };
  // array = null;
  // array[0] = 10;

  // 4-16
  // boolean judge = true;
  // if (judge == true) {
  // int[] array = { 1, 2, 3 };
  // }

  // 4-15
  // int[] arrayA = { 1, 2, 3 };
  // int[] arrayB;
  // arrayB = arrayA;
  // arrayB[0] = 100;
  // System.out.println(arrayA[0]);

  // 4-14
  // int[] scores = { 20, 30, 40, 50, 80 };
  // for (int value : scores) {
  // System.out.println(value);
  // }

  // 4-13
  // int[] scores = { 20, 30, 40, 50, 80 };
  // for (int i = 0; i < scores.length; i++) {
  // System.out.println(scores[i]);
  // }

  // 4-12-1
  // int[] seq = new int[10];

  // // 塩基配列をランダムに生成
  // for (int i = 0; i < seq.length; i++) {
  // seq[i] = new java.util.Random().nextInt(4);
  // }

  // // 生成した塩基配列の記号を表示
  // for (int i = 0; i < seq.length; i++) {
  // char[] base = { 'A', 'T', 'G', 'C' };
  // System.out.println(base[seq[i]] + " ");
  // }

  // 4-12
  // int[] seq = new int[10];

  // // 塩基配列をランダムに生成
  // for (int i = 0; i < seq.length; i++) {
  // seq[i] = new java.util.Random().nextInt(4);
  // }

  // // 生成した塩基配列の記号を表示
  // for (int i = 0; i < seq.length; i++) {
  // switch (seq[i]) {
  // case 0:
  // System.out.println("A ");
  // break;
  // case 1:
  // System.out.println("T ");
  // break;
  // case 2:
  // System.out.println("G ");
  // break;
  // case 3:
  // System.out.println("C ");
  // break;
  // }
  // }

  // 4-11
  // int[] scores = { 20, 30, 40, 50, 80 };
  // int count = 0;
  // for (int i = 0; i < scores.length; i++) {
  // if (scores[i] >= 50) {
  // count++;
  // }
  // }
  // System.out.println("50点以上の科目の数は：" + count);

  // 4-10
  // int[] scores = { 20, 30, 40, 50, 80 };
  // int sum = 0;
  // for (int i = 0; i < scores.length; i++) {
  // sum += scores[i];
  // }
  // int avg = sum / scores.length;
  // System.out.println("合計点：" + sum);
  // System.out.println("平均点：" + avg);

  // 4-9
  // int[] scores = { 20, 30, 40, 50, 80 };
  // for (int i = 0; i < scores.length; i++) {
  // System.out.println(scores[i]);
  // }

  // 4-8
  // int[] scores = { 20, 30, 40, 50, 80 };
  // int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
  // int avg = sum / scores.length;
  // System.out.println("合計点：" + sum);
  // System.out.println("平均点：" + avg);

  // 4-6
  // int[] scores = new int[5];
  // System.out.println(scores[0]);

  // 4-5
  // int[] scores = new int[5];
  // scores[1] = 30;
  // System.out.println(scores[1]);

  // 4-4
  // int[] scores = new int[5];
  // int num = scores.length;
  // System.out.println("要素の数" + num);

  // 3-9
  // for (int i = 1; i < 10; i++) {
  // for (int j = 1; j < 10; j++) {
  // System.out.println(i * j); // 掛け算の結果を出力
  // System.out.println(" "); // 空白を出力
  // }
  // System.out.println(""); // 改行を出力
  // }

  // 3-8
  // for (int i = 0; i < 3; i++) {
  // System.out.println("現在" + (i + 1) + "周目→");
  // }

  // 3-7
  // for (int i = 0; i < 10; i++) {
  // System.out.println("こんにちは");
  // }

  // 3-6
  // System.out.println("あなたの今日の運勢を占います");
  // int fortune = new java.util.Random().nextInt(5) + 1;
  // switch (fortune) {
  // case 1:
  // case 2:
  // System.out.println("いいね");
  // break;
  // case 3:
  // System.out.println("普通です");
  // break;
  // case 4:
  // case 5:
  // System.out.println("うーん・・・");
  // }

  // boolean doorClose = false;
  // while (doorClose == true) {
  // System.out.println("ノックする");
  // System.out.println("1分待つ");
  // }

  // boolean tenki = true;
  // if (tenki == true) {
  // System.out.println("洗濯をします");
  // System.out.println("散歩にいきます");
  // } else {
  // System.out.println("DVDを見ます");
  // }

  // 2-15
  // System.out.println("あなたの名前を入力してください。");
  // String name = SCANNER.nextLine();
  // System.out.println("あなたの年齢を入力してください。");
  // int age = SCANNER.nextInt();
  // System.out.println("ようこそ、" + age + "歳の" + name + "さん");
  // 2-14
  // int r = new java.util.Random().nextInt(90);
  // System.out.println("あなたは多分" + r + "歳ですよね？");

  // 2-5
  // float f = 3;
  // double d = f;
  // System.out.println(f);
  // System.out.println(d);

  // final double PI = 3.14;
  // int pie = 5;
  // System.out.println("半径" + pie + "cmのパイの面積は、");
  // System.out.println(pie * pie * PI);
  // }
}