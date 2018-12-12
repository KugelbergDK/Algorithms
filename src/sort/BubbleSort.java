package sort;

import timer.Timer;



public class BubbleSort {

    public static void main(String[] args) {


        Timer.start();


        int[] myInts = {234,235,23,34,1,234,5,2,3,5,4,67,5,3,5,7,3,2};
        int myIntTemp;


        int iter = 0;
        while (iter < myInts.length){
            for (int i = 0; i <= myInts.length; i++) {
                try {
                    if (myInts[i] >= myInts[i + 1]) {
                        myIntTemp = myInts[i + 1];
                        myInts[i + 1] = myInts[i];
                        myInts[i] = myIntTemp;
                    }
                }
                catch (ArrayIndexOutOfBoundsException arraysExc){
                    break;
                }
            }
            iter++;
        }
        for (int myInt: myInts) System.out.print(myInt + ", ");



        Timer.stop();



    }
}
