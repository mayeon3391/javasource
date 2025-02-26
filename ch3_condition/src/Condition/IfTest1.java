package Condition;


// 특정 조건을 만족하면 문장 실행
// if(조건문){}
// true나 false 결과값을 가지는 것을 조건문이라고 한다

// 특정 조건을 만족하면 구문1 실행, 만족하지 않을 때는 구문2 실행
// if(조건문){구문1}else{구문2}



public class IfTest1 {
    public static void main(String[] args) {
        int x = 0;

        if(x == 0){
            System.out.println("x==0");
            // 결과값이 true여서 실행
        }

        if(x != 0){
            System.out.println("x!=0");
            // 결과값이 false여서 실행하지 않음
        }

        if(!(x == 0)){
            System.out.println("!(x == 0)");
            // 결과값이 true였지만 반대로가 false
        }

        if(!(x != 0)){
            System.out.println("!(x != 0)");
            // 결과값이 false였지만 반대로가 true
        }
    }
}
