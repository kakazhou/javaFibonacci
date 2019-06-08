### 斐波那契数列
```
sh demo.sh 10
> 第个10值是：55
```

> 编译单个文件
- javac xx.java
- java xx

> 编译带包的文件
- javac -cp package_path path/xx.java
- java -cp package_path path/xxx

> 编译带包的包
- javac -cp package_path path/xx.java
- java -cp package_path path/package_name.xx

> 将编译好的class文件放到单独的文件夹中
- javac -cp package_path -d out/  com/src/*.java
