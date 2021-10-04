package practice.Practice9;

public class Thief {
  // 9-1
  String name;
  int hp;
  int mp;

  public Thief(String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }

  public Thief(String name, int hp) {
    this(name, hp, 5);
  }

  public Thief(String name) {
    this(name, 40);
  }

  // 9-2
  // →25:25
  // →25:35
  // →healメソッドの呼び出しにint型のbaseHpを渡しても呼び出し元の値は変化しません。
  // 一方、Thiefインスタンスを渡すと呼び出し元でもhpが変化します。
  // これは、引数がint型の場合、変数baseHpの値が引数hpにコピーされる値渡しにより、
  // メソッド内での代入は呼び出し元へ影響しないためです。引数がクラス型の場合、
  // 変数tが示すアドレスが引数thiefコピーされる参照渡しにより、t.hpとthief.hpはメモリの同じ場所を示すことになります。
  // そのため、thief.hpへの代入がt.hpにも反映している様に見えるのです。
}
