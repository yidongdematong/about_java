package aboutobjectoriented;

/**
 * 一个类的定义包含一个签名和一个主体。类的签名定义类的名称，可能还会指定其他重要
 * 信息。类的主体是一些放在花括号里的成员。类的成员一般包含字段和方法，也可以包含
 * 构造方法、初始化程序和嵌套类型。
 *
 * 最简单的类定义方式是在关键字 class 后面放上类的名称，然后在花括号中放一些类的成
 * 员。 class 关键字前面可以放修饰符关键字或注解。如果类扩展其他类，类名后面要加上
 * extends 关键字和要扩展的类名。如果类实现一个或多个接口，类名或 extends 子句之后要
 * 加上 implements 关键字和用逗号分隔的接口名。
 *
 * 定义泛型类时还可以指定类型参数和通配符。
 * 类声明可以包含修饰符关键字。除访问控制修饰符（public、 protected 等）之外，还可以
 * 使用：
 * • abstract
 * abstract 修饰的类未完全实现，不能实例化。只要类中有 abstract 修饰的方法，这个
 * 类就必须使用 abstract 声明。抽象类在 3.6 节介绍。
 * • final
 * final 修饰符指明这个类无法被扩展。类不能同时声明为 abstract 和 final。
 * • strictfp
 * 如果类声明为 strictfp，那么其中所有的方法都声明为 strictfp。这个修饰符极少使用。
 *
 *
 * @author ：wangh
 * @date ：Created in 2025/9/3 20:17
 * @description：关于类
 * @modified By：
 * @version: 1.0.0
 */
public class AboutClass {

/*
    类是 Java 程序最基本的元素结构。所有 Java 语句都在类
    中，而且所有方法都在类中实现。
*/


//    类由一些保存值的数据字段和处理这些值的方法组成。类定义一种新的引用类型。

//    对象一般通过实例化类创建，方法是使用 new 关键字并调用构造方法

//    成员可以是静态的，也可以是非静态的。静态成员属于类本身，而非静态成员关联在类的
//            实例上

    private String nonStaticField;
    private static String staticField;

    public String nonStaticPublicField;

/**
 * 常见的成员有四种：类字段、类方法、实例字段和实例方法。 Java 的主要工
 * 作就是与这些成员交互。
 */
private String instanceMethod() {
        return "instance method";
    }

    private static String staticMethod() {
        return "static method";
    }

//    类的签名可能会声明它扩展自其他类。被扩展的类叫作超类，扩展其他类的类叫作子类。
//    子类继承超类的成员，而且可以声明新成员，或者使用新的实现覆盖继承的方法。

    /**
     * 关于构造方法
     * 构造方法是类成员，作用是初始化新建实例中的字段。
     * 构造方法的工作方式是这样的： new 运算符表明我们想创建类的一个新实例。首先，分配
     * 内存存储新建的对象实例；然后，调用构造方法的主体，并传入指定的参数；最后，构造
     * 方法使用这些参数执行初始化新对象所需的一切操作。
     *
     * Java 中的每个类都至少有一个构造方法，其作用是执行初始化新对象所需的操作。
     *
     * 如果没有显式定义构造方法，javac 编译器自动为提供了一个构造方
     * 法（叫作默认构造方法）。这个构造方法没有参数，而且不执行任何特殊的初始化操作。
     *
     * 关于命名、声明和编写构造方法的基本注意事项
     * 构造方法的名称始终和类名一样。
     * 声明构造方法时不指定返回值类型，连 void 都不用。
     * 构造方法的主体初始化对象。可以把主体的作用想象为设定 this 引用的内容。
     * 构造方法不能返回 this 或任何其他值。
     */
    public class AboutConstructor { }
}
