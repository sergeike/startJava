package be.lombaer;

import static org.junit.Assert.*;

/**
 * Created by sergelombaerts on 5/09/17.
 */
public class PersonTest {
    Person p = new Person();


    @org.junit.Before
    public void init() throws Exception {
        p.setName("me");
    }



    @org.junit.Test
    public void getName() throws Exception {
        org.junit.Assert.assertEquals("Person name value invalid","me",p.getName());
    }

    @org.junit.Test
    public void setName() throws Exception {

    }

}