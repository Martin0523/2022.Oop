package Dictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        DictionaryService service =
//                new DictionaryService(DictionaryType.ARRAY_LIST);
//        Scanner scanner = new Scanner(System.in);
//        while( true ) {
//            System.out.print("Word to find ( Enter <end> for exit): ");
//            String word = scanner.nextLine();
//            if( word.equalsIgnoreCase( "end")){
//                break;
//            }
//            System.out.println(" Find(" + word + "): " + service.findWord(word));
//        }
//        scanner.close();


        System.out.println("Array list:");
        long startTime = System.nanoTime();
        DictionaryService service = new
                DictionaryService(DictionaryType.ARRAY_LIST);
        service.findWordsFile("bible.txt");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " +
                timeElapsed / 1000000);

        System.out.println("Hash set:");
        long startTime2 = System.nanoTime();
        DictionaryService service2 = new
                DictionaryService(DictionaryType.HASH_SET);
        service2.findWordsFile("bible.txt");
        long endTime2 = System.nanoTime();
        long timeElapsed2 = endTime2 - startTime2;
        System.out.println("Execution time in milliseconds: " +
                timeElapsed2 / 1000000);

        System.out.println("Tree set");
        long startTime3 = System.nanoTime();
        DictionaryService service3 = new
                DictionaryService(DictionaryType.TREE_SET);
        service3.findWordsFile("bible.txt");
        long endTime3 = System.nanoTime();
        long timeElapsed3 = endTime3 - startTime3;
        System.out.println("Execution time in milliseconds: " +
                timeElapsed3 / 1000000);
    }
}
