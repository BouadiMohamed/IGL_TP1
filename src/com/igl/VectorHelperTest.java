package com.igl;

import junit.framework.TestCase;

/**
 * Created by Bouadi Mohammed on 17/10/2017.
 */
public class VectorHelperTest extends TestCase {

    public static final int tab1[] ={10,5,32,48,-3,25};
    public static final int tab2[] ={12,8,30,42,-7,20};
    public static final int tab_reversed[]={25,-3,48,32,5,10};
    public static final int tab_sum[]={22,13,62,90,-10,45};
    public static final int tab_max_min[]={48,-3};
    public static final int tab_function[]= {20,10,64,96,-6,50};

    public void testTrier() throws Exception {
        int i=0;
        boolean sorted = true ;
        int tab[] = VectorHelper.trier(tab1);
            for(i=0;i<tab.length;i++){
                if(tab[i]>tab[i+1])
                {
                    sorted =false ;
                }
            }
            assertEquals(sorted,true);
    }

    public void testInverser() throws Exception {
        int tab[] = VectorHelper.inverser(tab1);
        for(int i=0;i<tab.length;i++){
            assertEquals(tab[i],tab_reversed[i]);
        }


    }

    public void testSum() throws Exception {
        int tab[] = VectorHelper.sum(tab1,tab2);
        for(int i=0;i<tab.length;i++){
            assertEquals(tab[i],tab_sum[i]);
        }
    }

    public void testApply() throws Exception {
        int tab[] = VectorHelper.apply(tab1,2);
        for(int i=0;i<tab.length;i++){
            assertEquals(tab[i],tab_function[i]);
        }
    }

    public void testMaxAndMin() throws Exception {
        int tab[] = VectorHelper.maxAndMin(tab1);
        for(int i=0;i<tab.length;i++){
            assertEquals(tab[i],tab_max_min[i]);
        }
    }

}