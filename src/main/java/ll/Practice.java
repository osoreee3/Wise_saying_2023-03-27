package ll;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        new SSC().run();
    }
}


class SSC {
    public void run() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrNum = new ArrayList<>();

        while (true) {
            System.out.println("숫자를입력해주세요.");
            int numb = sc.nextInt();

            if (numb < 0) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("음수가 아닙니다.");


            }
            arrNum.add(numb);

        }
        Collections.sort(arrNum);
        System.out.println(arrNum);
        //기본 구현
        String str = arrNum.stream().sorted().map(e -> "" + e).
                collect(Collectors.joining(", "));


    }
}