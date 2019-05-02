/**
 * Created by szeru on 3/3/2019
 */
public class Hopper {


    private static boolean is_hoppable(int[] towers) {
        int max = 0;
        for(int i = 0; i < towers.length; i++){
            if(max >= towers.length){
                return true;
            }
            max = Math.max(towers[i] + i, max);
            if(max <= i){
                return false;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] towers = {4, 2, 0, 0, 2, 0};
        is_hoppable(towers);
    }
}
