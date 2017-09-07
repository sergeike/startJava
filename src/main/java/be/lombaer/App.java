package be.lombaer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */

@Component
public class App
{
    public static void main( String[] args )
    {

        System.out.println( "Java app started" );

        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringContext/ApplicationContext.xml");

        App p = context.getBean(App.class);
        p.start(args);


    }
    @Autowired
    private AppJob appJob;


    private void start(String[] args) {
        appJob.doJob();
    }


}
