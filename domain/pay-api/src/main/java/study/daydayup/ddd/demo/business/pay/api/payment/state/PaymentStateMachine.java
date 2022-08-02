package study.daydayup.ddd.demo.business.pay.api.payment.state;

import study.daydayup.wolf.common.sm.StateGraph;
import study.daydayup.wolf.common.sm.impl.DefaultStateGraph;

public class PaymentStateMachine {
    public static StateGraph<PaymentStateEnum, PaymentEventEnum> create() {
        return new DefaultStateGraph<PaymentStateEnum, PaymentEventEnum>(PaymentStateEnum.WAIT_TO_PAY)
                .bind(PaymentStateEnum.WAIT_TO_PAY, PaymentStateEnum.PENDING, PaymentEventEnum.PAY)

                .bind(PaymentStateEnum.PENDING, PaymentStateEnum.FAILURE, PaymentEventEnum.FAIL)
                .bind(PaymentStateEnum.PENDING, PaymentStateEnum.CANCELLED, PaymentEventEnum.CANCEL)

                .bind(PaymentStateEnum.PENDING, PaymentStateEnum.SUCCESS, PaymentEventEnum.SUCCEED);
    }
}
