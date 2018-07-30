# design-patterns
设计模式
# 设计模式

- [<设计模式六大原则>](https://blog.csdn.net/q291611265/article/details/48465113)

- 开闭原则：对扩展开放,对修改关闭，多使用抽象类和接口。
- 里氏替换原则：基类可以被子类替换，使用抽象类继承,不使用具体类继承。
- 依赖倒转原则：要依赖于抽象,不要依赖于具体，针对接口编程,不针对实现编程。
- 接口隔离原则：使用多个隔离的接口,比使用单个接口好，建立最小的接口。
- 迪米特法则：一个软件实体应当尽可能少地与其他实体发生相互作用，通过中间类建立联系。
- 合成复用原则：尽量使用合成/聚合,而不是使用继承。

### 创建型模式
- 工厂模式：将类的实例化操作延迟到子类中完成，即由子类来决定究竟应该实例化（创建）哪一个类

![image](http://www.runoob.com/wp-content/uploads/2014/08/factory_pattern_uml_diagram.jpg)

- 抽象工厂模式(引入了网上图片)：提供了一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类

![image](https://github.com/iluwatar/java-design-patterns/blob/master/abstract-factory/etc/diagram1.png?raw=true)  

- 单例模式：确保在系统中某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例

- 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示

- 原型模式：

### 结构型模式
- 适配器模式: 将一个接口转换成客户希望的另一个接口，适配器模式使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。

- 桥接模式: 将抽象部分与它的实现部分分离，使它们都可以独立地变化。
- 过滤器模式
- 组合模式
- 装饰者模式
- 外观模式
- 享元模式
- 代理模式

### 行为型模式
- 责任链模式
- 命令模式
- 解释器模式
- 迭代器模式
- 中介者模式
- 备忘录模式
- 观察者模式
- 状态模式
- 空对象模式
- 策略模式
- 模板模式
- 访问者模式

### J2EE模式
- MVC模式
- 业务代表模式
- 组合实体模式
- 数据访问对象模式
- 前端控制器模式
- 拦截过滤器模式
- 服务定位器模式
- 传输对象模式
