/*
 * ヒットポイントの乱数範囲（70 ~ 130）
 * 攻撃力の乱数囲（5 ~ 11）
*/

package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	// 引数にname, weaponの2つだけを持つコンストラクタを定義
    public Slime(String name, String weapon) {
    	// Monsterクラスのコンストラクタを利用
        super(name, weapon);
        this.hp = Dice.get(70, 130);
        this.offensive = Dice.get(5, 11);
    }
}