public class Test1 {
	
    interface FuncInter1 {
        int operation(int a, int b);
    }
 
    // sayMessage() is implemented using lambda expressions
    // above
    interface FuncInter2 {
        void sayMessage(String message);
    }
 
    // Performs FuncInter1's operation on 'a' and 'b'
    private int operate(int a, int b, FuncInter1 fobj)
    {
        return fobj.operation(a, b);
    }
 
    public static void main(String args[])
    {
        FuncInter1 add = (int x, int y) -> x + y;
 
        FuncInter1 multiply = (int x, int y) -> x * y;
 
        Test1 tobj = new Test1();
 
        // Add two numbers using lambda expression
        System.out.println("Addition is "
                           + tobj.operate(9, 7, add));
 
        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is "
                           + tobj.operate(9, 7, multiply));
 
        // lambda expression for single parameter
        // This expression implements 'FuncInter2' interface
        FuncInter2 fobj = message
            -> System.out.println("Hello " + message);
        fobj.sayMessage("Bihar");
    }
}