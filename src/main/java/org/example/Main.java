package org.example;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("안녕하세요! 영화 예매를 도와드릴게요.\n");

        // 1. 영화 볼 날짜 입력받기
        System.out.println("영화를 볼 날짜를 입력해주세요. (YYYY.MM.DD)");
        String date = sc.nextLine();

        // 2. 영화 볼 시간 입력받기
        System.out.println("\n영화를 볼 시간을 입력해주세요. (6:00 - 23:29)");
        String startTime = sc.nextLine();

        // 3. 예매할 영화 입력받기
        System.out.println("\n예매할 영화를 선택해주세요.");
        System.out.println(
                "1. 악마는 프라다를 입는다2\n" +
                "2. 살목지\n" +
                "3. 프로젝트 헤일메리\n" +
                "4. 왕과 사는 남자\n" +
                "5. 군체"
        );
        int inputMovieNumber = sc.nextInt();
        Movie movie = new Movie(inputMovieNumber);
        String endTime = movie.getEndTime(startTime);

        // 4. 예매 인원 입력받기
        System.out.println("\n예매할 인원을 입력해주세요.");
        int peopleCount = sc.nextInt();

        // 5. 상영관 유형 입력받기
        System.out.println("\n상영관 유형을 선택해주세요.");
        System.out.println(
                "1. 2D : 14,000\n" +
                "2. IMAX : 18,000\n" +
                "3. 4DX : 18,000\n" +
                "4. SCREENX : 16,000"
        );
        int inputTheaterType = sc.nextInt();
        Reservation reservation = new Reservation(inputTheaterType);
        // 예매 정보 보여주기
        reservation.showReservationInfo(movie.getMovieTitle(), date, startTime, endTime, peopleCount, reservation.getTheaterType());


        System.out.println("\n결제를 진행하겠습니다.");
        // 6. 할인쿠폰 입력받기
        System.out.println("적용할 할인쿠폰을 선택해주세요.");
        System.out.println(
                "1. (정부지원)국민 영화관람 할인권 : -6,000\n" +
                "2. 통신사 할인 : -4,000"
        );
        int inputDiscountCoupon = sc.nextInt();
        Payment payment = new Payment(inputDiscountCoupon);
        int finalPrice = payment.calculateFinalPrice(peopleCount, reservation.getTicketPrice(), inputDiscountCoupon);


        // 결제 검증 로직
        while(true) {
            System.out.println("\n결제하실 금액은 " + finalPrice + "입니다.");
            System.out.print("투입하실 금액을 입력해주세요. : ");
            int inputPrice = sc.nextInt();
            try {
                payment.variatePayment(inputPrice);
                break;
            } catch (RuntimeException e) {
                System.out.println("결제금액이 부족합니다. 다시 결제해주세요.");
            }
        }

        // 영수증 출력
        Printer printer = new Printer();
        printer.printReceipt(payment);

        // 랜덤 좌석 생성
        RandomSeatGenerator seat = new RandomSeatGenerator();
        int[] seats = seat.getRandomSeat(peopleCount);

        // 영화 티켓 출력
        System.out.println("\n티켓을 출력 중입니다..🎟️");
        System.out.println("티켓 발권 완료!⭐️\n");
        printer.printTicket(reservation.getTheaterType(), movie.getMovieTitle(), date, startTime, endTime, peopleCount, seat, seats);

    }
}