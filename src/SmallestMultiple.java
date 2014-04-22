/**
 * Created by pchavez on 22/04/14.
 */
public class SmallestMultiple {
    public int get(int number) {
        int i;
        int x = 1;
        boolean isDivisible = false;
        while (!isDivisible) {

            for (i = 1; i <= number; i++) {
                isDivisible = x % i == 0;
                if(!isDivisible){
                    break;
                }
            }
            if (!isDivisible) {
                x++;
            }
        }
        return x;
    }
}
