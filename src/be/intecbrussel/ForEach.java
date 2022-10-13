package be.intecbrussel;

public class ForEach {

    public static void main(String[] args) {

        // normale for loop
        int[] myArr = {100, 200, 300};

//        for(int index = 0; index < myArr.length; index++) {
//            System.out.println(myArr[index]);
//        }

        // for each -> enhanced for loop
        for(int element : myArr) {

            element = element * 3;

            System.out.println(element);
        }

        // 3 array van verschillende types en die laten overlopen
        // met een for each. Als je cijfers hebt.  Maak daar een calculatie mee.



    }

}
