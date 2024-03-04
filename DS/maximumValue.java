package DS;

public class maximumValue {
    static int i,j,res,max,temp=0,a[];

    public static void main(String[] args) {
        int res = maximumValue.max(new int[]{173,29,391,41});
        System.out.println("Largest value in the given array is :"+res);
                           
    }
    static int max(int a[])
    {
        max = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=a[max]){
                max=i;
            }
            
        }
        return (a[max]);
    }
    // static int maximum(int a[])
    // {
    //     int max = 0;
    //     for(int i=0;i<a.length;i++)
    //     {
    //         if(a[i]>=a[max]){
    //             max=i;
    //         }
            
    //     }
    //     return (a[max]);
    // } 
    
}
