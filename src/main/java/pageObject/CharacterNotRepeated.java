package pageObject;

public class CharacterNotRepeated {
    public void giveMeString(String blop) {
        char[] ch = blop.toCharArray();
        int le = ch.length;
        char[] findChar = new char[le];

        int count = 0;
        int k = 0, m = 0;

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (count == 1) {
                findChar[k] = ch[i];
                k++;

            }

            count = 0;
        }
        if (k != 0) {
            for (int i = 0; i < findChar.length; i++)
                System.out.print(findChar[i] + " ");
        } else {
            System.out.println("All characters have the same signal duplication char ");
        }

    }

    public void giveMeInteger(int blop) {
        int tmp = blop;
        int tmp2 = blop;
        int i = 0;
        for (i = 0; tmp != 0; i++) {
            tmp /= 10;
        }

        int[] arrayNum = new int[i];
        int[] arrayNumTmp = new int[10];
        for (i = 0; i < arrayNumTmp.length; i++) {
            arrayNumTmp[i] = 0;
        }
        tmp2 = tmp = blop;

        for (i = 0; tmp2 != 0; i++) {
            tmp %= 10;
            arrayNum[i] = tmp;
            tmp = tmp2 = tmp2 / 10;
        }
        for (i = 0; i < arrayNum.length; i++) {
            for (int j = 0; j < arrayNum.length - 1; j++) {
                if (arrayNum[i] == arrayNum[j + 1]) {
                    arrayNumTmp[arrayNum[i]]++;
                }
            }
        }
            for(i=0;i<arrayNumTmp.length;i++){
               if(arrayNumTmp[i]>1)
                   System.out.println("Digit: "+i );

        }
    }
}
