/*
 * ヒットポイントの乱数範囲（120 ~ 180）
 * 攻撃力の乱数囲（12 ~ 18）
*/

package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	// 引数にname, weaponの2つだけを持つコンストラクタを定義
    public Wizard(String name, String weapon) {
    	// Humanクラスのコンストラクタを利用
        super(name, weapon);
        this.hp = Dice.get(120, 180);
        this.offensive = Dice.get(12, 18);
    }
}