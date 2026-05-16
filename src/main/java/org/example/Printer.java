package org.example;

public class Printer {
    // 영수증 출력
    public void printReceipt(Payment payment) {
        System.out.println(
                "\n============== 영수증 ==============\n" +
                "전체금액 : " + payment.getTotalPrice() + "\n" +
                "할인금액 : " + payment.getDiscountPrice() + "\n" +
                "최종결제금액 : " + payment.getFinalPrice() + "\n" +
                "==================================\n" +
                "거스름돈 : " + payment.getChange() + "\n"
        );
    }

    // 영화 티켓 출력
    public void printTicket(
            String theaterType,
            String movieTitle,
            String date,
            String startTime,
            String endTime,
            int peopleCount,
            RandomSeatGenerator seat,
            int[] seats
    ) {
        int startSeat = seats[0];
        int endSeat = seats[1];

        System.out.println(
                "========================= 영화입장권 ========================\n" +
                "[" + theaterType + "] " + movieTitle + "\n" +
                date + " / " + startTime + "-" + endTime + "\n" +
                seat.getRandomScreen() + "관 " + seat.getRandomRow() + "열 " + startSeat + "~" + endSeat + "번\n" +
                "총인원 " + peopleCount + "명\n" +
                "==========================================================\n" +
                "*티켓 미지참시 교환, 환불 불가\n" +
                "*결제수단 변경 및 교환, 환불은 상영시간 전 구매한 매점에서 가능\n" +
                "*입장지연에 따른 관람 불편 최소화를 위해 영화는 약 10여분 후에 시작됩니다.\n" +
                "==========================================================\n" +
                "\n" +
                "감사합니다. 즐거운 영화관람 되세요! ^_^"
        );
    }

}
