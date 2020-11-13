package ink.songsong.sloution;


public class ValidPalindrome {
    public boolean isPalindrome1(String s) {
        //1.filter non number and char
        //2 reverse the string

        // 解法1 自顶向下
        String filteredS = _filterNonNumberAndChar(s);
        String reversedS = _reverse(filteredS);
        return filteredS.equalsIgnoreCase(reversedS);


        //
    }

    private String _reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private String _filterNonNumberAndChar(String s) {
        return s.replaceAll("[^A-Za-z0-9]","");
    }


    public boolean isPalindrome(String s) {
        /*
        执行耗时:3 ms,击败了93.92% 的Java用户
        内存消耗:38.5 MB,击败了88.64% 的Java用户
        */
        //双指针法
        //左右开始
        int length = s.length();
        int i = 0;
        int j = length-1;

        for (;j > i;) {
            if (!isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (!compare(s.charAt(i),s.charAt(j))) {
                return false;
            }
            i++;
            j--;


        }


        return true;
    }
    private boolean compare(char source,char target) {
        source = Character.toLowerCase(source);
        target = Character.toLowerCase(target);
        return source==target;

    }
    private boolean isLetterOrDigit(char c) {
        return Character.isLetterOrDigit(c);
    }




}
