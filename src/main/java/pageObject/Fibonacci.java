package pageObject;

public class Fibonacci {
    public int  recGiveMeNumber(int num) {
        if (num <= 1) {
            return num;
        }
        return recGiveMeNumber(num - 1) + recGiveMeNumber(num - 2);
    }
    public int regularGiveMeNumber(int num){
        int[] fibArray = new int[num+2];
        fibArray[0]=0;
        fibArray[1]=1;
        for(int i=2;i<=num;i++){
            fibArray[i]= fibArray[i-1]+fibArray[i-2];
        }
        return fibArray[num];
    }
}
