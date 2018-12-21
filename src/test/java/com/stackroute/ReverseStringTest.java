package com.stackroute;
import static org.junit.Assert.*;
import org.junit.Test;


public  class ReverseStringTest {


     ReverseString rever = new ReverseString();
  @Test
    public  void reversefun()
    {


        String result = rever.reversefun("malayalam");
        assertEquals("malayalam",result);


    }

}
