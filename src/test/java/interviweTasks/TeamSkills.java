package interviweTasks;

import java.util.List;

class TeamSkills {
    public static void main(String[] args) {
        int[] playersSkils = {4, 8, 5, 6};
        int minPlayers = 1;
        int minLevel = 7;
        int maxLevel = 8;


        for (int i = 0; i <= playersSkils.length; i++) {
            for (int j = 0; j <= playersSkils.length; j++) {

                int minLevelSkill = playersSkils[i];
                int maxLevelSkill = playersSkils[j];
                if (minLevelSkill >= minLevel && maxLevelSkill >= maxLevel) {
                   System.out.println(i + j);

                }
            }
        }
    }
}