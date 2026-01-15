package aboutProxy.dynamicProxyDmo;

public class AlipayService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("通过支付宝支付"+amount+"元");
    }
}
