package practice.Practice8;

import java.util.Random;

// 8-1
public class Cleric {
  // 8-2
  String name;
  int hp = 10;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 50;

  // 8-3
  public void selfAid() {
    System.out.println(this.name + "は、セルフエイドを唱えた");
    this.hp = MAX_HP;
    this.mp -= 5;
    System.out.println("HPが最大まで回復した");
  }

  public int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒神に祈った！");

    int recover = new Random().nextInt(3) + sec;
    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した");
    return recoverActual;
  }
}
