package MyMoneyMyShares;

public class DistributeApples {
    public static void main(String[] args) {
        InputAndSort input = new InputAndSort();
        input.initialize();

        // checking if there are apples less than 3
        if(input.listOfApples.size() < 3){
            System.out.println("Not enough apples to distribute");
            return;
        }

        FindShare shares = new FindShare(input.totalWeightOfApples, input.listOfApples);
    }
}
