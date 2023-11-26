public abstract class Zombie implements Destroyabel{
    protected int health, level;

    Zombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    public abstract void heal();
    public abstract void destroyed();

    public String getZombieInfo(){
        return "Health : " + health + "\nLevel  : " + level + "\n";
    }
}
