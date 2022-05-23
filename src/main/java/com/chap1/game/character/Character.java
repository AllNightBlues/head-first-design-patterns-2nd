
package com.chap1.game.character;

import com.chap1.game.behavior.WeaponBehavior;

/**
 * @ClassName Character
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/05/20 15:43
 * @Version 1.0
 **/
public abstract class Character {

    WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
