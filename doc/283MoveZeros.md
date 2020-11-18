# MoveZeros #
> [283. 移动零](https://www.jianshu.com "283. 移动零")  
>
**问题**

>给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 

__示例__

> 
>输入: [0,1,0,3,12]
>
>输出: [1,3,12,0,0] 

__说明__
>
>必须在原数组上操作，不能拷贝额外的数组。 
>尽量减少操作次数。 
>Related Topics 数组 双指针 

思路
1. 边遍历数组边移动非0数字
2. 使用i记录非0数字的个数
3. 在遍历数组过程中遇到非0数就移动到数组索引i的前一个位置同时当前位置置0
4. 快慢指针

```java
public class MoveZeroes {
    /*
    * 双指针法 i记录非0元素个数
    * */
    public void moveZeroes(int[] nums) {

        for (int i=0,j=0;j<nums.length;j++) {
            if (nums[j] != 0) {
                i++;//记录非0元素的个数加1
                if (j == (i-1)) {
                    continue;
                }
                nums[i-1] = nums[j];
                nums[j] = 0;
            }
        }
    }
}
```

