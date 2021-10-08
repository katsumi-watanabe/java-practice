package Mains8;

public class Main {
  // 8-1
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "湊";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");
    h.sit(4);
    h.slip();
    h.sit(223);
    h.run();
  }
}
