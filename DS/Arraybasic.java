package DS;

public class Arraybasic {
    public static void main(String[] args) {

        int a[] = { 33, 3, 4, 5 };
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("----------------");
        int arr[] = {33, 3, 4, 5};
        for(int i:arr)
        {
            System.out.println(i);
        }
        System.out.println(arr[5]);
    }
}
