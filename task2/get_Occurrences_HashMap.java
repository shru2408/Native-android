/* to create & return a HashMap<Integer, Integer> where :
Entry.Key represent an integer present in string s
Entry.Value represent the number of occurrences of that integer in string s
*/
package task2;

import java.util.*;

public class get_Occurrences_HashMap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String of integers which are separated by semicolon(;) ");
        String str=sc.nextLine();

        HashMap<Integer, Integer> hashMap=getOccurrencesHashMap(str);
        System.out.print("HashMap is { ");
        for (Map.Entry<Integer,Integer> entry: hashMap.entrySet()) {

            System.out.print(entry.getKey() + ":" + entry.getValue()+" " );

        }
        System.out.print("}");
    }

    public static HashMap<Integer,Integer> getOccurrencesHashMap(String S) {
        String[] str = S.split(";");
        List<Integer> integerList = new ArrayList<>();
        for(String s : str) integerList.add(Integer.parseInt(s));

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        Set<Integer> integerSet = new HashSet<>(integerList);
        for (Integer i : integerSet) hashMap.put(i, Collections.frequency(integerList, i));

        return hashMap;
    }
    }

/*Enter the String of integers which are separated by semicolon(;)
1;2;2;2;3;1
HashMap is { 1:2 2:3 3:1 }
*/