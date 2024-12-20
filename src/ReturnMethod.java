class ReturnMethod {

    public int numbers(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        ReturnMethod m=new ReturnMethod();
        System.out.println(m.numbers(23,45))  ;
        System.out.println("Return type calling in main method");
    }
}