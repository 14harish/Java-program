public class RunTimeException{
    public static void main(String[] args) {
        try{
            int a=10/0;   //Exception occure becaues the 10 cannot divide by 0
        }
        catch(Exception e){
            System.out.println("Arithmetic Exception Ocurred");
            // e.printStackTrace();
        }
        try{
            int arr[]=new int[10];
            System.out.println(arr[20]);  //Exception occure because we have 20 has index but the size is 10
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndex exception ocurred");
            e.printStackTrace(); //this will print what is the Exception
        }

    //Nested try catch which catch Exception is ocuured that will be printed
    try{
        int a=10/0;   //Exception occure becaues the 10 cannot divide by 0
    }catch(ArithmeticException e){
        System.out.println("1Arithmetic Exception Ocurred");
        // e.printStackTrace();
    }catch(ArrayIndexOutOfBoundsException c){
        System.out.println("1ArrayIndex exception ocurred");
        c.printStackTrace(); //this will print what is the Exception
    }catch(Exception a){
        System.out.println("1Another Exception Ocurred");
        // e.printStackTrace();
    }finally{
        System.out.println("will execute everyTime");
    }
}
}