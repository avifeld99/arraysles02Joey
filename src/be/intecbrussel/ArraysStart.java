package be.intecbrussel;

public class ArraysStart {

    public static void main(String[] args) {

        // array is een verzameling van elements

        // elements -> data -> primitieve datatypes byte tm int double, boolean
        // objecten erin zetten -> String

        // we moeten meegeven hoe groot dat een array moet zijn.

        //int[] myIntArr = new int[10];

        // keyword new dat we spreken over een object.

        byte[] myByteArr = {1, 10, 30};
        //                  0   1   2
        // index van de array -> index begint altijd van 0

        System.out.println(myByteArr[2]);

        // niet mogelijk om buiten de range van de array te zoeken.
        //System.out.println(myByteArr[-1]);

        int[] myIntArr = new int[10];
        boolean[] myBooArr = new boolean[5];
        String[] names = new String[3];
        StringBuilder[] name = new StringBuilder[2];

        // Als de array leeg og je print een lege plek uit. Krijgen we de
        // default waarden. bv boolean = false.
        System.out.println(myIntArr[0]);
        System.out.println(myBooArr[2]);
        System.out.println(names[2]);

        System.out.println(name[1]);

        // creeren
        // deze manier maken we de array en vullen de array meteen.
        short[] myShortArr = {2, 5, 7};

        // hier maken we een array maar kunnen we kiezen of we die vullen.
        long[] myLongArr = new long[5];
        myLongArr[0] = 2000L;

        // Dit is grootst gedeelt gebruikelijk.
        int[] number = new int[3];

        // niet handig maar het werkt
        //int num[] = new int[3];

        // we kunnen de lengte niet aanpassen maar de waarde wel.
        byte[] myByteArr01 = {1, 10, 30};

//        System.out.println(myByteArr01[0]);
//
//        myByteArr01[0] = 100;
//
//        System.out.println(myByteArr01[0]);

        // array is een object en voordeel is dat we een
        // methode kunnen gebruiken

        // System.out.println(myByteArr01.length);

        // variabelen plaatsen in een array
        int num01 = 10;
        int[] numbers = new int[5];
        numbers[0] = num01;

        System.out.println(numbers[0]);

        // for loop om alles uit te printen
        byte[] myByteArr02 = {1, 10, 30};
        for(int index = 0; index < myByteArr02.length; index++) {
            System.out.println(myByteArr02[index]);
        }

        // for loop -> hoe vaak dat hij moet rondgaan.
        // while -> blijft lopen tot dat de conditie false is.
        // voorkeur voor een array uit te printen is een for loop.
        // doordat deze overzichtelijker is.
        int[] numbersArr = {2, 4, 6, 8, 10};
        int index = 0;
        while (index < numbersArr.length) {
            System.out.println("This iteration is done by a While loop: " +
                    numbersArr[index]);
            index++;
        }

    }

}
