# Day 2
 
- [ ] 学习 Git upstream，将自己的本地代码库与主仓库的内容同步，并尝试解决 Git 冲突
- [ ] 完成 Day 1 未完成的内容
- [ ] 了解 Android 项目结构
- [ ] 学习了解 Java 的基础语法，包括数据类型，类和对象，继承
- [ ] 简单学习 XML 的基础结构
- [ ] 学习线性布局 LinearLayout与相对布局 RelativeLayout，了解其基本的工作效果
- [ ] 学习 TextView 与 Button
- [ ] 学习 Java 接口，以及实现 Android 点击事件 


## Git Upstream
[同步Fork仓库 git upstream](https://www.jianshu.com/p/7f6598253a2b)

## Android 项目结构

核心文件

```
── app
   ├── build.gradle // 项目配置文件，包括依赖，版本号，包名，构建配置等
   └── src // source 源代码目录
       └── main
│          ├── AndroidManifest.xml // Android 清单配置，四大组件声明，App入口，需要的权限配置都在这里面
           ├── java/com/xxx/xxxxx
           │   └── MainActivity.java // 入口 Java 文件，在AndroidManifest.xml中定义
           └── res
               └── layout
                   └── activity_main.xml // 入口布局文件，由 MainActivity.java 使用
```

## 其他参考资料
[Java 教程 | 菜鸟教程](https://www.runoob.com/java/java-tutorial.html)

[布局](https://developer.android.google.cn/guide/topics/ui/declaring-layout?hl=zh-cn)

[按钮](https://developer.android.google.cn/guide/topics/ui/controls/button?hl=zh-cn)