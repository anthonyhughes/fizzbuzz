/**
 * Created by anthonyhughes on 13/01/2017.
 */
public class SequenceFormatter {

    public String format(int... integers) {
        String output = "";
        for (int i = 0; i < integers.length; i++) {
            if (i + 1 == integers.length) {
                output = output.concat(Integer.toString(integers[i]));
            } else {
                output = output.concat(integers[i] + ",");
            }

        }
        return output;
    }

}
