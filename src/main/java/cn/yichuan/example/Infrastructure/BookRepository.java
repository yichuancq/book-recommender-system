package cn.yichuan.example.Infrastructure;

import cn.yichuan.example.domain.model.Goods;

import java.util.List;

public interface BookRepository {
    List<Goods> findAll();
}
