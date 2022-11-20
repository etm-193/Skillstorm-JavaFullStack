package maxTwoDArray;

public class MaxValue {
    
    
    public static void main(String[] args) {
        
        int[][] numbers = {
                {12, 10, 34, 20},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {40, 25,  }
        };
        
        int[][] numbers2 = {
                {12, 10, 4, 20},
                {1, 10},
                {40, 5,  0}
        };
        
        System.out.println(findMax(numbers));
        System.out.println(findMin(numbers2));
        
    }

    public static int findMax(int[][] numbers) {
        
        int maxValue = numbers[0][0];
        for (int a = 0; a < numbers.length; a++)
            for (int b = 0; b < numbers[a].length; b++) {
                if (numbers[a][b] > maxValue) {
                    maxValue = numbers[a][b];
                }
            }
        
        return maxValue;
        
    }
    
    public static int findMin(int[][] numbers) {
        
        int minValue = numbers[0][0];
        for (int a  = 0; a < numbers.length; a++)
            for (int b = 0; b < numbers[a].length; b++)
                if (numbers[a][b] < minValue) {
                    minValue = numbers[a][b];
                } 
        return minValue;
    }
    
}
