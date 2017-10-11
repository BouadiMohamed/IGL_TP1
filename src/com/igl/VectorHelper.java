package com.igl;

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
            } while(permut_count ==0);
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
}
