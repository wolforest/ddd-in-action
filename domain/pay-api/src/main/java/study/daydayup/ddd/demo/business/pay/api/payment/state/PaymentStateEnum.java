package study.daydayup.ddd.demo.business.pay.api.payment.state;

import lombok.Getter;
import study.daydayup.wolf.common.lang.enums.CodeBasedEnum;

@Getter
public enum PaymentStateEnum implements CodeBasedEnum {
    CANCELLED(120, "CANCELLED"),
    FAILURE(110, "FAILURE"),
    SUCCESS(100, "SUCCESS"),

    PENDING(20, "PENDING"),
    WAIT_TO_PAY(10, "WAIT_TO_PAY"),
    ;

    private final int code;
    private final String name;

    PaymentStateEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }


}
