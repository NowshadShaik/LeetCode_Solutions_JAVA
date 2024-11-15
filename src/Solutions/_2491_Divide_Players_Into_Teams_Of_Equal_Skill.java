package Solutions;

import java.util.Arrays;

public class _2491_Divide_Players_Into_Teams_Of_Equal_Skill {

    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int sum = 0;
        for(int i=0;i<skill.length;i++) sum+=skill[i];
        int req = (sum/(skill.length/2));
        long res = 0;

        int p1=0,p2=skill.length-1;
        while(p1<p2) {
            if((skill[p1] + skill[p2]) == req) {
                res+=skill[p1++] * skill[p2--];
            } else {
                return -1;
            }
        }

        return res;
    }
}
