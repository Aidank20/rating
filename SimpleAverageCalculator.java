public class SimpleAverageCalculator {  
    public static double calculateSimpleAverage (int[] ratings) {  
        int sum = 0;  
        for (int rating : ratings) {  
            sum += rating;  
        }  
        return (double) sum / ratings.length ;  
    }  
// Main method of the program  
    public static void main(String[] args) {  
        int[] ratings = {4, 4, 4, 2, 4};  
        double average = calculateSimpleAverage(ratings);  
        System.out.println("Simple Average: " + average);  
    }  
}  