package humans;

import java.util.concurrent.ThreadLocalRandom;

import bases.Human;

public class Wizard extends Human {
    public Wizard(String name, String weapon) {
        // 親クラス（Human）のコンストラクタを呼び出してnameとweaponを設定
        super(name, weapon);
        
        // ヒットポイントと攻撃力を乱数で初期化
        this.setHp(generateRandom(120, 180));
        this.setOffensive(generateRandom(12, 18));
    }

    private int generateRandom(int min, int max) {
        // 指定された範囲内でランダムな整数を生成
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}