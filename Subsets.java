import java.util.*;

class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        dfs(nums,0,new ArrayList<>(),list);
        return list;
    }

    private void dfs(
            int[] nums, 
            int index, 
            List<Integer> path,
            List<List<Integer>> list) {
        list.add(new ArrayList<>(path));
        for(int i=index; i<nums.length; i++) {
            path.add(nums[i]);
            dfs(nums,i+1,path,list);
            path.remove(path.size()-1);
        }
    }
}
