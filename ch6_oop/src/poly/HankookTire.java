package poly;

public class HankookTire extends Tire {

    public HankookTire(int maxRotation, String accumulateRotation) {
        super(maxRotation, accumulateRotation);
    }

    @Override
    public boolean roll() {

        ++accumulateRotation;

        if (accumulateRotation < maxRotation) {
            System.out.println(location + "HankookTire 수명 : " + (maxRotation + accumulateRotation) + "회");
            return true;
        } else {
            System.out.println("**** " + location + "Tire 펑크 ***");
            return false;
        }

    }

}
