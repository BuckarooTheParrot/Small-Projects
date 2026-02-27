import java.util.Random;
public class Logic {
    static Random random = new Random();


    // attack + crit mechanic
    static int attack(String name1, int health, String name2) throws InterruptedException {
        int crit = random.nextInt(1,6);
        int damage = random.nextInt(10,16);
        int missed = random.nextInt(1,6);
        if (missed == 5) {
            System.out.printf("%s missed!\n", name1);
            return health;
        }else{
            System.out.printf("%s attacked!\n", name1);
            if (crit == 5) {
                System.out.println("CRITICAL HIT!");
                Thread.sleep(1000);
                System.out.printf("%s has %1d health remaining!\n", name2, health - damage*2);
                return health - damage*2;
            } else {
                System.out.printf("%s has %1d health remaining!\n", name2, health - damage);
                return health - damage;
            }
        }
    }

    // healing mechanic
    static int heal(String name, int health){
        int healAmount = random.nextInt(5,11);
        System.out.printf("%s have healed!\n", name);
        System.out.printf("%s at %1d health now!\n", name, health + healAmount);
        return health + healAmount;
    }

    // checking both player and enemy health if they below 0.
    static boolean winner(int enemyHealth, int playerHealth){
        if(enemyHealth <= 0){
            System.out.println("You have won!");
            return false;
        }
        else if (playerHealth <=0){
            System.out.println("You have lost!");
            return false;
        }
        else{
            return true;
        }
    }

    static void dramaticIntro(String bulbasur) throws InterruptedException{
        System.out.println("\nThe battle has begun!\n");
        System.out.println("Your opponent is.....\n");
        Thread.sleep(2000);
        System.out.println("...\n");
        Thread.sleep(2000);
        System.out.println(bulbasur);
        System.out.println("BULBASUR!!!!!!!!!!!!!!");
    }
}
