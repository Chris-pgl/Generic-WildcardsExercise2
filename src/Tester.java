public class Tester {
    public static void main(String[] args) {

        GenericsClass<Integer> firstElement = new GenericsClass<>();
        GenericsClass<Integer> secondElement = new GenericsClass<>();

        GenericsClass<String> thirdElement = new GenericsClass<>();
        GenericsClass<String> fourthElement = new GenericsClass<>();


        firstElement.setT(12);
        secondElement.setT(13);

        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");

        boolean areEqual = GenericsClass.isEqual(firstElement,secondElement);
        if(areEqual){
            System.out.println("The first and second elements are equals");
        }else{
            System.out.println("The first and second elements are not equals.");
        }

        boolean areEquals2 = GenericsClass.isEqual(thirdElement, fourthElement);
        if(areEquals2){
            System.out.println("The third and fourth elements are equals");
        }else{
            System.out.println("The third and fourth elements are not equals");
        }
    }
}