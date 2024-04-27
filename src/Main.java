public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("The result of exercise one is: " + exerciseOne());

        String[] names = {"Pepe", "Sara", "Maria", "Jannet"};
        String[] names2 = {"Pier", "Luna", "Harry", "Mona"};
        exerciseFour(names);
        exerciseFour(names2);

        System.out.println("=======================");
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {-5, 2, 67, 0, -53};
        int[] test3 = {-5, -2, -67, -0, -53};
        int[] test4 = {1};
        int[] test5 = {4, 5};
        int[] test6 = {};
        int[] test7 = {88, 2000, -76543, 1};

        System.out.println("Data set 1, smallest number: " + findTheSmallestInteger(test1));
        System.out.println("Data set 2, smallest number: " + findTheSmallestInteger(test2));
        System.out.println("Data set 3, smallest number: " + findTheSmallestInteger(test3));
        System.out.println("Data set 4, smallest number: " + findTheSmallestInteger(test4));
        System.out.println("Data set 5, smallest number: " + findTheSmallestInteger(test5));
        System.out.println("Data set 6, smallest number: " + findTheSmallestInteger(test6));
        System.out.println("Data set 7, smallest number: " + findTheSmallestInteger(test7));


//Car.drive()

        var car1= new Car();
        car1.drive();
    }

    public static int exerciseOne(){

        int numberOne = 5;
        int numberTwo = 7;

        return numberTwo - numberOne;
    }



// This exercise is about being able to uppercase a word and return it
    public static String exerciseTwo(){
        String wordToUppercase = "hola";

        return wordToUppercase.toUpperCase();
    }



//    I need to sum two numbers and the divide the result by 3 and return it
    public static double exerciseThree(){
        int x = 5;
        int y = 4;
        int z = 3;
        double result = (double) (x + y) / z;
        return result;
    }


//    To print all names in a String Array
    public static void exerciseFour(String[] names){

        for (String name : names) {
            if (!name.toLowerCase().startsWith("s")){
                System.out.println(name);
            } else {
                System.out.println("We dont print 'S' starting names");
            }

        }

    }


    /**
     * This method will calculate the smallest number in an array of integers
     * @param numbers the array to check
     * @return the smallest number. If the arrays is null or empty, null will be returned
     */
    public static Integer findTheSmallestInteger(int[] numbers){
        
        if(numbers == null || numbers.length == 0){
            return null;
        }
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < smallestNumber){
                smallestNumber = numbers[i];
            }
        }
        return smallestNumber;
    }
}

