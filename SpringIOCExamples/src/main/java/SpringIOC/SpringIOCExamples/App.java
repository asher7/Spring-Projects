package SpringIOC.SpringIOCExamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
       PlayerPojo playerPojo=  context.getBean(PlayerPojo.class);
       playerPojo.getAge();
       
      
    }
}
