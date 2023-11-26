public class WalkingZombie extends Zombie{
    WalkingZombie(int health, int level){
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (health * 0.1);
                break;
            case 2:
                health += (health * 0.3);
                break;
            case 3:
                health += (health * 0.4);
                break;
        }
    }

    @Override
    public void destroyed() {
        // health berkurang 2% setiap penghancuran
        health -= (health * 0.02);
    }

    @Override
    public String getZombieInfo() {
        // TODO Auto-generated method stub
        System.out.println("Walking Zombie Data: ");
        return super.getZombieInfo();
    }
}
