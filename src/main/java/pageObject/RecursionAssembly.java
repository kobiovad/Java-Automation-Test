package pageObject;

public class RecursionAssembly {
    int tmp = 1;
    public void giveMeNumberToAssembly(int num)
    {
        if(num>0)
        {
            tmp*=num;
            giveMeNumberToAssembly(num-1);
        }
        else
        {
            if(tmp==1) {
                System.out.println("Positive numbers only ");
            }
            else
                System.out.println("Assembly = " + tmp);
        }

    }
}
