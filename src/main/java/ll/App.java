package ll;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;

    }

    public void run() {
        int num = 1;

        ArrayList<WiseSaying> sayings = new ArrayList<>();// saying이라는 변수에 WiseSaying이라는 배열?리스트를 넣는다.
        // 전체적으로? 한번 가져오면 되니까 while문 밖에 선언
        System.out.println("==명언앱==");// 명언앱 출력
        int lg = sayings.size();
        while (true) {
            System.out.println("명령");// while 문들어가면 처음출력
            String command = sc.nextLine().trim(); // 줄바꾸면서 공백을 지워준다.


            if (command.equals("종료")) { //커맨드 종료를 입력을 하면 break 멈춘다.
                break;
            } else if (command.equals("등록")) { // 등록을 입력하면
                System.out.print("명언 : ");  // 명언 :이 출력
                String content = sc.nextLine().trim(); //String  문자를 입력하면 줄이바뀌면서
                System.out.print("작가 : ");   // 작가 :출력
                String authorName = sc.nextLine().trim();//String  문자를 입력하면 줄이바뀌면서
                int id = num + 1; //int num에 1을 +
                WiseSaying wiseSaying = new WiseSaying(id, content, authorName); // wiseSaying이라는 변수를 WiseSaying에 선언한다.
                //wisesaying을 쓰면 new WiseSaying이 사용된다.
                sayings.add(wiseSaying); //sayings라는 배열에 wiseSaying을 추가한다.

                System.out.println(num + "번 명언이 등록되었습니다.");
                num++;

            } else if (command.equals("목록")) { // 목록을 입력하면
                System.out.println("번호 / 작가 / 명언"); // 이게 출력
                System.out.println("명언 수" + sayings.size());
                for (int i = 0; i < lg; i++) {
                    System.out.println(sayings.get(i));
                }


            } else if (command.equals("리스트")) { // 리스트를 입력하면


                System.out.println("번호 : "); // 이게출력
                int number = sc.nextInt();
            } // 숫자를 System.in


            }
        }
    }













