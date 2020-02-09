package tests;

import org.testng.annotations.Test;
import pageObject.*;

public class TestCase {

    @Test
    public void NumberOfCharactersInSequenceTest()
    {
        NumberOfCharactersInSequence nocis = new NumberOfCharactersInSequence();
        //nocis.GiveStringToCheack("00000000");
        nocis.GiveStringToCheack("adadggfkayod");
        //nocis.GiveStringToCheack("atddueeebbgggg");
        //nocis.GiveStringToCheack("abcdefghijklmn");
    }
    @Test
    public void ArrayPrintBackRecursiaTest()
    {
       // int arr[]={1,2,3,4,5,6,7,8,9};
       // int i=12;

        ArrayPrintBackRecursia apbr = new ArrayPrintBackRecursia();
       // apbr.sendArrayAndNumber(arr,i);
        //apbr.reversStringMirro("kobi ovadia go sleep is late !!!");
        apbr.reversWordOnly("kobi ovadia go sleep is late !!!");

    }
    @Test
    public void findDuplicationCharOrIntTest()
    {
        String findCCharNotDuplicat="adadggfkayod";
        int findDuplicationDigit = 7657658;

        CharacterNotRepeated cnr = new CharacterNotRepeated();
        //cnr.giveMeString(findCCharNotDuplicat);

        cnr.giveMeInteger(findDuplicationDigit);

    }
    @Test
    public void ArraySortingTest()
    {
        int [] arrA={4,6,2,7,1,8};
        int[] arrB = {6,2,3,7,8,1,2};
        ArraySorting as = new ArraySorting();
        as.giveMeArrayToSort(arrB);
    }@Test
    public  void RecursionAssemblyTest()
    {
        RecursionAssembly rs = new RecursionAssembly();
        rs.giveMeNumberToAssembly(4);
    }
    @Test
    public void SpiltStringPageTest()
    {
        splitString ss = new splitString();
        ss.getStringAndChar("kobi ovadia go to sleep"," ");
    }
    @Test
    public void FibonacciPageTest(){
        Fibonacci fib = new Fibonacci();
        int  num = fib.recGiveMeNumber(7);
        int  num2 = fib.regularGiveMeNumber(7);

        System.out.println("Fibonacci for number: "+num);
        System.out.println("Fibonacci for number: "+num2);
    }
    @Test
    public void PalindromePageTest(){
        Palindrome pal = new Palindrome();
        pal.isPalindromeInt(4224);
        pal.isPalindromeString("a");
    }

}
