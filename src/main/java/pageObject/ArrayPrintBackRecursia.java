package pageObject;

public class ArrayPrintBackRecursia {

    public void sendArrayAndNumber(int arr[],int fromIndex) {
        if (fromIndex >= 0 && arr.length > fromIndex) {
            System.out.print(arr[fromIndex] + ",");
            sendArrayAndNumber(arr, fromIndex - 1);
        } else {
            System.out.println("Select number between 0-"+(arr.length-1));
        }
    }
    public void reversStringMirro(String blop){
        char[] ch = blop.toCharArray();
        System.out.println("Orginal String: "+blop);
        System.out.print("Revers String: ");
        for (int i=ch.length;i>0;i--)
            System.out.print(ch[i - 1]);
    }
    public void reversWordOnly(String blop){
        String [] newArray =blop.split(" ");

        for(int i=0; i<newArray.length;i++){
            char[] tmpChar= newArray[i].toCharArray();
            for (int j=tmpChar.length;j>0;j--){
                System.out.print(tmpChar[j-1]);
            }
            System.out.print(" ");
        }
    }
}
