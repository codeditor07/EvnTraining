public class Array_Smallest {
    public static void main(String[] args) {
        int arr1[]={10,5,15,20,6};
        int i=0,j=0;
        int length = arr1.length;
        int []arr2=new int[length];
        for ( i=length-1; i>=0;i--)
        {
             arr2[j]=arr1[i];
             j++;

        }
        for (i=0;i<length;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
