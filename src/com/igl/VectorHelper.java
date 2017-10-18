package com.igl;

import java.util.function.Function;

/**
 * Created by Bouadi Mohamed on 11/10/2017.
 *
 * Ce projet est dans le cadre du TP IGL 1 CS
 * @version : 1.0
 * @author : Bouadi Mohamed
 * Date : 11/10/2017
 */

/**
 * Cette classe est une classe utilitaire pour établir des methodes sur les vecteurs
 */
public class VectorHelper {

    /**
     * Trier le tableau tab en utilisant un tri par bull
     * @param tab un tableau d'entiers qu'on va trier
     * @return une copie triée de tab
     */

    public static int[] trier(int[] tab)
        {

            int i=0;
            int j=0; // variable intermédiare
            int permut_count =0; // nous indique si il y'avait une perumtaion
            do {
                permut_count = 0;
                for(i=0;i<tab.length-1;i++){
                    if(tab[i]>tab[i+1]){
                        permut_count=1;
                        // Permuter
                        j=tab[i];
                        tab[i]=tab[i+1];
                        tab[i+1]=j;
                    }
                }
            } while(permut_count !=0);
            return tab;
        }

    /**
     * inverser l'ordre des elements de tab
     * @param tab un tableau d'entier qu'on va inverser
     * @return une copie inversée de tab
     */



        public static int[] inverser (int[] tab){

            int temp=0; // varibale inter pour la permutation
        /*
		Example d'utilisation :
			int tab[] = {31,54,8,64,89,102,35,45,1,25,-5};

			apres l'appel

			tab[] = {-5,25,1,45,35,102,89,64,8,54,31};
		 */
            for (int i=0;i<tab.length/2;i++){
                temp= tab[i];
                tab[i]=tab[tab.length-i-1];
                tab[tab.length-i-1]=temp;
            }
            return tab;

        }

    /**
     * sommer deux tableau case par case et génere un troisieme tableau
     * @param v : tableau d'entiers 1
     * @param u : tableau d'entiers 2
     * @return un tableau d'entiers dont chaque case est la somme de deux cases tab1[i] + tab2[i]
     * @throws DifferentDimensionException qui indique que les tableaux ont des tailles differentes
     */

    public static int[] sum(int[] v, int[] u) throws DifferentDimensionException
     {
               if(v.length != u.length) throw new DifferentDimensionException();// Lancer une exception ( taille differente )
               int[] w = new int[v.length];
               for(int i = 0; i < w.length; i++) // sommer case par case
               {
                    w[i] = v[i] + u[i];
               }
               return w;
     }

    /**
     * multiplier chaque case par facteur
     * @param v tableau d'entiers
     * @param n le facteur de multiplication
     * @return une copie du tableau tab multiplié par facteur
     */

    public static int[] apply(int v[],int n) {
        for (int i = 0; i < v.length; i++) {
            v[i] = v[i] * n;
        }
        return v;
    }
    /**
     *
     * @param v le tableau dont on va determiner le min et max
     * @return un tableau dont le premier element est le max et le deuxieme est le min
     */
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
