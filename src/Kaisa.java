public class Kaisa extends Hero implements Combatable {
    public Kaisa(String name, int hp, int baseAttackDamage){
        super(name, hp, baseAttackDamage);
    }
    @Override
    public void attack(Hero yebok) {
        yebok.setHp(yebok.getHp()-getBaseAttackDamage());
    }
}
