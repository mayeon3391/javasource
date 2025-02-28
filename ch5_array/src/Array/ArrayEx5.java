package Array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // char 값 5 개 abcde

        // 타입 배열명 ={};
        char[] chArr = { 'a', 'b', 'c', 'd', 'e' }; // 배열 선언, 생성

        // 배열 길이
        System.out.println("길이 : " + chArr.length);

        // 배열 요소
        System.out.println(chArr);
        System.out.println(Arrays.toString(chArr)); // [a, b, c, d, e]

        // 배열 요소 변경
        chArr[2] = 'f';
        System.out.println(Arrays.toString(chArr));

        // doule 배열 선언, 생성
        double[] arm = { 90.5, 40.4, 20.82, 60.3, 30.5 };
        System.out.println(arm); // [D@1be6f5c3
        // Arrays.toString() : 배열명이 가리키는 곳의 실제 값을 출력
        System.out.println(Arrays.toString(arm));
    }
}
