package com.stackroute;
import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest
{
    Factorial factor = new Factorial();
    @Test

    public void findfact()
    {
        int fact = factor.findfact(5);
        assertEquals("120",fact);
    }
}