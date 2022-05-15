package labor12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDictionary implements IDictionary{

    private HashSet<String> words = new HashSet<>();
    private static HashSetDictionary instance;

    public HashSetDictionary() {
        try(Scanner scanner = new Scanner(new File("dict.txt"))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(String newWord) {
        return words.add(newWord);
    }

    @Override
    public boolean find(String word) {
        return words.contains(word);
    }

    @Override
    public int size() {
        return words.size();
    }

    public static IDictionary newInstance(){
        if (instance == null){
            instance = new HashSetDictionary();
        }
        return instance;
    }
}
