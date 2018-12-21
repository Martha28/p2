package com.stackroute;
import org.junit.Test;

import static org.junit.Assert.*;
public class GradeTest
        {
            Grades g= new Grades();
            @Test
            public void average()
            {
                int aver=g.average(3,{92,57,65});
                assertEquals("71",aver);
            }
            @Test
            public void minNum()
            {
                int min=g.minNum({92,57,65});
                assertEquals("57",min);
            }
            @Test
            public void maxNum()
            {
                int max=g.minNum({92,57,65});
                assertEquals("92",max);
            }


        }