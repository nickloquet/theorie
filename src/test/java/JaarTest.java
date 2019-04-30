import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class JaarTest {
    @Test
    public void eenJaarDeelbaarDoor400IsEenSchrikkeljaar(){
        Jaar jaar = new Jaar(2000);
        assertThat(jaar.isSchrikkeljaar()).isTrue();
    }
    @Test
    public void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar(){
        Jaar jaar = new Jaar(1900);
        assertThat(jaar.isSchrikkeljaar()).isFalse();
    }
    @Test
    public void eenJaarDeelbaarDoor4IsEenSchrikkeljaar(){
        Jaar jaar = new Jaar(2012);
        assertThat(jaar.isSchrikkeljaar()).isTrue();
    }
    @Test
    public void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar(){
        Jaar jaar = new Jaar(2015);
        assertThat(jaar.isSchrikkeljaar()).isFalse();
    }
    @Test
    public void toStringGeeftHetJaarAlsTekst(){
        Jaar jaar = new Jaar(2015);
        assertThat(jaar).hasToString("2015");
    }
    @Test
    public void jarenMetHetzelfdeJaartalZijnGelijk(){
        assertThat(new Jaar(2015)).isEqualTo(new Jaar(2015));
    }
    @Test
    public void jarenMetEenVerschillendJaartalZijnVerschillend(){
        assertThat(new Jaar(2015)).isNotEqualTo(new Jaar(2016));
    }
    @Test
    public void gelijkeHashcodeBijDezelfdeJaren(){
        assertThat(new Jaar(2015)).hasSameHashCodeAs(new Jaar(2015));
    }
}
