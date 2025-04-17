public class DeletingDupes {
//int[] nums = [1,1,2,3,4,5,5,6];
    // return int[] expected [1,2,3,4,5,6];

    int DuplicateDeleter(int[] nums){
        int uniqueIndex = 1;
      for(int x = 1; x < nums.length; x++){
          if(nums[x] != nums[x-1]){
             nums[uniqueIndex] = nums[x];
             uniqueIndex++;
          }
      }
      return uniqueIndex;
    }
}
