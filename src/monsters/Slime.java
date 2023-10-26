package monsters;

import java.util.concurrent.ThreadLocalRandom;

import bases.Monster;

public class Slime extends Monster {
    public Slime(String name, String weapon) {
        // 親クラス（Monster）のコンストラクタを呼び出してnameとweaponを設定
        super(name, weapon);
        
        // ヒットポイントと攻撃力を乱数で初期化
        this.setHp(generateRandom(70, 130));
        this.setOffensive(generateRandom(5, 11));
    }

    private int generateRandom(int min, int max) {
        // 指定された範囲内でランダムな整数を生成
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}