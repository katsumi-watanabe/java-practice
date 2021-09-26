package Practice;

public class Practice5 {
  // 5-1
  // public static void main(String[] args) {
  // introduceOneself();
  // }

  // public static void introduceOneself() {
  // String name = "aaa";
  // int age = 20;
  // double height = 170.0;
  // char zodiac = '寅';
  // System.out.println("私の名前は" + name + "です");
  // System.out.println("私の年齢は" + age + "です");
  // System.out.println("私の身長は" + height + "です");
  // System.out.println("私の十二支は" + zodiac + "です");
  // }

  // 5-2
  // public static void main(String[] args) {
  // String title = "お誘い";
  // String address = "example@example.com";
  // String text = "やっほー！";
  // email(title, address, text);
  // }

  // public static void email(String title, String address, String text) {
  // System.out.println(address + "に、以下のメールを送信しました");
  // System.out.println("件名：" + title);
  // System.out.println("本文：" + text);
  // }

  // 5-3
  // public static void main(String[] args) {
  // String title = "お誘い";
  // String address = "example@example.com";
  // String text = "やっほー！";
  // email(title, address, text);
  // email(address, text);
  // }

  // public static void email(String address, String text) {
  // System.out.println(address + "に、以下のメールを送信しました");
  // System.out.println("件名：無題");
  // System.out.println("本文：" + text);
  // }

  // public static void email(String title, String address, String text) {
  // System.out.println(address + "に、以下のメールを送信しました");
  // System.out.println("件名：" + title);
  // System.out.println("本文：" + text);
  // }

  // 5-4
  // public static void main(String[] args) {
  // double triangleArea = calcTriangleArea(10.0, 5.0);
  // System.out.println("三角形の面積" + triangleArea + "平方cm");
  // double circleArea = calcCircleArea(5.0);
  // System.out.println("円の面積" + circleArea + "平方cm");
  // }

  // public static double calcTriangleArea(double bottom, double height) {
  // double area = (bottom * height) / 2;
  // return area;
  // }

  // public static double calcCircleArea(double radius) {
  // double area = radius * radius * 3.14;
  // return area;
  // }

  // 5-4復習
  public static void main(String[] args) {
    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積は" + triangleArea + "平方cm");
    double circleArea = calcCircleArea(5.0);
    System.out.println("円の面積は" + circleArea + "平方cm");
  }

  public static double calcTriangleArea(double bottom, double height) {
    double area = (bottom * height / 2);
    return area;
  }

  public static double calcCircleArea(double radius) {
    double area = (radius * radius);
    return area;
  }
}
