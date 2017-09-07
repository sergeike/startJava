package be.lombaer;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Service;

/**
 * Created by sergelombaerts on 24/08/17.
 */
@Service
public class AppJob {

    final static Logger logger =  LogManager.getLogger(AppJob.class);

    public void doJob() {
        String one  = "one string";
        String other = "other string";
        String anotherOne = one;
        logger.trace("enter doJob");
        logger.info( "Is one the same as other : " + one.equals(other) );

        Boolean onebool = one == other;
        logger.info( "Is one identical to other : " + onebool);

        Boolean anotherbool = one == anotherOne;
        logger.info( "Is one the same as anotherOne : " + one.equals(anotherOne) );
        logger.info( "Is one identical to anotherOne : " + anotherbool);


        Person me = new Person();
        me.setName("me");

        Person you = new Person();
        you.setName("you");

        Person againMe = new Person();
        againMe.setName("me");

 //       Person againMe = me;


        logger.info( "Is me the same as you : " + me.equals(you) );

        onebool = me == you;
        logger.info( "Is me identical to you : " + onebool);

        anotherbool = me == againMe;
        logger.info( "Is me the same as againMe : " + me.equals(againMe) );
        logger.info( "Is me identical to againMe : " + anotherbool);

        Employe meAtWork = new Employe();
        meAtWork.setName("me");
        meAtWork.setEmpId("49730");

        Employe youAtWork = new Employe();
        youAtWork.setName("you");
        youAtWork.setEmpId("23234");

        Employe againMeAtWork = new Employe();
        againMeAtWork.setName("me");
        againMeAtWork.setEmpId("49730");

        //       Person againMe = me;


        logger.info( "Is me the same as you : " + meAtWork.equals(youAtWork) );

        onebool = meAtWork == youAtWork;
        logger.info( "Is me identical to you : " + onebool);

        anotherbool = meAtWork == againMeAtWork;
        logger.info( "Is me the same as againMe : " + meAtWork.equals(againMeAtWork) );
        logger.info( "Is me identical to againMe : " + anotherbool);


        logger.info( "Hello World!" );
        logger.trace("exit doJob");
    }

}
