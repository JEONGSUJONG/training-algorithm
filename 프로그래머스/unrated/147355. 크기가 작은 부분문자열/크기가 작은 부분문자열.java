class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pValue = Long.parseLong(p);

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String subString = t.substring(i, i + p.length());
            long subValue = Long.parseLong(subString);
            
            if (subValue <= pValue) {
                answer++;
            }
        }

        return answer;
    }
}
