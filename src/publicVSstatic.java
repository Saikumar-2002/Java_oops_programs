public class publicVSstatic {
    public void method1(){
        System.out.println("This is public method");
    }
    static void method2(){
        System.out.println("This is static method");
    }

    public static void main(String[] args) {
       method2();
        publicVSstatic obj=new publicVSstatic();
        obj.method1();
    }
}
