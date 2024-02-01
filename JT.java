import java.lang.String;
import java.lang.System;

public class JT{
  public native void call(); // native方法

  public static void main(String[] args) { //Java入口
    System.out.println("java in...");
    new JT().call();
    System.out.println("java out..");
  }
  static {
    System.load("/Users/zhangjingzheng/Desktop/workspace/learn/j2v8-demo/lib/libdemo.so"); //加载libdemo.so
  }
}
