### 125 ValidPalindrome
解法1：
采用自顶向下解法：将解法分为三部
1. 筛选字母数字的序列
2. 将筛选后的字符串使用StringBuilder 的reverse()反转字符串
3. 比较筛选出的字符串和反转后的字符串

解法2：

本解法使用双指针法比较，首先筛选出字母和数字，然后比较不同

使用到类库的方法有 String的replaceAll(String regex, String replacement)
该方法的参数有正则参数以及替换的目标字符串
Character 提供了字符的字母和数组检测 Character.isLetterOrDigit(c)、 
Character.toLowerCase(c)、Character.toUpperCase(c)
