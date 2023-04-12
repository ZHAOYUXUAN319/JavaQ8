package Oop08;

/**
 * 質問３︓以下コンパイルを修正してください。

 * @author hangt
 *
 */

public class Child extends Parent {
	 @Override // 親クラスの強制的にOverrideする意味（アノテーション）
	 public void hello() {
	 System.out.println("child method");
	 }
	}