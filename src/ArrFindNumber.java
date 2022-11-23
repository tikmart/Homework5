public class ArrFindNumber {
    public static void main(String[] args) {
        int [] nums = {152, 11, 19, 120, 121, 136, 45, 52};
        boolean isTrue = false;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 120) {
            isTrue = true;
            index = i;
            break;
        }

        }

        if (isTrue) {
            System.out.println(isTrue);
            System.out.println("The index is: " + index);
        } else System.out.println(isTrue);
    }
}
