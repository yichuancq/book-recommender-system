package cn.yichuan.example.Infrastructure.JPA;

import cn.yichuan.example.domain.model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@Repository
public interface JPABookRepository extends JpaRepository<Goods, Long> {

    @Override
    List<Goods> findAll();
}
