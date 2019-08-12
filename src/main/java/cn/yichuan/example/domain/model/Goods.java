package cn.yichuan.example.domain.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "goods")
@Entity
public class Goods implements Serializable {

    // control+n  setter and setter
    @Id
    @GeneratedValue
    private Long id;
    //商品ID
    @Column(name = "goods_id")
    private String goodsId;

    //商品名称
    @Column(name = "goods_name")
    private String GoodsName;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", GoodsName='" + GoodsName + '\'' +
                '}';
    }
}
