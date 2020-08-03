package dao.impl;

import dao.UserDao;
import entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description : XXX
 *
 * @author lyh
 * @date 2020-08-03
 */
public class UserDaoImplTest {

    UserDao userDao;
    User user;

    @Before
    public void setUp() throws Exception {
        user = new User();
        user.setId(1);
        user.setUsername("admin");
        user.setPassword("admin");
        user.setEmail("498141896@qq.com");
        userDao = new UserDaoImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void registerUser() {
        System.out.println(userDao.registerUser(user));
    }

    @Test
    public void selectByUsername() {
        userDao.selectByUsernameForOne(user.getUsername());
    }
}