package cn.yichuan.example.Infrastructure.goods;

import cn.yichuan.example.domain.model.goods.Goods;

import java.util.List;

public interface BookRepository {
    List<Goods> findAll();
}
