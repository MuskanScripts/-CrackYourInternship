// class Solution {
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         Set<List<Integer>> set= new HashSet<>();
//         Arrays.sort(nums);
//         func(set , nums , new LinkedList<>() , 0);
        
//         return new ArrayList<>(set);
//         }
// /* arr[] = {1,2,2};
//  * ds = {1} , {}
//  * ds = {1,2} , {1} , {} , {2}
//  * ds = {1,2,2},{1,2} , {1,2} , {1} , {2} , { }, {2,2},{2};  
//  */
//         public static void func(Set<List<Integer>> set , int[] nums , List<Integer> ds , int index){
//             if(index == nums.length){
//               set.add(new ArrayList<>(ds));
//                 return;
//             }                           
//             ds.add(nums[index]);
//             func(set , nums , ds , index+1);
//             ds.remove(ds.size()-1);
//             func(set , nums , ds , index+1);
//         }  
// }
import java.util.*;
class SubsetsTwo {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
          List<List<Integer>> ans = new ArrayList<>();
          Arrays.sort(nums);
          f(nums, 0, new int[nums.length], 0, ans);
          return ans;
      }
  
      public static void f(int[] nums, int i, int[] path, int size, List<List<Integer>> ans) {
          if (i == nums.length) {
              ArrayList<Integer> cur = new ArrayList<>();
              for (int j = 0; j < size; j++) {
                  cur.add(path[j]);
              }
              ans.add(cur);
          } else {
              
              int j = i + 1;
              while (j < nums.length && nums[i] == nums[j]) {
                  j++;
              }
              
              f(nums, j, path, size, ans);
              
              for (; i < j; i++) {
                  path[size++] = nums[i];
                  f(nums, j, path, size, ans);
              }
          }
      }
  }