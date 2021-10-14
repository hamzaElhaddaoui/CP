package RandomCP;

public class ReturnCoins {

    int nbTwo;
    int nbFive;
    int nbTen;

    @Override
    public String toString() {
        return "Ten : "+nbTen+", five : "+nbFive+", two : "+nbTwo;
    }

    public static void main(String [] args){
        calculateReturn(11);
        calculateReturn(16);
        calculateReturn(7);
        calculateReturn(3);
    }

    public static void calculateReturn(int numberToReturn){
        // get number of tens
        ReturnCoins rc = new ReturnCoins();
        if(numberToReturn%2==0){
            rc.nbTwo = numberToReturn/2;
            if(rc.nbTwo>=5){
                rc.nbTen = rc.nbTwo/5;
                rc.nbTwo = rc.nbTwo%5;
            }
            System.out.println(rc.toString());
        }else{
            if(numberToReturn>=5){
                numberToReturn-=5;
                rc.nbFive = 1;
                rc.nbTwo = numberToReturn/2;
                if(rc.nbTwo>=5){
                    rc.nbTen = rc.nbTwo/5;
                    rc.nbTwo = rc.nbTwo%5;
                }
                System.out.println(rc.toString());
            }else{
                System.out.println("Imposible");
            }
        }

    }
}
