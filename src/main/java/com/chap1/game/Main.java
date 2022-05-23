
package com.chap1.game;

import com.chap1.game.behavior.impl.SwordBehavior;
import com.chap1.game.character.Queen;
import org.junit.Test;

/**
 * @ClassName Main
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/05/20 15:50
 * @Version 1.0
 **/
public class Main {

    @Test
    public void test() {
        Queen queen = new Queen();
        queen.setWeapon(new SwordBehavior());
        queen.fight();
    }
}
