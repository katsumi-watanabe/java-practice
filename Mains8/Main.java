package Mains8;

public class Main {
  // 8-1
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "湊";
    h.hp = 100;
    // System.out.println("勇者" + h.name + "を生み出しました！");
    // h.sit(4);
    // h.slip();
    // h.sit(223);
    // h.run();

    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';
    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}
