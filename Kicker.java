package Oop08;

/**
 * 質問３︓以下コンパイルを修正してください。

 * @author hangt
 *
 */
/**
// Parent.java
public class Q3 {
	public void hello() {
		System.out.println("parent method");
	}
}

// Child.java
public class Child extends Q3 {
	@Override // 親クラスの強制的にOverrideする意味（アノテーション）
	public void hello() {
		System.out.println("child method");
	}
}

// Kicker.java
public class Kicker {
	public static void print(Child v) {
		v.hello();
	}

	public static void main(String... args) {
		print(new Q3());
		print(new Child());
	}
}*/
//Parent.java

// Child.java

// Kicker.java
public class Kicker {
	public static void print(Parent parent) {
		parent.hello();
	}

	public static void main(String... args) {
		print(new Parent());
		print(new Child());
	}
}
