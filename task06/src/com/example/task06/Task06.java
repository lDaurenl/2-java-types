package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum=x+y;
        return(sum == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(sum) + 0.5));
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
