import com.gzjy.sau.mapper.UserMapper;
import com.gzjy.sau.model.User;
import com.gzjy.sau.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class Spring5TEST {

//    @Test
//    public void springTest(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springMVC.xml");
//
//        UserService userServiceImpl = (UserService) applicationContext.getBean("userServiceImpl");
//
//        userServiceImpl.getUser();
//
//    }
//
//    @Test
//    public void getUSer() throws IOException {
//
//        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig.xml");
//
//        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
//
//
//        SqlSession sqlSession = build.openSession(true);
//
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//
//
//        User user = mapper.UserOne();
//
//        System.out.println(user);
//
//    }

}
