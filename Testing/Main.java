package Homework;

public class Main {


    public static void main(String[] args) {
        reverse("abc");
    }
        public static String reverse(String text) {
        char[] chars = text.toCharArray();
        int i=0;
        int j= chars.length-1;
        while (i < j) {
            char t = chars[i];
            chars[i] = chars[j];
            chars[j] = t;
            i++;
            j--;
        }
            System.out.println(chars);
        return String.valueOf(chars);
    }
    }