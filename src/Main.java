import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);


    }

    public static int[] getIntegers(int size){
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }


    public static void printArray(int[] array){
        int count = 0;
        for(int element : array){
            System.out.println("Element " + count + " contents " + element);
            count++;
        }
    }


    public static int[] sortIntegers(int[] array){
        boolean a = true;
        while(a){
            a = false;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] < array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    a = true;
                }
            }
        }
        return array;
    }

}

