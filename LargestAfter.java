package lab5;

/**
 * 
 * @author Fabrice ngahadjo
 * 09/21/2022
 * INFO-C211
 *
 */
public class LargestAfter {
	// Finds the first larger number after the given index
    static int largerAfter(int[] a, int start)
    {
            int i, j;
            int n = a.length;
            for (i = start+1; i<n; i++)
            {
            	if (a[i]<a[start])
                {
                    i++;
                }
                else
                {
                    return i;
                }
            }
            return start;            
    }
    public static void main(String[] args) {
            int[] numbers = {1};
            int n = numbers.length;
            int index = 0;            
            if (index>=n)
            {
                System.out.println("Array index out of bound");
            }
            else
            {
            	int largestNumber = largerAfter(numbers, index);
                if (largestNumber==index)
                {
                    System.out.println("Largest after " + numbers[index] + ": " + numbers[largestNumber]+"(Itself)");
                }
                else
                {
                    System.out.println("Largest after " + numbers[index] + ": " + numbers[largestNumber]);
                }
            }
    }
}
