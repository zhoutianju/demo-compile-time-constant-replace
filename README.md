### 编译期常量替换 Demo

详细信息可参考：[编译期常量替换](https://zhoutianju.github.io/note/maven/%E7%BC%96%E8%AF%91%E5%99%A8%E5%B8%B8%E9%87%8F%E6%9B%BF%E6%8D%A2.html)

可用以下命令验证

```bash
 # 默认使用 dev
mvn clean compile exec:java -Dexec.mainClass=priv.zhoutj.demo.Main
 # 指定 dev
mvn clean compile exec:java -Dexec.mainClass=priv.zhoutj.demo.Main -P dev
 # 指定 prod
mvn clean compile exec:java -Dexec.mainClass=priv.zhoutj.demo.Main -P prod
```
