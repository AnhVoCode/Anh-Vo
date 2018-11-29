public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                answer++;
            }
        }
        //your code here
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        String sub ="bob";
        int i=0;
        while ((i=s.indexOf(sub,i))!=-1){
            i++;
            answer++;
        }
        //your code here
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        s = s.toLowerCase();
        String[]array= new String[s.length()];
        for (int i=0; i<s.length()-1;i++){
            
        }
        //your code here
        return s;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
