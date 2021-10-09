package Mains9;

public class Wizard {
  String name;
  int hp;

  public void heal(Mains8.Hero h2) {
    h2.hp += 10;
    System.out.println(h2.name+"のHPを10回復した！");
  }
}
