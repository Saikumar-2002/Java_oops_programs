public class Multipleobj {
    String fname="Kalva";
    String lname="Saikumar";
    int   Age=21;
    String Address="Hyderabad";
    long mobile=9550942269l;
    String Designation="Full stack Developer";
    float height =6.1f;

    public static void main(String[] args){
        Firstoopsprogram obj=new Firstoopsprogram();
        Firstoopsprogram obj2=new Firstoopsprogram();
        Firstoopsprogram obj3=new Firstoopsprogram();
        obj2.height=6.2f;
        obj3.Address="Mumbai";
        System.out.println("Name :"+obj.fname+" "+obj.lname);
        System.out.println("Age :"+obj.Age);

        System.out.println("Address :"+obj3.Address);
        System.out.println("contact Number :"+obj.mobile);
        System.out.println("Designation :"+obj.Designation);
        System.out.println("Height :"+obj2.height);
    }
}
