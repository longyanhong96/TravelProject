package dao.impl;

import dao.UserDao;
import entity.User;
import entity.rowmapper.UserRowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


/**
 * Description : XXX
 *
 * @author lyh
 * @date 2020-07-31
 */
public class UserDaoImpl extends BaseDao implements UserDao {

    private final static Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    /**
     * 注册
     *
     * @param user
     * @return
     */
    @Override
    public boolean registerUser(User user) {
        boolean flag = false;
        User selectUser = selectByUsernameForOne(user.getUsername());
        if (selectUser == null) {
            String sql = "insert into user(username,password,email) values(?,?,?)";
            flag = template.update(sql, user.getUsername(), user.getPassword(), user.getEmail()) != -1;
        }
        return flag;
    }

    /**
     * 根据一个username，查找一个user
     *
     * @param username
     * @return
     */
    @Override
    public User selectByUsernameForOne(String username) {
        User user = null;
        String sql = "select id,username,password,email from user where username=?";
        List<User> users = template.query(sql, new UserRowMapper(), username);
        user = users.get(0);
        logger.debug("user:{}", user);
        return user;
    }


}
