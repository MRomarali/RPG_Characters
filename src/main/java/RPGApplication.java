import Entities.HeroType;
import Entities.User;

public class RPGApplication {
    public static void main(String[] args) {

    User user = new User(HeroType.Warrior);

    System.out.println(user.getStats()); // Create Character Stats
    user.getStats().levelUp(user.getLevelUp());
    System.out.println(user.getStats().toString()); // Level Up Character Stats
    }
}
