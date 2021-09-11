package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setBossHealth(400);
	boss.setBossDamage(75);

	Skeleton skeleton1 = new Skeleton();
	skeleton1.setSkeletonHealth(100);
	skeleton1.setBossDamage(20);

	Skeleton skeleton2 = new Skeleton();
	skeleton2.setSkeletonHealth(110);
	skeleton2.setBossDamage(25);

	boss.weapon.setTitleWeapon("Fiery arms");
	boss.weapon.setTypeWeapon("Katana");

	skeleton1.setArrows(50);

	skeleton2.setArrows(75);

	System.out.println(boss.info());

	System.out.println(skeleton1.info());

	System.out.println(skeleton2.info());
    }
}
