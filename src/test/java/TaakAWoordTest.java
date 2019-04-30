import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TaakAWoordTest {
    @Test
    public void lepelIsEenPalindroom(){
        TaakAWoord woord = new TaakAWoord("lepel");
        assertThat(woord.isPalindroom()).isTrue();
    }

    @Test
    public void vorkIsGeenPalindroom(){
        TaakAWoord woord = new TaakAWoord("vork");
        assertThat(woord.isPalindroom()).isFalse();
    }
}
