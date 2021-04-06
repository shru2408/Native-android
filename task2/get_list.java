//to create & return a List which will contain all the integers present in string s.
package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class get_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        List<Integer> list = getlist(str);
        System.out.println("The resulting string is: " + list);
    }

        public static List<Integer> getlist(String str) {
            String[] str1 = str.split(";");
            List<Integer> list = new ArrayList<>();
            for (String s : str1) {
                list.add(Integer.parseInt(s));
            }
            return list;
        }
    }

/*Enter a string:
94;29;83;12;30
The resulting string is: [94, 29, 83, 12, 30]
*/
