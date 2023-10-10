package others;

public class Q5_insert {
    public static void main(String[] args) {

        int[] arr = { 10, 2, 6, 4, 3, 7, 5 };

        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i=1; i < arr.length; i++) {
            int standard = arr[i];
            //바로 앞
            int compareIndex = i-1;
            //만약 0고 앞의 것이 더 크면
            while(compareIndex >= 0 && standard < arr[compareIndex]) {
                //앞의 것을 뒤에 넣음
                arr[compareIndex+1] = arr[compareIndex];
                compareIndex--;
            }
            arr[compareIndex + 1] = standard;
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
