package N103;

import java.util.ArrayList;

public class Exception {
    private int demasiadoAlto;
    public Exception(int demasiadoAlto) {
        try {
            ArrayList<Integer> memes =new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                memes.add(j);
            }
            System.out.println(memes.get(demasiadoAlto));

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            throw new ArrayIndexOutOfBoundsException();
        }
    }

}
