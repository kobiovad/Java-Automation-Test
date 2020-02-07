package pageObject;

public class splitString {
    public void getStringAndChar(String blop,String oneTav){
        String [] newArray = blop.split(oneTav);
        char[] ch = blop.toCharArray();
        char[] t = oneTav.toCharArray();
        int count=0;

        for (int i=0; i<ch.length;i++) {
            if (ch[i]==t[0])
                 count++;
        }
        if(count!=0){
        for (int i =newArray.length-1;i>=0;i--){
            System.out.print(newArray[i]+" ");
        }}
        else
            System.out.println("The character is not in the String !!!");

    }
}
