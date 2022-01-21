public class RecursionPractice {
    
    public static void main(String[] args){

        System.out.println("Count 7's: " + count7(1871773));
        System.out.println("Count 7's: " + count7(7871277));
        System.out.println("Count 7's: " + count7(1801123));

        System.out.println("Remove Spaces: [" + removeSpaces("zz abc x y z") + "]");
        System.out.println("Remove Spaces: [" + removeSpaces("zz abc x yz") + "]");
        System.out.println("Remove Spaces: [" + removeSpaces(" zz  abc x y z") + "]");

        System.out.println("Palindrome: " + palindromeI("kayak"));
        System.out.println("Palindrome: " + palindromeI("noon"));
        System.out.println("Palindrome: " + palindromeI("nsookn"));
        System.out.println("Palindrome: " + palindromeI("neon"));

        
        System.out.println("Palindrome: " + palindromeR("kayak"));
        System.out.println("Palindrome: " + palindromeR("noon"));
        System.out.println("Palindrome: " + palindromeR("nsookn"));
        System.out.println("Palindrome: " + palindromeR("neon"));
        
        
    }

    public static int count7(int n){

        if(n == 0)
            return 0;

        if(n % 10 == 7)
            return 1 + count7(n/10);

        else
            return count7(n/10);

    }

    public static String removeSpaces(String s){

        if(s.length() == 1){
            if(s.charAt(0) == ' ')
                return "";
            else
                return s;
        }

        if(s.charAt(0) == ' '){
            return removeSpaces(s.substring(1, s.length()));
        }
        else{
            return s.charAt(0) + removeSpaces(s.substring(1, s.length()));
        }

    }

    public static boolean palindromeI(String s){

        boolean pal = true;

        for(int i = 0,j = s.length() -1 ; i < j && pal; i++,j--){
            if(s.charAt(i) != s.charAt(j))
                pal = false;
        }
        return pal;

    }
    
    public static boolean palindromeR(String s){

        if(s.length() == 1)
            return true;
        if(s.length() == 2 && s.charAt(0) == s.charAt(1))
            return true;

        if(s.charAt(0) == s.charAt(s.length() -1)){
            return palindromeR(s.substring(1, s.length() - 1));
        }
        else{
            return false;
        }
    }
    

}
