import Attributes.PrimaryAttributes;
import Entities.Character;
import Entities.HeroType;
import Entities.User;
import Stats.Stats;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void levelUp_attributes() {
        Character character = new User(HeroType.Warrior);
        int expectedStrength = 3;
        int expectedDexterity = 2;
        int expectedIntelligence = 1;

        int actualStrength = character.getLevelUp().getStrength();
        int actualDexterity = character.getLevelUp().getDexterity();
        int actualIntelligence = character.getLevelUp().getIntelligence();
        Assert.assertEquals(expectedStrength, actualStrength);
        Assert.assertEquals(expectedDexterity, actualDexterity);
        Assert.assertEquals(expectedIntelligence, actualIntelligence);
    }
    @Test
    public void default_attributes() {
        PrimaryAttributes base = new PrimaryAttributes(5,2,1);
        int expectedStrength = 5;
        int expectedDexterity = 2;
        int expectedIntelligence = 1;

        int actualStrength = base.getStrength();
        int actualDexterity = base.getDexterity();
        int actualIntelligence = base.getIntelligence();
        Assert.assertEquals(expectedStrength, actualStrength);
        Assert.assertEquals(expectedDexterity, actualDexterity);
        Assert.assertEquals(expectedIntelligence, actualIntelligence);
    }

}
