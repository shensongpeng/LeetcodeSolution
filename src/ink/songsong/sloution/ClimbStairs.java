package ink.songsong.sloution;/*
 *
 * @ClassName ClimbStairs
 * @Author shensongpeng
 * @Date 2020/11/18 :18:34
 * @Version 1.0
 * */
//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
// 注意：给定 n 是一个正整数。
//
// 示例 1：
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶
//
// 示例 2：
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
//
// Related Topics 动态规划
// 👍 1341 👎 0


public class ClimbStairs {
    //    public int climbStairs(int n) {
//
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//        if (n == 2) return 2;
//        int[] table = new int[n+1];
//        table[1] = 1;
//        table[2] = 2;
//        for (int i = 3;i < n+1;i++) {
//            table[i] =table[i-1]+table[i-2];
//        }
//        return table[n];
//    }

    public int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int cur = 2;
        int pre = 1;
        int temp = 0;
        for (int i=3;i <= n;i++) {
            temp = cur;
            cur = cur + pre;
            pre =temp;
        }
        return cur;

    }
}
