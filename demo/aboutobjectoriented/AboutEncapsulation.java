package aboutobjectoriented;

/**
 * @author ：wangh
 * @date ：Created in 2025/9/23 19:27
 * @description：关于封装，把数据隐藏在类中，只允许通过方法访问。这种技术叫封装（encapsulation)。目的，隐藏类的实现细节，只允许访问类定义的接口。
 * 其他次要目的：
 * 如果内部字段和方法在外部可见，会弄乱类的 API。让可见的字段尽量少，可以保持类
 * 的整洁，从而更易于使用和理解。
 * 如果方法对类的使用者可见，就必须为其编写文档。把方法隐藏起来，可以节省时间和
 * 精力。
 *
 *
 * @modified By：
 * @version: 1.0.0
 */
public class AboutEncapsulation {


    /**
     * 访问控制
     * 1. 访问包，不支持包的访问控制。访问控制一般在类和类的成员这些层级完成。
     * 2. 访问类，默认情况下，顶层类在定义它的包中可以访问。不过如果顶层类如果是public，那么它就可以被任何包访问。
     * 3. 访问成员,类的成员在类的主体里始终可以访问。默认情况下，在定义这个类的包中也可以访问成员 。这种默认的访问等级一般叫做包访问。其他三个访问等级是 private、protected 和 public。
     *
     */

    /**
     * 类中的所有字段和方法 在类的主体里始终都可以使用
     * 如果声明类的成员时没使用任何修饰符，那么使用默认的访问规则（有时叫包访问），
     * 包中的所有类都能访问这个成员，但在包外部不能访问。
     */
    Integer packageField;
    /**
     * 可以在能访问这个类的任何地方访问这个成员 。
     */
    public Integer publicField;

    /**
     * 仅在定义这个类内部可以访问这个成员。
     */
    private Integer privateField;

    /**
     * 仅在定义这个类的包及其子类中可以访问这个成员。
     */
    protected Integer protectedField;


    public static void main(String[] args) {


    }

}
