package com.stackroute;
import org.junit.Test;

import static org.junit.Assert.*;
public class powerTest
{

  @Test
  public void power()
  {
    Power p = new Power();
    String result = p.isPower(55);
    assertEquals("not a power of four", result);
  }

  @Test
    Power p1=new Power();
  String result1=p1.isPower(16);
  assertEquals("is a power of four",result1);



}

