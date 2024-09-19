class calCalories {
    public static void main(String[] args) {
        
        int[] calories = {2023, 1002, 3212, 1231, 2312, 2233, 2122}; 
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        int totalCalories = 0;

    
        for (int i = 0; i < calories.length; i++) {
            System.out.println(days[i] + ": " + calories[i] + " calories");
            totalCalories += calories[i]; 
        }

        
        System.out.println("\nTotal calories intake for the week: " + totalCalories);
    }
}