package Main9;

public class Main {
  public static void main(String[] args) {
    // Sword s = new Sword();
    // s.name = "炎の剣";
    // s.damage = 10;
    // Hero h = new Hero();
    // h.name = "ミナト";
    // h.hp = 100;
    // h.sword = s;
    // System.out.println("現在の武器は" + h.sword.name);

    // 9
    // Hero h1 = new Hero("ミナト");
    // Hero h2 = new Hero("アカサ");
    // Wizard w = new Wizard();
    // w.name = "スガワラ";
    // w.hp = 50;
    // w.heal(h1); // ミナトを回復させる（HP：100⇨110）
    // w.heal(h2); // アサカを回復させる（HP：100⇨110）
    // w.heal(h2); // アサカを回復させる（HP：110⇨120）
    // System.out.println(h1.name);
    // System.out.println(h1.hp);
    // System.out.println(h2.name);
    // System.out.println(h2.hp);

    // 9-13
    Hero h1 = new Hero("ミナト");
    System.out.println(h1.name);
    Hero h2 = new Hero();
    System.out.println(h2.name);
  }
}
