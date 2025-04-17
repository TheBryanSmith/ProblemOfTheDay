public class ToStringArray {
     /*@return a string representation of all values of nums,
        with the values separated by spaces.*/

    public static String arrayToString(int[] input) {

        StringBuilder stringBuilder = new StringBuilder();
        for(int x = 0; x < input.length; x++){
            stringBuilder.append(input[x]);
             stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public static double getAvg(int[] nums) {
        double sum = 0;
        for(int x = 0; x < nums.length; x++){
            sum += nums[x];
    }
        double avg = sum / nums.length;

        return avg;
    }
}

