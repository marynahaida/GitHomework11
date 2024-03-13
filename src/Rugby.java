import java.util.Random;
import java.util.Arrays;

public class Rugby {
    public static void main(String[] args){

        Random random = new Random();

        int[] ageTeamA = new int[25];
        int[] ageTeamB = new int[25];

        double sumAgeTeamA = 0;
        double sumAgeTeamB = 0;

        System.out.print("Age of team A : ");
        for (int i = 0; i < ageTeamA.length; i++) {
            ageTeamA[i] = random.nextInt(22) + 18;
            System.out.print(ageTeamA[i] + ", ");
            sumAgeTeamA += ageTeamA[i];
        }

        System.out.println();

        double avgAgeTeamA = sumAgeTeamA / ageTeamA.length;
        System.out.println("Average age of team A = " + avgAgeTeamA + " years");


        System.out.print("Age of team B : ");
        for (int i = 0; i < ageTeamB.length; i++) {
            ageTeamB[i] = random.nextInt(22) + 18;
            System.out.print(ageTeamB[i] + ", ");
            sumAgeTeamB += ageTeamB[i];
        }

        System.out.println();
        double avgAgeTeamB = sumAgeTeamB / ageTeamB.length;
        System.out.println("Average age of team B = " + avgAgeTeamB + " years");
    }
}
