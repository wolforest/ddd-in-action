package study.daydayup.ddd.demo.business.pay.api.payment.state;

import lombok.Getter;
import study.daydayup.wolf.common.lang.enums.CodeBasedEnum;
import study.daydayup.wolf.framework.layer.domain.Event;

@Getter
public enum PaymentEventEnum implements CodeBasedEnum, Event {
    SUCCEED(120, "CANCELLED"),
    FAIL(110, "FAILURE"),
    CANCEL(100, "SUCCESS"),
    PAY(20, "PENDING"),
    CREATE(10, "PENDING"),
    ;

    private final int code;
    private final String name;

    PaymentEventEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
