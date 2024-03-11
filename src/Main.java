public class Main {
    public static void main(String[] args) {

        LitereAlfabet a = new LitereAlfabet();
        a.Afis();
        String litere = "abcdefghijklmnopqrstuvwxyz";
        String[] sir = new String[30];
        int l = litere.length(), start = 0, k = 0;
        for (int i = 0; i < l; i++) {
            if (isVowel(litere.charAt(i))) {
                start = i;
                i++;
                while(i < l && !isVowel(litere.charAt(i))) i++;
                sir[k++] = litere.substring(start, i);
                i--;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(sir[i]);
        }
    }
    public static boolean isVowel(char in){
        char up_in = Character.toUpperCase(in);
        if(up_in=='A' || up_in == 'E' || up_in == 'I' || up_in == 'O' || up_in == 'U') return true;
        return false;}

}
