package com.igl;

import static com.igl.VectorHelper.inverser;
import static com.igl.VectorHelper.sum;
import static com.igl.VectorHelper.trier;

public class Main {

    public static void main(String[] args) throws DifferentDimensionException {
     int[] x={1,5,4,7};
      int[] z={4,2,4,10};
      int [] y = new int[4] ;
      y= (x,z);
      System.out.print(y[0]+" "+ y[1]+ " "+ y[2]+" "+ y[3]);
	// write your code here
    }
}
