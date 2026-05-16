package org.example;
import java.util.Random;

public class RandomSeatGenerator {
    Random rd = new Random();

    // 랜덤 관 생성 (1~8중 1개)
    public int getRandomScreen() {
        int screen = rd.nextInt(8) + 1;
        return screen;
    }

    // 열 생성 (A~K중 1개)
    public char getRandomRow() {
        int randomRow = (rd.nextInt(11) + 65);
        char row = (char)randomRow;
        return row;
    }

    // 좌석 번호 생성 (1~21중 peopleCount개, 연속된 값으로)
    public int[] getRandomSeat(int peopleCount) {
        int startSeat;
        int endSeat;

        do {
            startSeat = rd.nextInt(21) + 1;
            endSeat = startSeat + peopleCount - 1;
        } while (endSeat > 21);

        int[] seat = {startSeat, endSeat};
        return seat;
    }
}
