import java.util.Comparator;

/**
 * Created by szeru on 3/13/2019
 */
public class Misc {


    static int activityNotifications(int[] expenditure, int d) {

        int notices = 0;
        for(int j=0; j < expenditure.length; j++){
            int sum = 0;
            int median = 0;

            while(j + d < expenditure.length){
                for(int i = j; i < d + j; i++){
                    sum += expenditure[i];
                }
                if(d % 2 == 0){
                    median = (d - j)/2 ;
                }else{
                    median = (d - j)/2 - 1;
                }

                if(expenditure[d] > (2 * median)){
                    notices++;
                }

            }

        }

        return notices;
    }


    public static void main(String[] args) {
        int[] input = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        activityNotifications(input, 5);

    }
}
