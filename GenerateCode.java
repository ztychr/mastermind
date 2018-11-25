import java.util.Random;

public class GenerateCode {

    public String[] SecretCode = new String[4];

    public GenerateCode() {

        String[] AvailableColors = new String[6];

        AvailableColors[0] = "b";
        AvailableColors[1] = "g";
        AvailableColors[2] = "o";
        AvailableColors[3] = "p";
        AvailableColors[4] = "r";
        AvailableColors[5] = "y";

        for (int i = 0; i < 4; i++) {

            int ran = new Random().nextInt(AvailableColors.length);
            String random = (AvailableColors[ran]);

            SecretCode[i] = random;
        }
    }
}
