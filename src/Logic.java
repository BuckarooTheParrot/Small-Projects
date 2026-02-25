import java.util.Random;
public class Logic {
    static Random random = new Random();


    // attack + crit mechanic
    static int attack(String name) throws InterruptedException {
        System.out.printf("%s have attacked!\n", name);
        int crit = random.nextInt(1,6);
        int damage = random.nextInt(10,16);
        if (crit == 5){
            System.out.println("CRITICAL HIT!");
            Thread.sleep(1000);
            return damage*2;
        }
        else{
            return damage;
        }
    }

    // healing mechanic
    static int heal(String name){
        if(name.equals("You")){
            System.out.printf("%s have healed yourself!\n", name);
        }
        else System.out.printf("%s has healed himself!\n" , name);
        return random.nextInt(5,11);
    }

    // checking both player and enemy health if they below 0.
    static boolean winner(int enemyHealth, int playerHealth, boolean alive){
        if(enemyHealth <= 0){
            System.out.println("You have won!");
            return alive = false;

        }
        else if (playerHealth <=0){
            System.out.println("You have lost!");
            return alive = false;
        }
        else{
            return alive = true;
        }
    }
}
