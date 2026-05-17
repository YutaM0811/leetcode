import java.util.*;

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(
            int[] candidates,
            int remain,                 // 残りの合計
            int start,                  // 次に使っていいindex
            List<Integer> current,      // 今の組み合わせ
            List<List<Integer>> result
            ) {
        // ピッタリtargetに到達
        if(remain==0) {
            result.add(new ArrayList<>(current)); // コピーして保存
            return;
        }
        // targetを超えたら終了
        if(remain<0) return;
        // candidatesをstartから試す
        for(int i=start; i<candidates.length; i++) {
            int num=candidates[i];
            //選ぶ
            current.add(num);
            // 同じ数字を何度でも使えるのでiをそのまま渡す
            backtrack(candidates, remain-num, i, current, result);
            //戻す
            current.remove(current.size()-1);
        }
    }
}
