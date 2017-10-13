package dao;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ye on 2017/10/13
 */
public interface UserDao extends JpaRepository<User,Long> {

}
