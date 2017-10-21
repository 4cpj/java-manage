package cn.cpj.service;

import cn.cpj.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by ye on 2017/10/16
 */
@Service
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Environment env;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserDao userDao;


    public List<Map<String, Object>> getUser() {
        String SQL = env.getProperty("findUserById");
        List<Map<String, Object>> userList = jdbcTemplate.queryForList(SQL, 1);
        logger.info(userList.toString());
        return userList;
    }


}
