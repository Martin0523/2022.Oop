package labor12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary{

    private ArrayList<String> words = new ArrayList<>();
    private static ArrayListDictionary instance;

    private ArrayListDictionary(){
        try(Scanner scanner = new Scanner(new File("dict.txt"))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;
                words.add(line.trim());
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(String newWord) {
        return words.add(newWord);
    }

    @Override
    public boolean find(String word) {
        for (String w:words){
            if (w.equalsIgnoreCase(word)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return words.size();
    }

    public static IDictionary newInstance(){
        if (instance == null){
            instance = new ArrayListDictionary();
        }
        return instance;
    }
}
