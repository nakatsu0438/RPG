/*
 * ヒットポイントの乱数範囲（170 ~ 230）
 * 攻撃力の乱数囲（9 ~ 15）
*/

package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	// 引数にname, weaponの2つだけを持つコンストラクタを定義
    public Oak(String name, String weapon) {
    	// Monsterクラスのコンストラクタを利用
        super(name, weapon);
        this.hp = Dice.get(170, 230);
        this.offensive = Dice.get(9, 15);
    }
}