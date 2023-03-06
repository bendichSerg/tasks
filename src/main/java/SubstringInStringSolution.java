public class SubstringInStringSolution {
    static int k = 0;
    public static void main(String[] args) {
        String string = "a bc d sgdghdhcgvftgh9";

        String alphLow = "abcdefghijklmnopqrstuvwxyz";
        String alphHigh = alphLow.toUpperCase();
        String alphLowHigh = alphLow + alphHigh;
        char[] alphLowHighArr = alphLowHigh.toCharArray();
        int M = alphLowHigh.length();

        System.out.println(biggestSubstring(string, alphLowHighArr, M));


    }
    public static boolean inStr (char x, char[] a, int N){
        for (int i = 0; i < N; ++i){
            if (x == a[i])
                return true;
        }
        return false;
    }


    public static String getWord (String string, int N, char[] alphLowHighArr, int M){
        int i = k;
        int j = k;
        while ((k < N) && (!inStr(string.charAt(k), alphLowHighArr, M))){
            k++;
            j++;
            i++;
        }
        while ((j < N) && (inStr(string.charAt(k), alphLowHighArr, M))){
            k++;
            j++;
        }
        return string.substring(i, j);
    }


    public static String biggestSubstring (String string, char[] alphLowHighArr, int M){
        int N = string.length();
        int maxLenWord = 0;
        String tmpSubString = "";
        String maxSubString = "";

        while (k!=N){
            tmpSubString = getWord(string, N, alphLowHighArr, M);
            if (tmpSubString.length() > maxLenWord) {
                maxLenWord = tmpSubString.length();
                maxSubString = tmpSubString;
            }
        }
        return maxSubString;
    }
}
