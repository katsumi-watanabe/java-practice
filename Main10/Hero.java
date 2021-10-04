package Main10;

public class Hero {
  String name = "ミナト";
  int hp = 100;

  // 10-10
  public Hero() {
    System.out.println("Heroのコンストラクタが動作");
  }

  // 10-1
  // 戦う
  // public void attack(Matango m) {
  // System.out.println(this.name + "の攻撃！");
  // m.hp -= 5;
  // System.out.println("5ポイントのダメージを与えた！");
  // }

  public final void slip() {
    System.out.println(this.name + "は転んだ！");
  }

  // 逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
}
