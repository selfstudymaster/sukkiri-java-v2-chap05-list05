package main;

//chapter05
//list05-01 シンプルなメソッドの定義
// 引数リストを記述していないのでエラーになります
//public class Main {
//	// public static 戻り値の型(void) メソッド名(hello(引数リスト))
//	public static void hello() {
//		System.out.println("こんにちは");
//
//	}
//}

//list05-02 メソッドの呼び出し
//public class Main {
//
//	// public static 戻り値の型(void) メソッド名(main(引数リスト))
//	// main(String[] args)メソッドの定義
//	public static void main(String[] args) {
//		System.out.println("メソッドを呼び出します");
//		// hello()メソッドを呼び出す
//		hello();
//		System.out.println("メソッドを呼び出しが終わりました");
//	}
//
//	// hello()メソッドの定義
//	public static void hello() {
//		System.out.println("湊さん、こんにちは");
//	}
//
//}

//list05-03 mainメソッドの外からメソッドを呼び出す
// main()メソッドが後に書かれててもmain()メソッドから動き始める

//public class Main {
//
//	public static void methodA() {
//		System.out.println("methodA");
//		// methodBの呼び出し
//		methodB();
//	}
//
//	public static void methodB() {
//		System.out.println("methodB");
//	}
//
//	public static void main(String[] args) {
//		// methodAの呼び出し
//		methodA();
//	}
//}

//list05-04 引数の例(渡す引数が1つの場合)
//public class Main {
//
//	public static void main(String[] args) {
//		System.out.println("メソッドを呼び出します");
//		// 引数に"湊"を渡してhello()メソッドを呼び出す
//		hello("湊");
//		// 引数に"朝香"を渡してhello()メソッドを呼び出す
//		hello("朝香");
//		// 引数に"菅原"を渡してhello()メソッドを呼び出す
//		hello("菅原");
//
//		System.out.println("メソッドを呼び出しが終わりました");
//	}
//
//	// hello()メソッドに引数の型Stringと引数に変数nameを宣言
//	public static void hello(String name) {
//		// 変数nameに引数の値が代入される
//		System.out.println(name + "さん、こんにちは");
//	}
//
//}

//list05-05 引数の例(渡す値が複数の場合)
//public class Main {
//
//	public static void main(String[] args) {
//		add(100, 20);
//		add(200, 50);
//	}
//
//	public static void add(int x, int y) {
//		int ans = x + y;
//		System.out.println(x + "+" + y + "=" + ans);
//	}
//}

//list05-05 引数の例(渡す値が複数の場合)
public class Main {

	public static void main(String[] args) {
		add(100, 20);
		add(200, 50);
	}

	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}

// 雛形
// list05-
//public class Main {
//
//	public static void main(String[] args) {
//
//
//	}
//}
