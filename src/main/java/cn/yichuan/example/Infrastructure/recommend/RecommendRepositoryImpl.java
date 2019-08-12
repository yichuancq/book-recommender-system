package cn.yichuan.example.Infrastructure.recommend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import cn.yichuan.example.Infrastructure.JPA.*;

@Repository
public class RecommendRepositoryImpl implements RecommendRepository {

    @Autowired
    private JPARecommendRepository jpaRecommendRepository;
}
