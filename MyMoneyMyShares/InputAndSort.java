package MyMoneyMyShares;

import java.util.*;
public class InputAndSort {
    ArrayList<Integer> listOfApples = new ArrayList<>();
    int totalWeightOfApples = 0;

    public void initialize(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter apple weight in gram (-1 to stop ) : ");
        int appleWeight;
        while((appleWeight = sc.nextInt()) != -1){
            addApples(appleWeight);
        }

        // sorting the array in descending order
        Collections.sort(listOfApples, Collections.reverseOrder());

        sc.close();
    }
    
    private void addApples(int appleWeight){
        System.out.print("Enter apple weight in gram (-1 to stop ) : ");
        listOfApples.add(appleWeight);
        totalWeightOfApples = totalWeightOfApples + appleWeight;
    }
}
