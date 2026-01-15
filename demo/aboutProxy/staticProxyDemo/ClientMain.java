package aboutProxy.staticProxyDemo;

//client
public class ClientMain {
    public static void main(String[] args) {
        UserService realService = new RealUserService();
        UserService proxyUserService= new UserServiceProxy(realService);

        proxyUserService.deleteUser("use123");//权限不足
        proxyUserService.deleteUser("admin");//成功删除
    }
}
