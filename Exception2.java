class CheckArgumentException extends Exception{
    CheckArgumentException(String message){
        super(message);
    }
}


public class Exception2 {
    public static void main(String[] args){
        int n = args.length;
        int sum = 0;
        System.out.println("Length of argument is: " + n);

        try{
            for(int i = 0; i <= n; i++){
                if(n < 5){
                    throw new CheckArgumentException ("CheckArgumentException occured");
                }else{
                    int num = Integer.parseInt(args[i]);
                    sum += num;
                }
            }
            System.out.println(sum);
        }
        catch(CheckArgumentException e){
            System.out.println(e);
        }
    }
}
