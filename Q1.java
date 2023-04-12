package Oop08;
/**
 * 質問１︓以下コードの出⼒するを回答してください。
 * @author hangt
 *
 */
public class Q1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true ? false? 原因は ?
		/**xとｙ両方はaから。*/
		
		System.out.println(x.equals(y)); // true ? false? 原因は ?
		/**xとｙ両方はaから。*/
		
		String empty = "";
		String nullString = null;
		System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
		/**equals メソッドを呼び出す前に null チェックを行う必要があります*/
		
	}

}
