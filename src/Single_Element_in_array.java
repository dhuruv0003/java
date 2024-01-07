public class Single_Element_in_array {
    public static int getSingleElement(int []arr){
        int j=0;
        int single=arr[0];
        int count=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[j] && count==1)
            {
                single=arr[i];
                j=i+1;
                count=0;
            }
            else
                count++;
        }
        return single;
    }
}
