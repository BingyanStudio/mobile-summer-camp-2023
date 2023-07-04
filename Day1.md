
#  Day 1
- [ ] [注册 Github 账号](https://github.com/signup)
- [ ] 学习使用 Git
- [ ] 简单学习 Markdown 的使用
- [ ] Fork 本项目并修改 README.md 同步进度
- [ ] 学习如何提交 Pull Request(PR)，将自己的进度通过 PR 提交至本仓库的自己所属的分支
- [ ] 安装 [Clash for Windows](https://github.com/Fndroid/clash_for_windows_pkg/releases)，点击 Show all 15 assets，通常下载 Clash.for.Windows.Setup.0.20.27.exe
- [ ] 找 [@Xeu](https://github.com/ThankRain) 要订阅链接
- [ ] Clash for Windows 开启 TUN 模式
- [ ] 下载安装 Android Studio
- [ ] 连接真机 / 启动虚拟机
- [ ] 创建新的空项目构建编译并运行
- [ ] 尝试进行调整文案位置等
- [ ] 同步进度

## Android Studio 安装
### 方式一 
官网直接下载
[Download Android Studio](https://developer.android.google.cn/studio)
###  方式二 
安装 JetBrains Toolbox，在 Jetbrains Toolbox 中一键下载安装 Android Studio，方便进行版本管理
[Download Jetbrains Toolbox](https://www.jetbrains.com/zh-cn/toolbox-app/)

## Clash for Windows 开启 TUN 模式
1. 打开 Clash，点击 Service Mode 右侧的 **Manage**,随后点击 **Install** 安装
2. 等待重启，重启后 Service Mode 右侧图标变为绿色
3. 打开 TUN Mode
4. 点击左侧 Profiles，在编辑框输入订阅链接点击下载，选中下载的订阅后关闭 Clash 窗口
5. Clash 会在后台运行，同时任务栏右侧会有小图标
6. 需要使用 Clash 的时候右键 Clash 小图标，点击 System Proxy，确保 System Proxy 和 TUN Mode 同时开启
7. 如果此时 Android Studio 仍无法正常安装则退出 Android Studio 后把 Clash 的模式由 Rule 修改为 Global，同时把 Proxy Group中的 Global 从 Direct 修改为 新加坡 节点
8. 使用完毕后取消勾选 System Proxy 即可

## Markdown

学习使用 Markdown 语法，它非常的简单好用，是绝大多数开发者的选择。之后你的日报、周报等文档都应该使用 Markdown 编写。

参考资料：

- [Markdown Guide](https://www.markdownguide.org/)

中文资料：

- [Markdown 教程](https://markdown.com.cn/basic-syntax/)

## Git

学习和整理 Git 的常用命令和基本操作流程，尝试在 Github 中创建一个仓库并进行管理。学会如何在 Github 上贡献代码（Fork、修改、提交、Pull Request）。

参考资料：

- [Git Official Document](https://git-scm.com/docs/gittutorial)
- [Make your first contributions on Github](https://github.com/firstcontributions/first-contributions/blob/main/README.md)

中文资料：

- [廖雪峰的 Git 教程](https://www.liaoxuefeng.com/wiki/896043488029600)
- [Commit message 和 Change log 编写指南 - 阮一峰的网络日志](https://www.ruanyifeng.com/blog/2016/01/commit_message_change_log.html)
- [在 Github 上做出你的第一个贡献](https://github.com/firstcontributions/first-contributions/blob/main/translations/README.zh-cn.md)

