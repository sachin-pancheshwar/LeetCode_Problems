class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n =  words.size();
        char[] acr = new char[n];
        for(int i =0;i<n;i++){
            acr[i]= words.get(i).charAt(0);
        }
        return new String(acr).equals(s);

    }
}