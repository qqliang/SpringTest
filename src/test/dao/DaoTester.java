package dao;

import com.library.common.User.dao.TestUserDao;
import com.library.common.User.entity.TestUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Chen Qi on 2017/5/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml" })
public class DaoTester {
    @Autowired
    TestUserDao testUserDao;

    @Test
    public void testList() throws Exception {
        List<TestUser> list = testUserDao.list();
        for (TestUser testUser : list){
            System.out.println(testUser.toString());
        }
    }
}
