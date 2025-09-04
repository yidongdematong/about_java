package aboutobjectoriented;

/**
 * @author ：wangh
 * @date ：Created in 2025/9/3 21:08
 * @description：关于extends
 * @modified By：
 * @version: 1.0.0
 * 通过定义子类或扩展超类向类中添加功能的能力，是面向对象编程范式的核心。
 * 通过extends关键字，子类继承超类的属性和方法。
 * 这个关键字告诉 Java， AboutExtendsClass 类扩
 * 展 AboutClass 类（或者说是 AboutClass 类的子类），这意味着 AboutExtendsClass 类会继承 AboutClass 类的
 * 字段和方法。
 *
 * 子类的另一个特性是，每个 AboutExtendsClass 对象都是完全合法的 AboutClass 对象。如果 创建一个AboutExtendsClass的实例 ，那么可以把这个引用赋值给 AboutClass 类型的变量，
 */
public class AboutExtendsClass extends AboutClass{

   public static void main(String[] args) {


       AboutExtendsClass a = new AboutExtendsClass();
       AboutClass b = new AboutClass();
       AboutClass c = new AboutExtendsClass();
       /**
       这种转换完全合 法
        */
       System.out.println(a instanceof AboutExtendsClass);
       System.out.println(a instanceof AboutClass);
       System.out.println(b instanceof AboutExtendsClass);
       System.out.println(b instanceof AboutClass);
       System.out.println(c instanceof AboutExtendsClass);
       System.out.println(c instanceof AboutClass);

       System.out.println(a.nonStaticPublicField);

   }
}
