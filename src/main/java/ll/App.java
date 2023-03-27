package ll;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;

    }

    public void run() {
        System.out.println("==명언앱==");
        while (true) {
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                break;
            }
        }

    }

}

