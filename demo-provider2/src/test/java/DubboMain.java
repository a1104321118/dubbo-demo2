import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangrui on 2018/1/19.
 * dubbo 服务启动测试类
 */
public class DubboMain {

    private static final Logger log = LoggerFactory.getLogger(DubboMain.class);

    public static void main(String[] args) {

        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
            context.start();
        } catch (Exception e) {
            log.error("== DubboProvider context start error:",e);
        }

        synchronized (DubboMain.class) {
            while (true) {
                try {
                    DubboMain.class.wait();
                } catch (InterruptedException e) {
                    log.error("== synchronized error:",e);
                }
            }
        }

    }
}
