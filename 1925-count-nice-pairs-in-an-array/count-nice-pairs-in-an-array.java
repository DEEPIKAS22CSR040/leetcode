/*class Solution {
    public int countNicePairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int x=rev(nums[i]);
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+rev(nums[j])==nums[j]+x)
                c++;
            }
        }
        return c;
        
    }
    public int rev(int x)
    {
        int r=0,rem=0;
        while(x!=0)
        {
            rem=x%10;
            x=x/10;
            r=(r*10)+rem;
        }
        return r;
    }
}*/
class Solution {
    public int countNicePairs(int[] nums) {
        int res = 0;
        int mod = (int) Math.pow(10, 9) + 7;
        Map<Integer, Integer> count = new HashMap<>();;

        for (int n : nums) {
            int rev = rev(n);
            int cur = count.getOrDefault(n - rev, 0);
            count.put(n - rev, cur + 1);
            res = (res + cur) % mod;
        }

        return res;        
    }

    private int rev(int num) {
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        return reversedNum;
    }    
}