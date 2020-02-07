package pageObject;

public class NumberOfCharactersInSequence {
    public void GiveStringToCheack(String blop) {

        System.out.println();
        System.out.println("Your String: "+blop);
        char[] ch = blop.toCharArray();
        int count=0;
        int maxString = 0;
        int indexChar = 0;
        char letterChar = ch[0];

        for (int i=0;i< ch.length-1;i++)
        {
            if(ch[i]==ch[i+1])
            {
                count++;
                if(maxString < count )
                {
                    maxString = count;
                    letterChar = ch[i];
                    indexChar = i-count+1;
                }
            }
            else
            {
                count=0;
            }

        }
        if(maxString == 0)
            System.out.println("All The Number Diffrent !");
        else
            System.out.println("The position is: "+ (indexChar) + "\nThe Max appears: " +  (maxString+1)+ "\nThe Letter is: "+ letterChar);

    }
}
