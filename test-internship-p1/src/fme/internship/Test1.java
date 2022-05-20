/*______________________________________________________________________________________________________
 * 
 * Write a Java program that reads arguments from the command line 
 * and checks whether all numeric positive non-zero values appear in ascending order.
 * _____________________________________________________________________________________________________
 * 
 * 
 * Example:
 * 
 *______________________________________________________________________________________________________
 *
 *  Input:
 *      java Test1 1 0 -2 3 5 -7 -9 7 8 
 *  Output:
 *      YES
 *______________________________________________________________________________________________________
 *      
 *______________________________________________________________________________________________________
 *  
 *  Input:
 *      java Test1 1 0 -2 3 5 -7 -9 4 7 8 
 *  Output:
 *      NO
 *______________________________________________________________________________________________________
 *
 *______________________________________________________________________________________________________ 
 */

package fme.internship;

import static java.lang.Integer.parseInt;

/**
 * 
 * @author <Spatariu Alin Mihai>
 * @email <spatariualin07@gmail.com>
 * 
 */
public class Test1 {
    // This method return 1 if an array is sorted else return 0
    static int isArraySortedOrNot(int array[],int numberOfElements){
        if(numberOfElements == 1 || numberOfElements ==0)
            return 1;
        if(array[numberOfElements-1]<array[numberOfElements-2])
            return 0;
        return isArraySortedOrNot(array,numberOfElements-1);
    }

    public static void main(String[] args) {
        int [] array = new int[args.length];
        int numberOfPositiveNumbers=0;
        //taking the numbers from the command line
        if(args.length < 0)
        {
            System.out.println("There are no arguments");
        }
        else
        {
            for(String val:args)
            {
                if(parseInt(val)>0) {
                    array[numberOfPositiveNumbers] = parseInt(val);
                    numberOfPositiveNumbers++;
                }
            }
        }

        if(isArraySortedOrNot(array,numberOfPositiveNumbers)!=0){
            System.out.println("YES");

        }else
        {
            System.out.println("NO");
        }
    }
}