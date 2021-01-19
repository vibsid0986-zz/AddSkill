class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        int val=-1;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int num=map.get(nums[i]);
                map.put(nums[i],num+1);
                if(num+1>count){
                    count=num+1;
                    val=nums[i];
                }
            }else{
                map.put(nums[i],1);
                if(count<1){
                    count=1;
                    val=nums[i];
                }
            }
        }
        return val;
    }
}
