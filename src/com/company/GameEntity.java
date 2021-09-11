package com.company;

public class GameEntity {
    private int HeroHealth;
    private int HeroDamage;
    private int BossHealth;
    private int BossDamage;
    private int SkeletonHealth;
    private int SkeletonDamage;

    public int getHeroHealth() {
        return HeroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        HeroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        HeroDamage = heroDamage;
    }

    public int getBossHealth() {
        return BossHealth;
    }

    public void setBossHealth(int bossHealth) {
        BossHealth = bossHealth;
    }

    public int getBossDamage() {
        return BossDamage;
    }

    public void setBossDamage(int bossDamage) {
        BossDamage = bossDamage;
    }

    public int getSkeletonHealth() {
        return SkeletonHealth;
    }

    public void setSkeletonHealth(int skeletonHealth) {
        SkeletonHealth = skeletonHealth;
    }

    public int getSkeletonDamage() {
        return SkeletonDamage;
    }

    public void setSkeletonDamage(int skeletonDamage) {
        SkeletonDamage = skeletonDamage;
    }
    public String info (){
        return "Boss health = " + BossHealth + "Boss damage " + BossDamage;
    }
}