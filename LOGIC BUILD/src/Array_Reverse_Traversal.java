public class Array_Reverse_Traversal {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int length =arr.length;

        System.out.println("Traversal:");
        for (int i=length-1 ; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Size of array is:"+length);
    }
}
