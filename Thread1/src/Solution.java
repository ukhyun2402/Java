import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        List<String> a = new ArrayList<>(Arrays.asList(participant));
        for(int i = 0; i < completion.length; i++){
            a.remove(completion[i]);
        }
        return a.get(0);
    }
}