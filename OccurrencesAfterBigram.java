import java.util.*;

class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] a=text.split(" ");
        List<String> list=new ArrayList<>();
        for(int i=0; i<a.length; i++) {
            if(i-2>=0 && Objects.equals(a[i-2],first)) {
                if(i-2>=0 && Objects.equals(a[i-1], second)) {
                    list.add(a[i]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
