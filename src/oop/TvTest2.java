package oop;

class Tv2 {
    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

public class TvTest2 {
    public static void main(String[] args) {
        Tv2 t1 = new Tv2();
        Tv2 t2 = new Tv2();
        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경하였습니다.");

        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");

        t2 = t1;

        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");

    }
}
