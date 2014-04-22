/**
 * Created by pchavez on 22/04/14.
 */
public class SmallestMultiple {
    public int get(int number) {
        int i;
        for(i = 1; i <= number; i++){
            if(i % number == 0){
                System.out.println(i);
            }
            break;
        }
        return i;
    }
}
