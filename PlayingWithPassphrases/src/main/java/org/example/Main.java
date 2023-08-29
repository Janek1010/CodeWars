package org.example;

/***
 * Everyone knows passphrases. One can choose passphrases from poems, songs, movies names and so on but frequently they can be guessed due to common cultural references.
 * You can get your passphrases stronger by different means. One is the following:
 *
 * choose a text in capital letters including or not digits and non alphabetic characters,
 *
 * shift each letter by a given number but the transformed letter must be a letter (circular shift),
 * replace each digit by its complement to 9,
 * keep such as non alphabetic and non digit characters,
 * downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
 * reverse the whole result.
 * Example:
 * your text: "BORN IN 2015!", shift 1
 *
 * 1 + 2 + 3 -> "CPSO JO 7984!"
 *
 * 4 "CpSo jO 7984!"
 *
 * 5 "!4897 Oj oSpC"
 *
 * With longer passphrases it's better to have a small and easy program. Would you write it?
 *
 * https://en.wikipedia.org/wiki/Passphrase
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(playPass("BORN IN 2015!", 1));
    }
    public static String playPass(String s, int n) {
        char[] chars = s.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c >= 'a' &&  c <= 'z' ){
                c += n;
                if (c > 'z'){
                    c -= 26;
                }
                if (i % 2 == 0){
                    c -= 32;
                }
            }

            else if (c >= '0' && c <= '9'){
                int valueC = Character.valueOf(c);
                // 57 is 9 in ascii, 48 is 0
                int newValue = 57 - valueC + 48;
                c = (char)newValue;
            }
            chars[i] = c;

        }
        StringBuilder str = new StringBuilder(String.valueOf(chars));
        return str.reverse().toString();
    }
}