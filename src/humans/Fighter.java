/*
 * ヒットポイントの乱数範囲（240 ~ 300）
 * 攻撃力の乱数囲（17 ~ 23）
*/

package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	// 引数にname, weaponの2つだけを持つコンストラクタを定義
    public Fighter(String name, String weapon) {
    	// Humanクラスのコンストラクタを利用
        super(name, weapon);
        this.hp = Dice.get(240, 300);
        this.offensive = Dice.get(17, 23);
    }
}