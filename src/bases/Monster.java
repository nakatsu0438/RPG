package bases;

// モンスターを表現する抽象クラス
public abstract class Monster extends Living {

    // コンストラクタ
    public Monster(String name, String weapon) {
        super(name, weapon); // Livingクラスで定義したコンストラクタを利用する
    }

    // attackメソッドのオーバーライド
    @Override
    public void attack(Living target) {
        // 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
        int damage = (int) (Math.random() * 10 + 1) * offensive;

        // 相手のHPをダメージ値だけ減らす
        target.setHp(target.getHp() - damage);

        // コンソールにステータスを表示
        System.out.println("「" + name + "」が「" + weapon + "」で攻撃！「" + target.getName() + "」に" + damage + "のダメージを与えた。");
    }
}
