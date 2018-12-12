package search;


public class LinearSearch {
    int[] myData = {234,235,23,34,1,234,5,2,3,5,4,67,5,3,5,7,3,2};
    String[] myStrings = {"Hej", "jeH", "Tobias", "Lucas"};


    public LinearSearch() {
        System.out.println("Søger...");

    }


    public int findInt(int x){

        for (int i = 0; i< myData.length;i++ ){

            if (myData[i] == x){
                return i;
            }
        }
        return -1;
    }

    public String findString(String tekstStreng){

        int i = 0;
        for(String streng : myStrings){
            if (streng.equals(tekstStreng) || streng.equalsIgnoreCase(tekstStreng)){
                return streng;
            }
        }
        return "Findes ikke...";

    }




}
