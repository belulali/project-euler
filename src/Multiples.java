/**
 * Created by pchavez on 22/04/14.
 */
public class Multiples {

    public boolean multipleOfThreeOrFive(int number) {
        if(number % 3 == 0){
            return true;
        }if(number % 5 == 0){
            return true;
        }else
            return false;
    }
}

