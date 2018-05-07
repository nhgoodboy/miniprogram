package others;

/**
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/17 16:28
 **/
public enum TestEnum {
    A(1, 2),
    B(3, 4),
    C(5, 6);

    private int a;
    private int b;

    TestEnum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
