package Main10;

public class SuperHero extends Hero {
  // 10-3
  boolean flying;

  // 飛ぶ
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }

  // 着地する
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }

  // 10-5
  public void run() {
    System.out.println(this.name + "は撤退した");
  }
}
