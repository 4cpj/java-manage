package cn.cpj.dao;

import cn.cpj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.QuerydslJpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by ye on 2017/10/13
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {

    public User findByEmailAndPassword(String email,String password);

    public User findByEmail(String email);

}
