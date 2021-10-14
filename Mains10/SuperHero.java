package Mains10;

public class SuperHero extends Hero {
  // 10-3
  boolean flying;

  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }

  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }

  // 10-5
  public void run() {
    System.out.println(this.name+"は撤退した");
  }
}

// public class SuperHero {
// 10-2
// String name = "ミナト";
// int hp = 100;
// boolean flying;

// public void attack(Matango m) {
// System.out.println(this.name + "の攻撃！");
// m.hp -= 5;
// System.out.println("5ポイントのダメージをあたえた！");
// }

// public void run() {
// System.out.println(this.name + "は逃げ出した！");
// }

// public void fly() {
// this.flying = true;
// System.out.println("飛び上がった！");
// }

// public void land() {
// this.flying = false;
// System.out.println("着地した！");
// }
// }
