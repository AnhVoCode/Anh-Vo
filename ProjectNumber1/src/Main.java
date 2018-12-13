import java.sql.SQLOutput;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        String vowel="aeiou";
        for (int i=0;i<s.length();i++){
            if (vowel.indexOf(s.substring(i,i+1))!=-1){
                answer++;
            }
        }
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
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s) {
        String result = "";
        String[] array = new String[s.length()];
        int pos=0;
        for (int i=0;i<s.length();i++){
            if (i==s.length()-1){
                if (s.charAt(i-1)<s.charAt(i)){
                    result+=s.charAt(i);
                    array[pos]=result;
                }
                break;
            }
            if (s.charAt(i)<=s.charAt(i+1)){
                result+=s.charAt(i);
            }
            else{
                result+=s.charAt(i);
                array[pos]=result;
                pos++;
                result="";
            }
        }
        int size=0;
        for (int i=0; i<array.length;i++){
            if (array[i]!=null && array[i].length()>size){
                size=array[i].length();
                s=array[i];
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s="tunivklq";
        problemThree(s);
    }

}
