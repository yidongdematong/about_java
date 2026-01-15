package aboutProxy.staticProxyDemo;

// proxy
public class UserServiceProxy implements UserService {
    private UserService realService;
    public  UserServiceProxy(UserService realService) {
        this.realService = realService;
    }

    @Override
    public void deleteUser(String userId) {
//        权限检查
        if(!"admin".equals(userId)){
            System.out.println("权限不足，无法删除用户");
            return;
        }
        //调用真实对象
        realService.deleteUser(userId);

    }
}
