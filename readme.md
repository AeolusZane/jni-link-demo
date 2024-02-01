# jni调用.a静态库demo
todo:js写下步骤的cli

https://blog.csdn.net/ZC_25/article/details/123060979

补充：链接jni.h的时候，java路径需要指定为本地的jdk路径。
## 清理
删掉
.o\.a\.so的文件
可以把java的.class和.h也删掉

## 生成头文件[JT.class]
javac JT.java

## 生成java字节码文件[JT.h]
javah JT

## 生成静态链接库
gcc -Wall -O2 -fPIC -I./  -c -o ./lib/welcome.o welcome.c

ar crv ./lib/libwelcome.a ./lib/welcome.o

## 编译实现jni方法的demo.c
gcc -Wall -O2 -fPIC -I /Users/zhangjingzheng/Library/Java/JavaVirtualMachines/corretto-1.8.0_282/Contents/Home/include/ -I /Users/zhangjingzheng/Library/Java/JavaVirtualMachines/corretto-1.8.0_282/Contents/Home/include/darwin/ -I./  -c -o ./lib/demo.o demo.c

## 链接静态链接库（生成lib.so文件给java的jni调用使用）
gcc -shared ./lib/demo.o -L./lib -lwelcome -o ./lib/libdemo.so

## java调用
java -Djava.library.path=./ JT

