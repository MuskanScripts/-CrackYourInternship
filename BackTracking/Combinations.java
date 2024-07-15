
import java.util.*;
public class Combinations {
    public void combind(int n,int k,List<List<Integer>>ans ,List<Integer> list,int start){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<=n;i++){
            if(list.contains(i)){
                continue;
            }
            list.add(i);
            combind(n,k,ans,list,i+1);
            list.remove(list.size()-1);
        }
    }

    /*In this ques we needed that we have to take an array from 1 to n and make the subsets of size k and all the subsets should be uniquee
     * and [1,2] is same as [2,1] 
     * so if {1,2,3,4} and k =2 
     * then then we have to start a loop from 1 
     * 1 added to list and then List.size()!= k then call the funciton again by 
     * pasing the current list and adding more elements to it [1,2] if List.size() == k then
     *  ans.add(new ArrayList<>(List));
     * 
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        combind(n,k,ans ,new ArrayList<>(),1);
        return ans;
    }
}
