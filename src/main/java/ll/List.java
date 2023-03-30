package ll;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class List {
    ArrayList<Object> arr = new ArrayList<>();
    ArrayList<Object> arr1 = new ArrayList<>();


    void list() {
        arr.add(1);
        arr.add("작자미상");
        arr.add("현재를 사랑하라");
        System.out.println(arr.get(0) + " / " + arr.get(1) + " / " + arr.get(2));
    }

    void list2() {
        arr1.add(2);
        arr1.add("작자미상");
        arr1.add("과거에 칩착하지 마라");
        System.out.println(arr1.get(0) + " / " + arr1.get(1) + " / " + arr1.get(2));
    }
    void delete(){
        arr.clear();
        System.out.println("1번 목록을 삭제했습니다.");
    }

}

