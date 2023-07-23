import java.util.*;
public class Main {

    public static int fdNo(int no){
        if(no>9){
            String strNo = String.valueOf(no);
            int tens = 1;
            int len = 0;
            while(tens<=no){
                tens+=10;
                len+=1;
            }
            int[] digits = new int[len];

            int result=0;
            for(int i=0;i<digits.length;i++){
                result+=Integer.parseInt(String.valueOf(digits[0]));
                System.out.println(result+" "+digits[i]);
            }
            return fdNo(result);
        }else{
            return no;
        }
    }
    public static void main(String[] args) {
        System.out.println(fdNo(28));
    }
}