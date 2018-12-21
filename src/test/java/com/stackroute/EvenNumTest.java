package com.stackroute;
import org.junit.Test;
import  org.junit.Assert.*;



public class EvenNumTest {
    @Test
    public void EvenCheck(){
        boolean result = isEven(10);
        assertEquals(true,result);
    }
}
