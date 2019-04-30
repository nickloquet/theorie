import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TaakBVeilingTest {
    private TaakBVeiling veiling;
    @Before
    public void before(){
        veiling = new TaakBVeiling();
    }
    @Test
    public void geenBodIs0(){
        assertThat(veiling.getHoogsteBod()).isZero();
    }
    @Test
    public void bodIsGelijkAanHoogsteBod(){
        veiling.doeBod(100);
        assertThat(veiling.getHoogsteBod()).isEqualTo(100);
    }
    @Test
    public void meerdereBodenHoogsteBodIsHoogsteBedrag(){
        veiling.doeBod(120);
        veiling.doeBod(250);
        veiling.doeBod(150);
        assertThat(veiling.getHoogsteBod()).isEqualTo(250);
    }
}
