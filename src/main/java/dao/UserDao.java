package dao;

import entity.User;

/**
 * Description : 用户模块数据查询
 *
 * @author lyh
 * @date 2020-07-29
 */
public interface UserDao {
    public boolean registerUser(User user);

    public User selectByUsernameForOne(String username);
}
