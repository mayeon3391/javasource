package api.math;

public class MathEx1 {
    public static void main(String[] args) {

        double val = 90.7418, val2 = 90.58937;

        System.out.println("random() 0~1 : " + Math.random());
        // 올림,버림,반올림
        System.out.println("90.7418(올림)   : " + Math.ceil(val));
        System.out.println("90.7418(버림)   : " + Math.floor(val));
        System.out.println("90.7418(반올림) : " + Math.round(val));

        System.out.println("min(x,y) : " + Math.min(val, val2));
        System.out.println("max(x,y) : " + Math.max(val, val2));
    }
}
