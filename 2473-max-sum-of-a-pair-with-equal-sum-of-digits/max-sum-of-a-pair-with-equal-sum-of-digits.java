/*class Solution {
    public int maximumSum(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length;i++)
        {
            int x=sum(nums[i]);
            for(int j=i+1;j<nums.length;j++)
            {
                int y=sum(nums[j]);
                if(x==y)
                max=Math.max(max,nums[i]+nums[j]);
            }
        } 
        return max;       
    }
    int sum(int x)
    {
        if(x==0)
        return 0;
        else
        return x%10+sum(x/10);
    }
}*/
class Solution {
    public int maximumSum(int[] arr) {
        HashMap<Integer, Integer> map =  new HashMap<>();
		int max = -1;
		
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			int n = arr[i];
			while(n > 0)
			{
				sum += n % 10;
				n /= 10;
			}
			if(map.get(sum) == null)
			{
				map.put(sum, arr[i]);
			}
			else if(map.get(sum) < arr[i])
			{	
				max = Math.max(arr[i] + map.get(sum), max);
				map.put(sum, arr[i]);
			}
			else
			{
				max = Math.max(arr[i] + map.get(sum), max);
			}
		}
        return max;
    }
}