import cn.yichuan.example.RecommendApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RecommendApp.class)
public class ProductTest {


    @Test
    public void hello() {
        System.out.println("hello");
    }
}
