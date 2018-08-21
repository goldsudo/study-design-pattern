# 设计模式相关的学习代码

### 目前已完成

#### 单例模式的6种实现方式
(1). 懒汉式<br>
(2). 线程安全的懒汉式<br>
(3). 线程安全的饿汉式<br>
(4). doubleCheck/双重检测式<br>
(5). holder/内部静态类式<br>
(6). 枚举式（最优方式）<br>

#### 工厂模式
(1). 简单工厂模式——以一个四则运算的简单工厂实现为例<br>
(2). 静态工厂方法——以“女娲造人”为例<br>
(3). 抽象工厂——以不同的厨房提供不同品种的食物与餐具为例<br>

#### 适配器模式、代理模式、装饰器模式
(1). 适配器模式——将英国3头充电器通过适配器转换为国产2头充电器进行充电<br>
(2). 代理模式——创建一个代理类型实现原类型的接口，代理类型自身持有一个原类型的对象，因此可在调用原类型方法时，增加额外的逻辑<br>
(3). 装饰器模式——创建一个装饰器类型实现原类型的接口，装饰器类型自身不持有原类型的对象，而是由外部传入，因此可以实现多个装饰器来不断的增强原类型能力，并且还能满足开闭原则<br>
(4). 用一个订单api的例子解释适配器模式、代理模式以及装饰器模式的区别与联系<br>
注：代理模式和装饰器模式很容易混淆，区别它们的一个关键的点就在于代理模式自己创建原类型的对象，而装饰器模式由外部传入原类型的对象。
#### 建造者模式
使用builder模式解决构造多属性对象的问题
#### 观察者模式
以一个订阅/发布的例子说明
#### 责任链模式
以一个责任链的简单demo说明
#### 策略模式
以一个可替换计算方式的计算器说明
