# 设计模式
请参见[博客](http://blog.csdn.net/lovelion/article/details/17517213)
本文只是阅读该博客的一些随笔而已
## 1.设计模式概述
### 1.1设计模式从何而来
模式是在特定环境下人们解决某类重复出现问题的一套成功或有效的解决方案
### 1.2 设计模式是什么
设计模式是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结，使用设计模式是为了可重用代码、让代码更容易被他人理解并且保证代码可靠性。
### 1.3 设计模式有什么用
### 1.4 常用设计模式
####  1.4.1 创建型模式
| 名称 | 功能 |
| --- | --- |
| [单例模式](./单例模式.md) | |
| [简单工厂模式](./简单工厂模式.md) | |
| [工厂方法模式](./工厂方法模式.md) | |
| [抽象工厂模式](./抽象工厂模式.md) | |
| [原型模式](./原型模式.md) | |
| [建造者模式](./建造者模式.md) | |
####  1.4.2 结构型模式
| 名称 | 功能 |
| --- | --- |
| [适配器模式](适配器模式.md) | 不兼容结构的协调 |
| [桥接模式](桥接模式.md) | 处理多维度变化 |
| [组合模式](组合模式.md) | 树形结构的处理 |
| [装饰模式](装饰模式.md) | 拓展系统功能 |
| [外观模式](外观模式.md) | 提供统一的入口|
| 享元模式 | |
| 代理模式 | |
#### 1.4.3 行为型模式
*  职责链模式
*  命令模式
*  解释器模式
*  迭代器模式
*  中介者模式
*  备忘录模式
*  观察者模式
*  状态模式
*  策略模式
*  模板方法模式
*  访问者模式

## 2.面向对象设计原则
如何同时提高一个软件系统的可维护性和可复用性是面向对象设计需要解决的核心问题之一

面向对象设计原则为支持可维护性复用而诞生，这些原则蕴含在很多设计模式中，它们是从许多设计方案中总结出的指导性原则

| 设计原则名称 | 定  义 | 使用频率 |
| --- | --- | --- |
| 单一职责原则 | 一个类只负责一个功能领域中的相应职责 | 4 |
| 开闭原则 | 软件实体应对扩展开放，而对修改关闭 | 5 |
| 里氏代换原则 | 所有引用基类对象的地方能够透明地使用其子类的对象 | 5 |
| 依赖倒转原则 |  抽象不应该依赖于细节，细节应该依赖于抽象 | 5 |
| 接口隔离原则 | 使用多个专门的接口，而不使用单一的总接口 | 2 |
| 合成复用原则 | 尽量使用对象组合，而不是继承来达到复用的目的 | 4 |
| 迪米特法则 | 一个软件实体应当尽可能少地与其他实体发生相互作用 | 3 |


