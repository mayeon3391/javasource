package op;

public class ArthmeticEx3 {
    public static void main(String[] args) {
        // char 형 연산법
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';
        // byte, short, char 연산 수행 시 연산의 결과가 int 형으로 변경됨
        // c3 = c1 + 1; // 1(int)를 char에 넣을 수 없음 
        
        // 해결책 1) int로 변경
        int result = c1 + 1;

        // 해결책 2) 강제로 char 연산
        c3 = (char)(c1 + 1);

        c2++; //c2 = c2+1;
        c2++; //c2 = c2+1;

        System.out.println("c1 = "+c1);
        System.out.println("result = "+result); //98 숫자로 연산됨 (b의 아스키코드)
        System.out.println("c3 = "+c3); // b 문자로 연산됨
        System.out.println("c2 = "+c2); //c2 = 증감 연산자로 계산한 문자

        // 문자도 +, - 가 가능함, 모든 문자는 특정 숫자(아스키코드)로 바뀌기 때문
    }
}
