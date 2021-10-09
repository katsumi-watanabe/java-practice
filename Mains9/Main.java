package Mains9;

import Mains8.Hero;

public class Main {
  public static void main(String[] args) {
    // 9-1
    // Hero h;
    // h = new Hero();
    // h.hp = 100;

    // 9-2
    // Hero h1;
    // h1 = new Hero();
    // h1.hp = 100;
    // Hero h2;
    // h2 = h1;
    // h2.hp = 200;
    // System.out.println(h1.hp);

    // 9-4
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    h.sword = s; // 生成済みの剣インスタンスを代入
    System.out.println("現在の武器は" + h.sword.name);
  }
}
