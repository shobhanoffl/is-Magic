import java.util.*;
public class Main {

    public static int fdNo(int no){
        if(no>9){
            String strNo = String.valueOf(no);
            int len = strNo.length();
            int[] array = new int[len];
            for(int i=len-1; i>=0; i--){
                array[i]=no%10;
                no/=10;
            }
            int result=0;
            for(int i=0;i<len;i++){
                result+=array[i];
            }
            return fdNo(result);
        }else{
            return no;
        }
    }
    public static void main(String[] args) {
        System.out.println(fdNo(55));
    }
}