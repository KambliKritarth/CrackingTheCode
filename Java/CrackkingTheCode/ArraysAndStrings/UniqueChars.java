import java.util.*;
class UniqueChars{
    public static boolean isUniqueChars(String str){
        int checker = 0;
        for(int i = 0;i<str.length();i++){
            int val = str.charAt(i);
            if((checker&(1<<val))>0){
                return false;
            }  
            checker|=(1<<val);              
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //UniqueChars uc = new UniqueChars();
        String str = sc.nextLine();    
        System.out.println(isUniqueChars(str));;
        sc.close();
    }
}