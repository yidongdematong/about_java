package aboutProxy.dynamicProxyDmo;

import java.lang.reflect.Proxy;

public class ClientMain {
    public static void main(String[] args) {
        PaymentService real = new AlipayService();

        PaymentService proxy= (PaymentService) Proxy.newProxyInstance(real.getClass().getClassLoader(), real.getClass().getInterfaces(),new LoggingHandler(real));
        proxy.pay(123);
    }
}
