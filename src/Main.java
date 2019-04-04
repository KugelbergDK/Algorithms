import sort.BubbleSort;
import timer.Timer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args){

        int[] liste = {1,5,3,1,0,8,12,58,384,2,59,38,59,69};
        System.out.println(Arrays.toString(liste));

        // DO NOT DELETE THIS
        Timer.start();


        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted = bubbleSort.sorter(liste);


        // DO NOT DELETE THIS
        Timer.stop();



    }
}
