package labor12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static labor12_1.DictionaryProvider.createDictionary;

public class DictionaryService {
    private IDictionary dictionary;

    public DictionaryService(DictionaryType type) {
        dictionary = createDictionary(type);
    }

    public boolean findWord(String word){
        return dictionary.find(word);
    }

    public ArrayList<String> findWordsFile(String fileName){
        ArrayList<String> found = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;
                String temp = line.trim();
                if (dictionary.find(temp)){
                    found.add(temp);
                }
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return found;
    }
}
