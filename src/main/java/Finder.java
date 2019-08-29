
public class Finder {
    public static void main(String [] args){
        JUnitTest test = new JUnitTest();

        test.test_invalidArrays();
        test.test_validArrays();
    }
        public static Integer sumArrayOfIntegers(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    public static Integer findMax(int[] intArray){
        if (intArray == null || intArray.length == 0){
            return null;
        }

        int currentMax = intArray[0];
        for (int i= 0; i < intArray.length; i++){
           if(currentMax < intArray[i]){
               currentMax = intArray[i];
           }
        }

        return currentMax;
    };

    public static Integer findMin(int[] intArray){
        if (intArray == null || intArray.length == 0){
            return null;
        }

        int currentMin = intArray[0];
        for (int i= 0; i < intArray.length; i++){
            if(currentMin > intArray[i]){
                currentMin = intArray[i];
            }
        }

      return currentMin;
    };
}
