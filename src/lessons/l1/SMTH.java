package lessons.l1;

import java.util.Arrays;

public class SMTH {
    public static void main(String[] args) {
        String[] words = {"sun", "today", "yesterday", "I", "he"};

        String shortest = findShortestWord(words);
        if (shortest != null) {
            System.out.println("The shortest word is " + shortest);
        } else {
            System.out.println("Couldn't find the shortest word in nothing");
        }

        System.out.println(makeText(words));

        System.out.println(Arrays.toString(toUpperCase(words)));

    }

    static String findShortestWord(String[] words) {
        if (words.length == 0) {
            return null;
        }

        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return shortest;
    }

    static String makeText(String[] words) {
        String result = "";
        String separator = "";
        for (String word : words) {
            result += separator + word;
            separator = " ";
        }
        return result;

    }

    static String[] toUpperCase(String[] words) {
        String[] array = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            array[i] =words[i].toUpperCase();
        }
        return array;
    }

}
