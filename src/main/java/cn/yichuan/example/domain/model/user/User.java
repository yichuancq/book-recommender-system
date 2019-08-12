package cn.yichuan.example.domain.model.user;

import javax.persistence.*;
import java.io.Serializable;

/**
 * user info
 */
@Table(name = "User")
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    //用户ID
    @Column(name = "user_id")
    private String userId;

    //用户姓名
    @Column(name = "user_name")
    private String UserName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", UserName='" + UserName + '\'' +
                '}';
    }
}
