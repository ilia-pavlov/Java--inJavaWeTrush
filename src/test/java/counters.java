import java.util.List;

public class counters {

    public static int countTeams(List<Integer> skills, int minPlayers, int minLevel, int maxLevel) {
        int[] playersSkils = {4, 8, 5, 6};
        minPlayers = 1;
        minLevel = 7;
        maxLevel = 8;

        int j = 0;
        for (int i = 0; i <= playersSkils.length; i++) {
            for (j = i; j <= playersSkils.length; j++) {

                int minLevelSkill = playersSkils[i];
                int maxLevelSkill = playersSkils[j];
                if (minLevelSkill >= minLevel && maxLevelSkill <= maxLevel) {

                    System.out.println(i + j);
                }
            }
        }
        return j;
    }

}
