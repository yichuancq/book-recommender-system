package cn.yichuan.example.Infrastructure.JPA;

import cn.yichuan.example.domain.model.recommend.RecommendationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPARecommendRepository extends JpaRepository<RecommendationInfo, Long> {
}
