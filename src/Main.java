import java.util.*;

public class Main {
    public static int countOccurrence(List<String> words, String target) {
        int count = 0;
        for (String word : words) {
            if (word.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static <T>List<T> toList(T[] array) {
        return Arrays.asList(array);
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        return uniqueNumbers;
    }

    public static void calcOccurrence(List<String> words) {
        List<String> uniqueWords = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        for (String word : words) {
            int index = uniqueWords.indexOf(word);
            if (index != -1) {
                counts.set(index, counts.get(index) + 1);
            } else {
                uniqueWords.add(word);
                counts.add(1);
            }
        }
        System.out.println("4) ");

        for (int i = 0; i < uniqueWords.size(); i++) {
            System.out.println(uniqueWords.get(i) + ": " + counts.get(i));
        }
    }

    public static List<WordOccurrence> findOccurrence(List<String> words) {
        List<WordOccurrence> result = new ArrayList<>();
        for (String word : words) {
            boolean found = false;
            for (WordOccurrence occurrence : result) {
                if (occurrence.name.equals(word)) {
                    occurrence.occurrence++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(new WordOccurrence(word, 1));
            }
        }
        return result;
    }



    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("bird");
        words.add("fox");
        words.add("cat");
        words.add("dog");
        words.add("cat");
        words.add("rabbit");
        words.add("fox");
        words.add("bird");
        words.add("fox");
        words.add("cat");
        System.out.println("1) Occurrences of fox: " + countOccurrence(words, "fox"));

        Integer[] array = {1, 3, 4, 9, 5};
        List<Integer> list = toList(array);
        System.out.println("2) List: " + list);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(8);
        numbers.add(2);
        numbers.add(1);
        numbers.add(6);
        numbers.add(3);
        numbers.add(9);
        List<Integer> uniqueNumbers = findUnique(numbers);
        System.out.println("3) Unique numbers: " + uniqueNumbers);

        calcOccurrence(words);

        List<WordOccurrence> occurrences = findOccurrence(words);
        System.out.println("5) Occurrences: " + occurrences);

    }

}
