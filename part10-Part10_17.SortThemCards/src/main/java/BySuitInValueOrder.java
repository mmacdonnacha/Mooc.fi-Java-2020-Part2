
import java.util.Comparator;

/**
 *
 * @author micheal
 */
public class BySuitInValueOrder implements Comparator<Card>{

    @Override
    public int compare(Card c1, Card c2) {
        if(c1.getSuit().ordinal() > c2.getSuit().ordinal())
            return 1;
        else if(c1.getSuit().ordinal() < c2.getSuit().ordinal())
            return -1;
        else{
            if(c1.getValue() > c2.getValue())
                return 1;
            else if(c1.getValue() < c2.getValue())
                return -1;
            else
                return 0;
        }
    }   
    
}