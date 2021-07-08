package priv.zhoutj.demo;

import priv.zhoutj.demo.annotation.Foo;

/**
 * @author zhoutianju
 * @since 2021/7/8
 */
public class Main {
	public static void main(String[] args) {
		Foo foo = Demo.class.getAnnotation(Foo.class);
		System.out.println(foo.name());
	}
}
