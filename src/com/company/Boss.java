package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public String info(){
        return super.info() + "Type Weapon" + weapon.getTypeWeapon() + "Title Weapon" + weapon.getTitleWeapon();
    }
}