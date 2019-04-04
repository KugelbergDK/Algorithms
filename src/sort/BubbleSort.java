package sort;

import timer.Timer;

import java.util.ArrayList;


public class BubbleSort {

    public static int[] sorter(int[] liste){

        Timer.start();
        int myIntTemp;
        int iter = 0;
        while (iter < liste.length){
            for (int i = liste.length-1; i > 0; i--) {
                if (liste[i-1] > liste[i]){
                    myIntTemp = liste[i - 1];
                    liste[i - 1] = liste[i];
                    liste[i] = myIntTemp;
                }
            }
            iter++;
        }
        return liste;
    }



    /*
    public static int[] sorter(int[] liste){

        Timer.start();
        int myIntTemp;
        int iter = 0;
        while (iter < liste.length){
            for (int i = 0; i <= liste.length; i++) {
                try {
                    if (liste[i] >= liste[i + 1]) {
                        myIntTemp = liste[i + 1];
                        liste[i + 1] = liste[i];
                        liste[i] = myIntTemp;
                    }
                }
                catch (ArrayIndexOutOfBoundsException arraysExc){
                    break;
                }
            }
            iter++;
        }
        Timer.stop();
        return liste;
    }
     */

}
