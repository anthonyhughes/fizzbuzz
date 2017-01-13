public class ReplaceMultiplesOfFiveWithBuzz {


    public ReplaceMultiplesOfFiveWithBuzz() {
    }

    public String replace(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
