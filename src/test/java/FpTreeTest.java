import cn.yichuan.example.RecommendApp;
import cn.yichuan.example.recommender.pf.FPTree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RecommendApp.class)
public class FpTreeTest {

    @Autowired
    private FPTree fpTree;
    //绝对支持度
    private long absSupport = 10;

    @Test
    public void excuteTask() {
        String path = "src/main/resources/data/retail.dat";
        fpTree.FpTreeInit(path, absSupport);

    }
}
