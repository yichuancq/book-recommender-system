package cn.yichuan.example.Infrastructure;

import cn.yichuan.example.Infrastructure.JPA.JPABookRepository;
import cn.yichuan.example.domain.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
