package cn.yichuan.example.domain.model.recommend;

import javax.persistence.*;
import java.io.Serializable;

/**
 *  推荐结果
 */
@Table(name = "recommendation_info")
@Entity
public class RecommendationInfo implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    //
    @Column(name = "user_id")
    private String userId;

    @Column(name = "goods_id")
    private String goodsId;

    @Column(name = "memo")
    private String memo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "RecommendationInfo{" +
                "userId='" + userId + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
