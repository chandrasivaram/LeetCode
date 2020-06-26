class Solution {
public double medianSortedArrays(int[] nums1 , int[] nums2) {
		
		int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        int rLen = nums1Len + nums2Len;
        int[] result = new int[nums1Len + nums2Len];
        
        System.arraycopy(nums1, 0, result, 0, nums1Len);
        System.arraycopy(nums2, 0, result, nums1Len, nums2Len);

        System.out.println(Arrays.toString(result));
        
        Arrays.sort(result);
        
        if(rLen % 2 != 0)
        	 return (double)result[rLen / 2]; 
        	  
            return (double)(result[(rLen - 1) / 2] + result[rLen / 2]) / 2.0; 
        
		
		
		
	}
}