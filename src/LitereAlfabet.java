import java.lang.reflect.Array;
import java.util.Arrays;

public class LitereAlfabet {

    public void Afis() {
        int lungime = 'z' - 'a';
        for (int i = 0; i < lungime; i++) {
            char alfa = (char) ('a' + i);
            System.out.print(alfa);
        }
    }
}
