package com.stackroute;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest
{
    Member m=new Member();
    public void name()
    @Test
    {

        String name=m.name("Stackroute");
        assertEquals("Stackroute",name);

    }
    public void age()
    @Test
    {

        int age=m.age(20);
        assertEquals(20,age);
    }
    public void salary()
    @Test
    {

        int salary=m.salary(20000);
        assertEquals(20000,salary);
    }

}