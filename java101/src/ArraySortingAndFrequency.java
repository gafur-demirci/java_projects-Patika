import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingAndFrequency {
    public static void main(String[] args) {

        //Eleman sıralama
        int counter,num;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı bir dizi oluşturmak istiyorsun? : ");
        counter = input.nextInt();
        int[] nums = new int[counter];

        for(int i = 1; i<= counter; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            num = input.nextInt();
            nums[i-1] = num;
        }

        int[] numSorted = Arrays.stream(nums).sorted().toArray();
        for(int i : numSorted){
            System.out.print(i + " ");
        }

        //Frekans Bulma

        int[] freq = new int[nums.length];
        int visited = -1;
        for(int i =0; i< nums.length; i++){
            int count =1;
            for(int j =i+1; j<nums.length; j++){
                if (nums[i] == nums[j]) {
                    count++;
                    freq[j] = visited;
                }

            }
            if (freq[i] != visited){
                freq[i] = count;
            }
        }
        //Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != visited)
                System.out.println("    " + nums[i] + "    |    " + freq[i]);
        }
        System.out.println("----------------------------------------");

    }
}
