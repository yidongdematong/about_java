package aboutobjectoriented;

/**
 * @author ：wangh
 * @date ：Created in 2025/9/4 23:09
 * @description：关于类层级结构
 * @modified By：
 * @version: 1.0.0
 *
 * 类的超类在 extends 子句中指定：
 *
 * 定义的每个类都有超类。如果没使用 extends 子句指定超类，那么超类是 java.lang.
 * Object。 Object 是特殊的类，原因有如下两个：
 * 它是 Java 中唯一一个没有超类的类；
 * 所有 Java 类都从 Object 类中继承方法。
 *
 * 因为每个类（除了 Object 类）都有超类，所以 Java 中的类组成一个类层次结构。这个体
 * 系可以使用一个根为 Object 类的树状图表示。
 *
 * Object 类没有超类，而且其他每个类都只有一个超类。子类扩展的超类不能
 * 超过一个。
 */
public class AboutClassHierarchicalStructure extends AboutClass{
}
