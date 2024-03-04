package DS;

public class ArrayIntersection {
    static int i, j, c = 0;

    public static void main(String[] args) {
        int[] x = { 2, 5, 3, 7 };
        System.out.println("First array is " + " ");
        display(x);
        int[] y = { 5, 2, 9, 0, 1 };
        System.out.println("Second array is " + " ");
        display(y);
        int[] z = intersection(x, y);
        System.out.println("Intersection of two array is " + " ");
        display(z);
    }

    static void display(int temp[]) {
        for (i = 0; i < temp.length; i++) {
            System.out.println(" " + temp[i] + " ");
        }
    }

    static int[] intersection(int x[],int y[])
    {
        int[]z = new int[x.length+y.length];
        for(int i=0;i<(x.length);i++)
        {
          if(x[i]==y[i])
          {
            z[c] = x[i];
            c++;
          }
          else
          {
            continue;
          }
        }
        return z;
    }
}
