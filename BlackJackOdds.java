/**
 * Created by greezj15 on 10/20/2017.
 */
public class BlackJackOdds
{
    public static double [] odds;

    public static void main (String [] args)
    {
        initializeOdds ();
        simulate (2000);
        print (odds);
    }

    public static int [] buildDeck () // swaps spots
    {
        int [] deck = new int [53];
        for (int i = 1; i < 51; i++)
        {
            deck [i] = i%13;
            if (deck [i] == 11 || deck[i] == 12 || deck [i] == 0)
            {
                deck [i] = 10;
            }
            deck[52] = 0;
        }
        return deck;
    }

    public static void shuffle (int [] deck)
    {
        for (int i = 0; i < 52; i++)
        {
            int temp = deck[i];
            int random = (int) (Math.random () * 52);
            deck [i] = deck [random];
            deck [random] = temp;
        }
    }

    public static int getCard (int [] deck)
    {
        if (deck[52] == 52)
        {
            shuffle(deck);
            deck [52] = 0;
        }

        int card = deck[deck[52]];
        deck[52]++;
        return card;

    }

    public static void initializeOdds ()
    {
        odds = new double [21];
        for (int i = 0; i <21; i++)
        {
            odds [i] = .5;
        }
    }

    public static boolean shouldIHit (int value) //for simulating a real time hand
    {
        double x = Math.random();
        if (odds[value] <= x)
        {
            return false;
        }

        else
        {
            return true;
        }
    }

    public static void simulate (int x)
    {
        int [] deck = buildDeck ();
        for (int i = 0; i <= x; i++)
        {
            playHand (deck);
        }
    }

    public static void playHand (int [] deck)
    {
        int firstCard = getCard (deck);
        int secondCard = getCard (deck);
        int value = firstCard + secondCard;

        while (value < 21)
        {
            int newValue = value + getCard(deck); 
            if (newValue < 21 )
            {
                if (odds [value] <= 1)
                {
                    odds [value] *= 1.01;
                }
            }
            else
            {
                if(odds[value] > .08)
                {
                    odds[value] /= 1.01;
                }
            }
            value = newValue;
        }
        return;
    }

    public static void print (double [] array) //prints odds of victory for each card
    {
        System.out.print ("[");
        for (int i = 1; i < array.length; i++)
        {
            System.out.print(i + ":  " + array[i]+ " ; ");
        }
        System.out.print ("]");
        return
    }
}
