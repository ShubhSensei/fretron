package MyMoneyMyShares;

import java.util.ArrayList;

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
    }

    private void findPercentShare(){
        RamPercent = (RamShare / TotalAmount) * 100;
        ShamPercent = (ShamShare / TotalAmount) * 100;
        RahimPercent = (RahimShare / TotalAmount) * 100;
    }

    // Finding the share of grams of apples each individual will get
    private void findShare(){
        findPercentShare();
        int RamApples = (RamPercent / 100) * totalWeightOfApples;
        int ShamApples = (ShamPercent / 100) * totalWeightOfApples;
        int RahimApples = (RahimPercent / 100) * totalWeightOfApples;

        int appleWeight = 0;
        while(appleWeight != RamApples){
            for (int item : listOfApples) {
                appleWeight += item;
                if(appleWeight <= RamApples){
                    RamApple.add(item);
                    item = 0;
                }else{
                    
                }
            }
        }
    }
}
