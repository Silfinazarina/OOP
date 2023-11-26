public class JumpingZombie extends Zombie{
    JumpingZombie(int health, int level){
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (health * 0.3);
                break;
            case 2:
                health += (health * 0.4);
                break;
            case 3:
                health += (health * 0.5);
                break;
        }
    }

    @Override
    public void destroyed() {
        // health berkurang 1% setiap penghancuran
        health -= (health * 0.01);
    }

    @Override
    public String getZombieInfo() {
        // TODO Auto-generated method stub
        System.out.println("Jumping Zombie Data: ");
        return super.getZombieInfo();
    }
}