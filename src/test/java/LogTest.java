
import com.school.utils.LogUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ZWP
 * @Date: 2020/8/24 19:51
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public class LogTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        LogUtils logService = applicationContext.getBean("logUtils", LogUtils.class);
        logService.logPrint("mysql", "select", "success");
    }
}
