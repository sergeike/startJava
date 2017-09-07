package be.lombaer;

import static org.junit.Assert.*;

/**
 * Created by sergelombaerts on 5/09/17.
 */
public class EmployeTest {

    Employe e = new Employe();


    @org.junit.Before
    public void setUp() throws Exception {
        e.setName("me");
        e.setEmpId("49730");

    }

    @org.junit.Test
    public void getEmpId() throws Exception {
        org.junit.Assert.assertEquals("Employe id invalid","49730", e.getEmpId());
    }

}