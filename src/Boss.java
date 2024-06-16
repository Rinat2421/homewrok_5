public class Boss {
    private int health;
    private int damage;
    private String defence;

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        if (health>0){
        this.health = health;}
        else {
            System.out.println("Invalid health");
        }
    }

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage){
        if (damage>0){
        this.damage = damage;}
        else {
            System.out.println("Invalid damage");
        }
    }

    public String getDefence(){
        return defence;
    }

    public void setDefence(String defence){
        this.defence = defence;
    }
}
