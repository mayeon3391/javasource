package Array;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 길이가 10인 int 형 배열 생성

        int[] arr = new int[10]; // int arr[]도 가능

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10 + 10;
        }

        // 배열 요소의 값 확인
        // 1) for 문 사용 : 원하는 형태로 출력 가능
        // 2) 향상된 for 문 : 1) 과 같음
        // 3) Arrays.toString(배열명) : [배열요소 출력] => 확인용

        System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        // index 사용 못함
        int idx = 0; // index가 필요한 경우 직접 넣기
        for (int i : arr) {
            System.out.print(++idx + " : " + i + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + " : " + arr[i] + "\t");
        }

    }
}
