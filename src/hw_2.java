import java.util.Random;

public class hw_2 {
    public static void main(String[] args){

        int randomAge = generateRandomAge();
        double temperature = -40;
        String result = permission(randomAge, temperature);
        System.out.println(result);
        System.out.println(permission(generateRandomAge(), -50));
        System.out.println(permission(generateRandomAge(), 25));
        System.out.println(permission(generateRandomAge(), -30));
        System.out.println(permission(generateRandomAge(), 10));
        System.out.println(permission(generateRandomAge(), 35));

    }
    public static String permission(int age, double temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100 + 1);
    }
}

