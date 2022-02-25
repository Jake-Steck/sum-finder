class Main {
    public static void main(String[] args) {
        // Creating Random Sum between 2 & 12 inclusive
        int min = 2;
        int max = 12;
        double sum = Math.random() * (max - min) + 1;
        int real_sum = (int)sum;
        System.out.println("SUM:" + real_sum);
        
        // Creating min and max for the die
        int die_max = 6;
        int die_min = 1;
        double num1 = Math.random() * (die_max - die_min) + 1;
        double num2 = Math.random() * (die_max - die_min) + 1;
        
        // Converting die to whole integers
        int real1 = (int)num1;
        int real2 = (int)num2;



        // Loop that keeps looping through the die until the sum is reached
        while (real1 + real2 != real_sum) {
            num1 = Math.random() * (die_max - die_min) + 1;
            num2 = Math.random() * (die_max - die_min) + 1;
            real1 = (int)num1;
            real2 = (int)num2;
            int fake_sum = real1 + real2;
            System.out.println(real1 + "+" + real2 + "=" + fake_sum);


        }
    }
}
