package recursion;

/**
 * @author lucas og Nicklas Bring
 */
public class Recursion {

    private static int x2 = 0;
    private static long fakMax = 10;
    private static long res3 = fakMax;
    private static long res4 = fakMax;
    private static int fib5;
    private static int x5;

    /**
     * Opgave 1
     * Dont run this
     */
    public static void uendeligt(){
        System.out.println("Jeg er uendelig");
        uendeligt();
    }

    /**
     * Opgave 2
     */
    public static void ettilti(){
        if (x2 < 10){
            x2 += 1;
            System.out.println(x2);
            ettilti();
        }

    }

    /**
     * Opgave 3
     */
    public static void fakultet(){
        if (fakMax > 1) {
            res3 *= (fakMax -1);
            fakMax--;
            System.out.println(res3);
            fakultet();
        }

    }

    /**
     * Opgave 4
     */
    public static void fakultetLoop(){
        for (long i = fakMax; i > 1; i--) {
            res4 *= (fakMax-1);
            fakMax--;
            System.out.println(res4);
        }
    }

    /**
     * Opgave 5
     */
    static long before1 = 0;
    static long before2 = 1;
    static long res5 = 0;
    public static void fiboNumbers(){
        if (res5 < 1000000000){
            res5 = before1+before2;
            System.out.print(res5 + ", ");
            // Flyt before 1 op til before 2
            before1 = before2;
            // Assign before 2 til res
            before2 = res5;
            fiboNumbers();
        }

    }







}
