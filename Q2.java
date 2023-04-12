package Oop08;

/**
 * 質問２︓以下コードの出⼒するを回答してください。
 * @author hangt
 *
 */
public class Q2 {

		private String id;

		public Q2(String id) {
			this.id = id;
		}

		@Override
		public boolean equals(Object another) {
			if (another instanceof Q2) {
				Q2 an = (Q2) another;
				return an.id.equals(id);
			}
			return false;
		}

	// Kicker.java
	public static void main(String... args) {
		Q2 x = new Q2("1234");
		Q2 y = new Q2("1234");
		System.out.println(x == y); // true ? false? 原因は ?
		/**false
		 * インスタンス化は＝＝で比べることできない
		 */
		System.out.println(x.equals(y)); // true ? false? 原因は ?
		/**true
		 * インスタンス化はequalsで比べることができる
		 */
	}
}
