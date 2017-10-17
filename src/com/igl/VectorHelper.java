package com.igl;

import java.util.function.Function;

/**
 * Created by Bouadi Mohammed on 11/10/2017.
 */
public class VectorHelper {

        public static int[] trier(int[] tab){
            int i=0;
            int j=0;
            int permut_count =0;
            do {
                permut_count = 0;
                for(i=0;i<tab.length-1;i++){
                    if(tab[i]>tab[i+1]){
                        permut_count=1;
                        j=tab[i];
                        tab[i]=tab[i+1];
                        tab[i+1]=j;
                    }
                }
            } while(permut_count !=0);
            return tab;
        }

        public static int[] inverser (int[] tab){
            int temp=0;

            for (int i=0;i<tab.length/2;i++){
                temp= tab[i];
                tab[i]=tab[tab.length-i-1];
                tab[tab.length-i-1]=temp;
            }
            return tab;

        }
    public static int[] sum(int[] v, int[] u) throws DifferentDimensionException
     {
               if(v.length != u.length) throw new DifferentDimensionException();
               int[] w = new int[v.length];
               for(int i = 0; i < w.length; i++)
               {
                    w[i] = v[i] + u[i];
               }
               return w;
     }

    public static void apply(int v[], Function<Integer, Integer> m)
    {
               for(int i = 0; i < v.length - 1 ; i++)
               {
                               v[i] = m.apply(v[i]);
              }
              }

    public static int[] maxAndMin( int[] v)
     {
                int res[] = new int[2];
                res[0] = res[1] = v[0];
                for(int i = 1; i < v.length; i++)
                    {
                        if(v[i] > res[0]) res[0] = v[i];
                        if(v[i] < res[1]) res[1] = v[i];
                    }
              return res;

     }
}
