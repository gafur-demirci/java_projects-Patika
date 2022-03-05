package LambdaExpression;

public class Main {
    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r1 çalıştı.");
            }
        };
        r1.run();
        // lambda ile yazım
        // lambda kullanabilmek için functional interface olmalı
        // functional interface ise bir tane abstract methodu olan interfacelerdir.
        // böyle de yazılabilir.
        //Runnable r2 = () -> {
        // System.out.println("r2");
        // };
        Runnable r2 = () -> System.out.println("r2 çalıştı.");

        r2.run();
        // lambdaszı kullanım
        Mathematics plus = new Mathematics() {
            @Override
            public int transaction(int a, int b) {
                return a+b;
            }
        };

        System.out.println(plus.transaction(10,2));

        Mathematics plusLamda = (a,b) -> a+b;
        Mathematics minusLamda = (a,b) -> a-b;
        Mathematics multipleLambda = (a,b) -> a*b;
        Mathematics divideLambda = (a,b) -> {
            if(b== 0){ b=1; } return a/b;
        };

        System.out.println(plusLamda.transaction(10,2));
        System.out.println(minusLamda.transaction(10,2));
        System.out.println(multipleLambda.transaction(10,2));
        System.out.println(divideLambda.transaction(10,2));


    }
}
