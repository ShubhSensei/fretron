package MyMoneyMyShares;

import java.util.ArrayList;
import java.util.Collections;

public class FindShare {
    private int totalWeightOfApples;
    private ArrayList<Integer> listOfApples;

    private int RamShare = 50;
    private int ShamShare = 30;
    private int RahimShare = 20;
    private int TotalAmount = 100;
    /*
     * Total apple bought worth is Rs 100, what if it is not 100 like what if it is 101 or 95? 
     * To solve this, we've to add the above shares but for simplicity, let's take Rs 100 for each test case
     */

    private int RamPercent;
    private int ShamPercent;
    private int RahimPercent;

    // ArrayList of proportion apples to print
    ArrayList<Integer> RamApple;
    ArrayList<Integer> ShamApple;
    ArrayList<Integer> RahimApple;

    FindShare(int totalWeightOfApples, ArrayList<Integer> listOfApples){
        this.totalWeightOfApples = totalWeightOfApples;
        this.listOfApples = listOfApples;
        RamApple = new ArrayList<>();
        ShamApple = new ArrayList<>();
        RahimApple = new ArrayList<>();
    }

    private void findPercentShare(){
        RamPercent = (RamShare / TotalAmount) * 100;
        ShamPercent = (ShamShare / TotalAmount) * 100;
        RahimPercent = (RahimShare / TotalAmount) * 100;
    }

    // Finding the share of grams of apples each individual will get
    public void findShare(){
        findPercentShare();
        int RamApples = (RamPercent / 100) * totalWeightOfApples;
        int ShamApples = (ShamPercent / 100) * totalWeightOfApples;
        int RahimApples = (RahimPercent / 100) * totalWeightOfApples;

        Collections.sort(listOfApples, Collections.reverseOrder());

        // Assign apples to Ram
        assignApples(RamApple, RamApples);

        // Assign apples to Sham
        assignApples(ShamApple, ShamApples);

        // Assign apples to Rahim
        assignApples(RahimApple, RahimApples);
    }

    // Helper function to assign apples to a person
    private void assignApples(ArrayList<Integer> personApples, int targetWeight) {
        int currentWeight = 0;
        int i = 0;
        while (currentWeight < targetWeight && i < listOfApples.size()) {
            if (listOfApples.get(i) != 0) { // Only consider unassigned apples
                // Find the closest apple weight to the remaining weight needed
                int remainingWeight = targetWeight - currentWeight;
                if (listOfApples.get(i) <= remainingWeight) {
                    personApples.add(listOfApples.get(i));
                    currentWeight += listOfApples.get(i);
                    listOfApples.set(i, 0); // Mark the apple as assigned
                }
            }
            i++;
        }
    }

    public void printDistribution(){
        System.out.println("Distribution Result : ");
        System.out.print("Ram : ");
        for (int apple : RamApple) {
            System.out.print(apple + " ");
        }
        System.out.println();

        System.out.print("Sham : ");
        for (int apple : ShamApple) {
            System.out.print(apple + " ");
        }
        System.out.println();

        System.out.print("Rahim : ");
        for (int apple : RahimApple) {
            System.out.print(apple + " ");
        }
        System.out.println();
    }
}
