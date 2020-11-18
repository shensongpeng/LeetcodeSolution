package ink.songsong.sloution;

public class Test {
    public boolean isPalindrome(String s) {
        //
        int i = 0;
        int j = s.length()-1;
        while (i != j) {
            if (!isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (!compare(s.charAt(i++),s.charAt(j--))) {
                return false;
            }
        }
        return true;
    }
    private boolean isLetterOrDigit(char c) {
        return Character.isLetterOrDigit(c);
    }
    private boolean compare(char source,char target) {
        source = Character.toLowerCase(source);
        target = Character.toLowerCase(target);
        return source == target;
    }

    public static void main(String[] args) {
        System.out.println((char)(11+1));
    }
}
