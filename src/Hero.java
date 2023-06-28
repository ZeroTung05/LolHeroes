public class Hero {
    private String name;
    private int hp;
    private int baseAttackDamage;

    public Hero(String name, int hp, int baseAttackDamage){
        this.name = name;
        this.hp = hp;
        this.baseAttackDamage = baseAttackDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getBaseAttackDamage() {
        return baseAttackDamage;
    }

    public void setBaseAttackDamage(int baseAttackDamage) {
        this.baseAttackDamage = baseAttackDamage;
    }
}
