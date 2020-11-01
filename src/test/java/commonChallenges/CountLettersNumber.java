package commonChallenges;//How would you count the number of letters 'l' ?

public class CountLettersNumber {
    public static void main(String[] args){
        String input = "hello world";
        int result = 0;

        for(char eachChar : input.toCharArray()){
            if(eachChar== 'l') result++;
        }
        System.out.println(result);
    }
}
