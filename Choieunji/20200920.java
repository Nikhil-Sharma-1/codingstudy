import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        answer += n/100 + n%100/10 + n%100%10/1;
        return answer;
    }
}
