/*
 * ヒットポイントの乱数範囲（170 ~ 230）
 * 攻撃力の乱数囲（7 ~ 13）
*/

package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	// 引数にname, weaponの2つだけを持つコンストラクタを定義
    public Brave(String name, String weapon) {
    	// Humanクラスのコンストラクタを利用
        super(name, weapon);
        this.hp = Dice.get(170, 230);
        this.offensive = Dice.get(7, 13);
    }
}