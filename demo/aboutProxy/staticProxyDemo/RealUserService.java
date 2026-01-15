package aboutProxy.staticProxyDemo;

// realSubject
public class RealUserService implements UserService {

    @Override
    public void deleteUser(String userId) {
        System.out.println("正在删除用户："+userId);
    }
}
