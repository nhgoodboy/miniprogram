package others;

public class Test {

    private String name;

    private static Test t1 = new Test();
    private static Test t2 = new Test();

    {
        System.out.println("构造块");
    }

    static{
        System.out.println("静态快");
    }

    public static void main(String[] args) {

        Test t3 = new Test();

//        String a = "asd";
//        String z = new String("sss");
//        String x = new String("sss");
//
//        String b = "a" + "sd";
//        String c = "a";
//        String d = "sd";
//        String e = c + d;
//        System.out.println(x == z);
//        System.out.println(-8 >>> 1);

//        for (int i = 0; i < 100; i++) {
//            system.out.println(i);
//        }
//
//        for (int i = 200; i > 0; i--) {
//            System.out.println(i);
//        }
    }

    public String method1(String name) {
        this.name = name;
        if (name != null) {

        }
        return name;
    }
}
