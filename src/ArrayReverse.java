public class ArrayReverse {
    public static void main(String[] args) {
        int[] newArray = new int[10];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i + 1;
            System.out.print(newArray[i]);

        }
        System.out.println("");
        for (int i = 0; i < newArray.length / 2; i++) {
            int temp = newArray[i];
            int i1 = newArray.length - 1 - i;
            newArray[i] = newArray[i1];
            newArray[i1] = temp;

        }
        for (int i : newArray) {
            System.out.print(i);
        }
    }
}

