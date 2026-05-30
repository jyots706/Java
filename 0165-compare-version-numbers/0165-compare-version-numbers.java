class Solution {
    public int compareVersion(String version1, String version2) {
        String arrversion1[]=version1.split("\\.");
        String arrversion2[]=version2.split("\\.");
        // \\. any single character
        // \. for single character

        int n=Math.max(arrversion1.length,arrversion2.length);
        for(int i=0;i<n;i++){
            int n1= i<arrversion1.length ? Integer.parseInt(arrversion1[i]) : 0;
            int n2= i<arrversion2.length ? Integer.parseInt(arrversion2[i]) : 0;

            if(n1<n2) {
                return -1;
            }
            else if(n1 >  n2){
                return 1;
            }
        }
        return 0;

    }
}