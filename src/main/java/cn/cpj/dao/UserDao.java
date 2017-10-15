package cn.cpj.dao;

import cn.cpj.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ye on 2017/10/13
 */
public interface UserDao extends JpaRepository<User,Long> {
    public User findUserByEmailAndPassword(String email,String password);

    public User findUserByEmail(String email);
}
