class Solution {
    public ListInteger majorityElement(int[] nums) {
        int cand1 = 0; int cand2 = 0;
        int cnt1 = 0; int cnt2 = 0;

        for(int elem nums){
            if(elem == cand1) cnt1++;
            else if(elem == cand2) cnt2++;
            else if(cnt1 == 0){
                cand1 = elem;
                cnt1 = 1;
            }
            else if(cnt2 == 0){
                cand2 = elem;
                cnt2 = 1;
            }
            else{
                cnt1--; cnt2--;
            }
        }

        cnt1 = 0; cnt2 = 0;
        for(int elem nums){
            if(elem == cand1) cnt1++;
            else if(elem == cand2) cnt2++;
        }
        ListInteger res = new ArrayList();
        if(cnt1  nums.length3) res.add(cand1);
        if(cnt2  nums.length3)  res.add(cand2);
        return res;
    }
}