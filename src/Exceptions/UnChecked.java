package Exceptions;

public class UnChecked {
/*
  Unchecked exception - is not checked by the compiler but you optionally can manage it explicitly
  Unchecked exception - represent unexpected error conditions and signify an abnormal state of your program,
  due to invalid input, bugs or runtime restrictions (eg memory);
  the compiler won't force the programmer to handle these, ie you only have to care for them if you know of their occurrence
 */
    public static void main(String args[]) {

        // bad
        int num1=10;
        int num2=0;
        /*Since I'm dividing an integer with 0
         * it should throw ArithmeticException
         */
        int res=num1/num2;
        System.out.println(res);


        // good
        try{
            int arr[] ={1,2,3,4,5};
            System.out.println(arr[7]);
        } // There should be a exception message to user so that user would be able to correct the issue.
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The specified index does not exist " +
                    "in array. Please correct the error.");
        }


    }

}
