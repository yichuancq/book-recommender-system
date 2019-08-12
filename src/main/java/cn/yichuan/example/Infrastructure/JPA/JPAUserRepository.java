package cn.yichuan.example.Infrastructure.JPA;

import cn.yichuan.example.domain.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPAUserRepository  extends JpaRepository<User, Long> {
}
