package aboutProxy.dynamicProxyDmo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingHandler implements InvocationHandler {
   private Object target;
   public LoggingHandler(Object target) {
       this.target = target;
   }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       System.out.println("[Log]开始调用方法"+method.getName());
       Object result = method.invoke(target, args);
       System.out.println("[Log]方法调用结束"+method.getName());
        return result;
    }
}
