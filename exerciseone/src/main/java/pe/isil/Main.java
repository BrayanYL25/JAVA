package pe.isil;

import java.util.ArrayList;

public class Main {

    public static int getRandom() {
        return (int) (Math.round(Math.random() * 20));
    }

    public static ArrayList<Integer> createRandoms(int quantity) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < quantity; i++) {
            nums.add(getRandom());
        }

        return nums;
    }

    public static int maxFromArray(ArrayList<Integer> arrNum) {
        if (arrNum.size() < 2) {
            return arrNum.get(0);
        }

        int max = arrNum.get(0);
        for (Integer num : arrNum) {
            max = Math.max(max, num);
        }

        return max;
    } 

    public static ArrayList<Integer> sortAsc (ArrayList<Integer> arr) {
        boolean swaped;
        do {
            swaped = false;

            for (int i = 0; i < arr.size() - 1; i++) {
                if(arr.get(i) > arr.get(i + 1)) {
                    int swiched = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, swiched);

                    swaped = true;
                }
            }
        } while (swaped);

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = createRandoms(10);
        
        for (Integer num :nums) {
            System.out.println(num);
        }
        
        ArrayList<Integer> sortedNums = sortAsc(nums); 
        System.out.println("Antes de ordernar");

        for (Integer n : sortedNums) {
            System.out.println(n);
        }
        // int max = maxFromArray(nums);

        // System.out.println("El maximo numero es: " + max);
    }
}