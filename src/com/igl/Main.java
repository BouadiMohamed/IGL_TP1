package com.igl;

import static com.igl.VectorHelper.*;

public class Main {

    public static void main(String[] args) throws DifferentDimensionException {
     int[] x={1,5,4,7};
      int[] z={4,2,4,10};
      int [] y = new int[4] ;
      y= sum(x,z);
      System.out.print(y[0]+" "+ y[1]+ " "+ y[2]+" "+ y[3]);
	// write your code here
    }
}
