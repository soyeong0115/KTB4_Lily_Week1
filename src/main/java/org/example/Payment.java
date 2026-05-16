package org.example;

public class Payment {
    int totalPrice;
    int discountCoupon;
    int discountPrice;
    int finalPrice;
    int change;

    // 생성자 사용
    public Payment(int inputDiscountCoupon) {
        setDiscountCoupon(inputDiscountCoupon);
    }

    public void setDiscountCoupon(int inputDiscountCoupon) {
        switch (inputDiscountCoupon) {
            case 1:
                discountCoupon = 6000;
                break;
            case 2:
                discountCoupon = 4000;
                break;
        }
    }

    // 최종 결제 금액 계산
    public int calculateFinalPrice(int peopleCount, int ticketPrice, int inputDiscountCoupon) {
        setDiscountCoupon(inputDiscountCoupon);
        totalPrice = peopleCount * ticketPrice;
        discountPrice = peopleCount * discountCoupon;
        finalPrice = totalPrice - discountPrice;
        return finalPrice;
    }

    // 투입금액 = 결제금액 검증
    public void variatePayment(int inputPrice) {
        if (inputPrice > finalPrice) {
            change = inputPrice - finalPrice;
            System.out.println("결제가 완료되었습니다! 거스름돈은 " + change + "원 입니다.");
        } else if (inputPrice == finalPrice) {
            System.out.println("결제가 완료되었습니다!");
        } else
            throw new RuntimeException();
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public int getChange() {
        return change;
    }

    public int getFinalPrice() {
        return finalPrice;
    }
}
