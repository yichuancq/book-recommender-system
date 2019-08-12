package cn.yichuan.example.domain.model.goods;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 商品基本信息
 */
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
    private String goodsName;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        goodsName = goodsName;
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
                ", goodsName='" + goodsName + '\'' +
                '}';
    }
}
