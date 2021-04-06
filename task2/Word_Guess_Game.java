package task2;

import java.util.Scanner;

public class Word_Guess_Game {
    public static boolean startGame(String S) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder(S);

        for(int i = 0; i < S.length(); i++) {
            if((int)S.charAt(i) != 'A' && (int)S.charAt(i) != 'E' && (int)S.charAt(i) != 'I' && (int)S.charAt(i) != 'O' && (int)S.charAt(i) != 'U') {
                count++;
                stringBuilder.append("_");
            }
            else
                stringBuilder.append(S.charAt(i));
        }

       // System.out.print("\n" + stringBuilder1 + "\n");

        int chances = count + 2; //5
        int j = 0;
        String alphabet;
        boolean condition = false;

        while(chances--!=0) {

            System.out.print("\nWord : " + stringBuilder + "\n");
            System.out.print("Chances : " + (chances +1) + "\n");
            System.out.print("Guess Alphabet except the Vowels : ");
            alphabet = scanner.next().toUpperCase();

            for(int i = 0; i < S.length(); i++) {
                if(alphabet.charAt(0) == S.charAt(i)) {
                    j++;
                    stringBuilder.setCharAt(i,alphabet.charAt(0));
                }
            }

            if(j > 0) {
                System.out.print("Guess Alphabet " + alphabet + " found " + j +"\n");
            }
            else
                System.out.print("Sorry! Guess Alphabet not found!\n");

            j = 0;
            System.out.println("\nHurry up! Only one chance left.");
            if(stringBuilder.toString().equals(stringBuilder1.toString())) {
                condition = true;
                break;
            }

        }

        return condition;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("For playing an amazing game!\n ");
        System.out.print("Enter a Word of your choice: ");
        String str = scanner.next().toUpperCase();
        if(startGame(str))
            System.out.print("\n%%**Congratulations**%%\nYou win!\n");
        else
            System.out.print("\nOOPS! You lose\n Better luck next time!");
    }
}


/*For playing an amazing game!
 Enter a Word of your choice: ja

Word : _A
Chances : 3
Guess Alphabet except the Vowels : k
Sorry! Guess Alphabet not found!

Hurry up! Only one chance left.

Word : _A
Chances : 2
Guess Alphabet except the Vowels : d
Sorry! Guess Alphabet not found!

Hurry up! Only one chance left.

Word : _A
Chances : 1
Guess Alphabet except the Vowels : j
Guess Alphabet J found 1

Hurry up! Only one chance left.

%%**Congratulations**%%
You win!
*/