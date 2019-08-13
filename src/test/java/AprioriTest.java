import cn.yichuan.example.RecommendApp;
import cn.yichuan.example.recommender.apriori.Apriori;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RecommendApp.class)
public class AprioriTest {

    @Test
    public void excuteTask() {
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("忒修斯之船;围城;你是我咫尺遥望的岸;");
        dataList.add("围城;梁光正的光;");
        dataList.add("围城;群山之巅;");
        dataList.add("忒修斯之船;围城;梁光正的光;");
        dataList.add("忒修斯之船;群山之巅;");
        dataList.add("围城;群山之巅;");
        dataList.add("忒修斯之船;群山之巅;");
        dataList.add("忒修斯之船;围城;群山之巅;你是我咫尺遥望的岸;梁光正的光;");
        dataList.add("忒修斯之船;围城;群山之巅;");

        System.out.println("=数据集合==========");
        for (String string : dataList) {
            System.out.println(string);
        }

        Apriori apriori2 = new Apriori();
        System.out.println("=频繁项集==========");

        Map<String, Integer> frequentSetMap = apriori2.apriori(dataList);
        Set<String> keySet = frequentSetMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + frequentSetMap.get(key));
        }

        System.out.println("=关联规则==========");
        Map<String, Double> relationRulesMap = apriori2.getRelationRules(frequentSetMap);
        Set<String> rrKeySet = relationRulesMap.keySet();
        for (String rrKey : rrKeySet) {
            System.out.println(rrKey + "  :  " + relationRulesMap.get(rrKey));
        }
    }

}
//=数据集合==========
//忒修斯之船;围城;你是我咫尺遥望的岸;
//围城;梁光正的光;
//围城;群山之巅;
//忒修斯之船;围城;梁光正的光;
//忒修斯之船;群山之巅;
//围城;群山之巅;
//忒修斯之船;群山之巅;
//忒修斯之船;围城;群山之巅;你是我咫尺遥望的岸;
//忒修斯之船;围城;群山之巅;
//=频繁项集==========
//围城; : 7
//围城;忒修斯之船; : 4
//群山之巅; : 6
//梁光正的光; : 2
//你是我咫尺遥望的岸; : 2
//忒修斯之船; : 6
//忒修斯之船;群山之巅; : 4
//围城;群山之巅; : 4
//=关联规则==========
//忒修斯之船;->围城;  :  0.6666666666666666
//忒修斯之船;->群山之巅;  :  0.6666666666666666
//群山之巅;->围城;  :  0.6666666666666666
//群山之巅;->忒修斯之船;  :  0.6666666666666666
