package cn.yichuan.example.Infrastructure.goods;

import cn.yichuan.example.domain.model.goods.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import cn.yichuan.example.Infrastructure.JPA.*;

import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {

    @Autowired
    private JPABookRepository jpaBookRepository;


    @Override
    public List<Goods> findAll() {
        return jpaBookRepository.findAll();
    }
}
