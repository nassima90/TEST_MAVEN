package br.com.alexandreesl.handson.rest;

public class Test {
    Test() {
        System.out.println("constructeur");
    }

    static {
        System.out.println("static");
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}
