package tests;

import org.testng.annotations.Test;
import pageObject.*;

public class TestCase {

    @Test
    public void NumberOfCharactersInSequenceTest()
    {
        NumberOfCharactersInSequence nocis = new NumberOfCharactersInSequence();
        nocis.GiveStringToCheack("00000000");
        //nocis.GiveStringToCheack("atddueeebbg");
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
    public void findDuplicationCharTest()
    {
        String findDuplicationChar="abab     \n 67*zff";

        CharacterNotRepeated cnr = new CharacterNotRepeated();
        cnr.giveMeString(findDuplicationChar);

       // cnr.giveMeInteger(76567);

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
    public void spiltStringPage()
    {
        splitString ss = new splitString();
        ss.getStringAndChar("kobi ovadia go to sleep"," ");
    }

}
