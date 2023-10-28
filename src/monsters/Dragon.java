/*
 * ヒットポイントの乱数範囲（270 ~ 330）
 * 攻撃力の乱数囲（12 ~ 18）
*/

package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	// 引数にname, weaponの2つだけを持つコンストラクタを定義
    public Dragon(String name, String weapon) {
    	// Monsterクラスのコンストラクタを利用
        super(name, weapon);
        this.hp = Dice.get(270, 330);
        this.offensive = Dice.get(12, 18);
    }
}