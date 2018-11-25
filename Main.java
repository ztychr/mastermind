// 25/11-2018

public class Main {

    public static void main(String[] args) {

        GameStart start = new GameStart();
        start.GameStart();

        Guess guess = new Guess();
        guess.Guess();

        GameOver end = new GameOver();
        end.GameOver();

    }
}

