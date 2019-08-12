package cn.yichuan.example.Infrastructure.JPA;

import cn.yichuan.example.domain.model.goods.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPABookRepository extends JpaRepository<Goods, Long> {

}
