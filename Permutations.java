import java.util.*;

class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rl=new ArrayList<>();
        if(nums.length==0) return rl;
        backtrack(rl, new ArrayList<>(), nums, new boolean[nums.length]);
        return rl;
    }

    private void backtrack(
            List<List<Integer>> rl,
            List<Integer>cl,
            int[] nums,
            boolean b[]
            ) {
        if(cl.size()==nums.length) {
            rl.add(new ArrayList<>(cl));
            return;
        }
        for(int i=0; i<nums.length; i++) {
            if(b[i]) continue;
            cl.add(nums[i]);
            b[i]=true;
            backtrack(rl, cl, nums, b);
            cl.remove(cl.size()-1);
            b[i]=false;
        }
    }
}
