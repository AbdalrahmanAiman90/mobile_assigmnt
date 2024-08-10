import java.util.Scanner;

class concatenate {
    // task 1
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size array 1");
        int arrsize1 = input.nextInt();
        System.out.println("enter size array 2");
        int arrsize2 = input.nextInt();
        int[] array1 = new int[arrsize1];
        int[] array2 = new int[arrsize2];
        System.out.println("enter array one");
        for (int i = 0; i < arrsize1; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println("enter array two");

        for (int i = 0; i < arrsize2; i++) {
            array2[i] = input.nextInt();
        }
        int[] array3 = new int[arrsize1 + arrsize2];
        for (int i = 0; i < arrsize1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < arrsize2; i++) {
            array3[arrsize1 + i] = array2[i];
        }
        System.out.println("new array is ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}

// task 2
// class TakeName {

// public static void main(String args[]) {
// Scanner input = new Scanner(System.in);
// String nameUser = input.nextLine();
// String[] nameSpilt = nameUser.split(" ");
// for (int i = 0; i < nameSpilt.length; i++) {
// System.out.println(nameSpilt[i]);
// }

// }
// }