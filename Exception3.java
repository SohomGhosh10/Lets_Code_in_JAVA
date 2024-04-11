class IndexOutOfBoundException extends Exception{
    IndexOutOfBoundException(String message){
        super(message);
    }
}

public class Exception3 {
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30 , 40 , 50};
        
    try{
        int value = arr[5];
        System.out.println("Value of index 5" + value);
    }
    catch(Exception e){
        System.out.println("Index out of bound exception caught");
    }
    }
}
