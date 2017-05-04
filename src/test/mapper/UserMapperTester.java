package mapper;

import com.library.common.User.entity.LibraryUser;
import com.library.common.User.mapper.LibraryUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Chen Qi on 2017/5/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml" })
public class UserMapperTester {
    @Autowired
    LibraryUserMapper mapper;

    @Test
    public void testInsert() throws Exception {
        LibraryUser user = new LibraryUser();
        user.setUserName("qq");
        user.setPassword("123");
        System.out.println(user.toString());
        int insert = mapper.insert(user);
        System.out.println(insert);
    }

    @Test
    public void testSelect() throws Exception {
        System.out.println(mapper.selectByPrimaryKey(1));
    }

    @Test
    public void testFindWhere() throws Exception {
        System.out.println(mapper.findByUserName("qq"));
    }

    @Test
    public void testDelete() throws Exception {
        System.out.println(mapper.deleteByPrimaryKey(3));
    }

    @Test
    public void testUpdate() throws Exception {

        LibraryUser user = mapper.selectByPrimaryKey(1);
        if (user != null){
            user.setPassword("nicai");
        }
        System.out.println(mapper.updateByPrimaryKey(user));
    }
}
