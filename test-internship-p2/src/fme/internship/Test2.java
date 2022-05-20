/*______________________________________________________________________________________________________
 * 
 * Write a Java program that reads text from a file and prints out the third most frequent word(s)
 * in the text. If there is more than one word they will all be printed. 
 * 
 * The text contains only alpha-numerical characters and spaces, 
 * and words are delimited by one or more spaces.
 * _____________________________________________________________________________________________________
 * 
 * 
 * Example:
 * 
 *______________________________________________________________________________________________________
 *
 *  Input: test.in
 *      
 *       test1 test2 test3 test1 test test2 test2
 *       test1 test3 test1 test test0
 *       
 *  Output:
 *      test3, test
 *______________________________________________________________________________________________________
 *
 *______________________________________________________________________________________________________ 
 */

package fme.internship;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * 
 * @author <Spatariu Alin Mihai>
 * @email <spatariualin07@gmail.com>
 * 
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Alin\\Desktop\\Facultate Automatica\\Jobs\\FME\\fme-internship-2022\\test-internship-p2\\src\\test.in");
        Scanner scanner = new Scanner(file);
        ArrayList<String> words = new ArrayList<>();
        // puting all the words into an arraylist of string
        while(scanner.hasNext()){
            words.add(scanner.next());
        }
        // Using a HashMap i determine every appartion of every word. I use a HashMap beacuse it cannot allow the duplicates
        Map<String, Integer> map = new HashMap<>();
        for (String s :words) {
            if (map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }
        // Using an array I took all the appearance of the words
        int [] array = new int[123];
        int n=0;
        for(Map.Entry<String,Integer>entry : map.entrySet()){
            array[n]=entry.getValue();
            n++;
        }
        //Determine the third maximum appearance
        int first = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > first)
                first = array[i];
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++)
            if (array[i] > second && array[i] < first)
                second = array[i];
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++)
            if (array[i] > third && array[i] < second)
                third = array[i];
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()==third)
                System.out.println(entry.getKey()+ " ");
        }
        System.out.println("FME Internship - Test2");
    }
}