package ink.songsong.sloution;

public class Test {
    public static void main(String[] args) {
        char c = 'c';
        char d = '中';
        char e = '1';
        c = Character.toLowerCase(c);
        d = Character.toLowerCase(d);
        e = Character.toLowerCase(e);
        System.out.println(Character.isLetter(d));
        System.out.println(d);
        System.out.println(e);
    }
}
