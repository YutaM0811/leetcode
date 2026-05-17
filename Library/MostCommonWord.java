import java.util.*;

class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bS=new HashSet<>();
        for(int i=0; i<banned.length; i++) {
            bS.add(banned[i]);
        }
        paragraph=paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String[] a=paragraph.split("\\s+");
        Map<String, Integer> map=new HashMap<>();
        for(int i=0; i<a.length; i++) {
            String s=a[i];
            if(s.length()==0) continue;
            if(bS.contains(s)) continue;
            Integer cnt=map.get(s);
            if(cnt==null) map.put(s,1);
            else map.put(s,cnt+1);
        }
        String r="";
        int max=0;
        Iterator<Map.Entry<String, Integer>> it=map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, Integer> e=it.next();
            if(e.getValue()>max) {
                max=e.getValue();
                r=e.getKey();
            }
        }
        return r;
    }
}
