public class Array_Largest {
    public static void main(String[] args) {
        int []arr={10,5,20,30,40,50};
        int length=arr.length;
        int i,j,large=arr[0];
        for(i=0;i<length;i++)
        {
          if(arr[i]>large)
          {
              large=arr[i];
          }
        }
        System.out.println(large);
    }
}
