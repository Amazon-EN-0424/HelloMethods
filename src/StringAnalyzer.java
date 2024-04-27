public class StringAnalyzer {


    public static Integer countSpecificCharactersInAString(String stringToAnalyze,
                                                    Character characterToCount) {
        var transformedString = stringToAnalyze.toCharArray();
        Integer counter = 0;
        for (Character character : transformedString) {
            if (character == characterToCount) {
                counter++;
            }
        }
        return counter;
    }
}
