package study.daydayup.ddd.demo.business.pay.api.payment.state;

import study.daydayup.wolf.common.sm.StateGraph;
import study.daydayup.wolf.common.sm.impl.DefaultStateGraph;

public class PaymentStateMachine {
    public static StateGraph<PaymentStateEnum, PaymentEventEnum> create() {
        return new DefaultStateGraph<PaymentStateEnum, PaymentEventEnum>(PaymentStateEnum.WAIT_TO_PAY)
                .addTransition(PaymentStateEnum.WAIT_TO_PAY, PaymentStateEnum.PENDING, PaymentEventEnum.PAY)

                .addTransition(PaymentStateEnum.PENDING, PaymentStateEnum.FAILURE, PaymentEventEnum.FAIL)
                .addTransition(PaymentStateEnum.PENDING, PaymentStateEnum.CANCELLED, PaymentEventEnum.CANCEL)

                .addTransition(PaymentStateEnum.PENDING, PaymentStateEnum.SUCCESS, PaymentEventEnum.SUCCEED);
    }
}
