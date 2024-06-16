//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Boss someBoss = new Boss();
    someBoss.setDamage(70);
    someBoss.setHealth(1500);
    someBoss.setDefence("Physical");

    System.out.println("Damage "+someBoss.getDamage()+" Health " + someBoss.getHealth()+" Defence "+someBoss.getDefence());

    for (Hero hero:create_heroes()){
        System.out.println("Health "+hero.getHealth() + " Damage "+hero.getDamage() + " Superpower "+hero.getSuperpower());
    }

    }
    public static Hero[] create_heroes(){
        Hero swordsman = new Hero(500, 35);
        Hero mage = new Hero(300, 60, "magic");
        Hero archer = new Hero(400, 30);
        Hero[] heroes = {swordsman, mage, archer};
        return heroes;
    }
}