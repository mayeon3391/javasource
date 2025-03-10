package poly;

public class KumhoTire extends Tire {

    public KumhoTire(int maxRotation, String accumulateRotation) {
        super(maxRotation, accumulateRotation);
    }

    @Override
    public boolean roll() {

        ++accumulateRotation;

        if (accumulateRotation < maxRotation) {
            System.out.println(location + "KumhoTire 수명 : " + (maxRotation + accumulateRotation) + "회");
            return true;
        } else {
            System.out.println("**** " + location + "KumhoTire 펑크 ***");
            return false;
        }

    }

}
