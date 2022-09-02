package _29_exception_Handling.Abstract;

public class AttempSample {

    public static void main(String[] args) {

        AttempFileReader fileReader = new AttempFileReader();

        try {
            fileReader.read("test.txt");
        } catch (AttemptException e) {
            e.printStackTrace();
        }

    }


}
