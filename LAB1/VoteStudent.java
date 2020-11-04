import java.util.*;
public class VoteStudent {
    public static void main(String[] args) {
        Random rand = new Random();
        int score = 10;
        String []name = {"mike","game","Nut","wow","noddi"};
        int []vote = new int[5];
        for(int i = 0;i < vote.length;i++){
            int voteNum = rand.nextInt(score - 1) + 1;
            vote[i] = voteNum;
            //score -= voteNum;
        }
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(vote));
    }
}
