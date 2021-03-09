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

//list05-06 引数を使わずにできないか？
//public class Main {
//
//	public static void main(String[] args) {
//		int x = 100;
//		int y = 10;
//		add();
//	}
//
//	public static void add() {
//		// xとyは宣言されたmainメソッドのスコープ外なのでエラーになる
//		// mainメソッドのローカル変数x, y と、addメソッドのローカル変数x, yは全くの別物
//		int ans = x + y;
//		System.out.println(x + "+" + y + "=" + ans);
//	}
//}

// 5.3.1 戻り値とは
//public statis 戻り値の型 メソッド名(引数リスト) {
// 戻り値の型(return文によって戻される値と同じ型を指定する
//	メソッドが実行されたときに動く処理
//	return 戻り値(変数に入っている値を戻すには変数名を指定する);
//}

//5.3.2 戻り値を受け取る
// 型　変数名 = メソッド名(引数リスト);


//list05-07 戻り値の例
//public class Main {
//
//	public static int add(int x, int y) {
//		int ans = x + y;
//		return ans;
//	}
//
//	public static void main(String[] args) {
//		int ans = add(100, 10);
//		System.out.println("100 + 10 = " + ans);
//	}
//}


//list05-08 戻り値をそのまま使う
//public class Main {
//
//	public static int add(int x, int y) {
//		int ans = x + y;
//		return ans;
//	}
//
//	public static void main(String[] args) {
//		System.out.println( add( add(10, 20), add(30, 40) ) );
//	}
//}

// list05-09 誤ったreturn文
//public class Main {
//	public static int sample(int x, int y) {
//		int ans = x + y;
//		return ans; // return文で処理を抜ける
//		int x = 10; // return文の後ろに書いても実行できないでコンパイルエラーになる
//	}
//}

//list05-10 オーバーロード(引数の型が異なる場合は可能)
public class Main {
	// 一つ目のadd メソッド(int型)
	public static int add(int x, int y) {
		return x + y;
	}

	// 二つ目のadd メソッド(double型)
	public static double add(double x, double y) {
		return x + y;
	}

	// 三つ目のadd メソッド(String型)
	public static String add(String x, String y) {
		return x + y;
	}

	// main メソッド
	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(3.5, 2.7));
		System.out.println(add("Hello ", "World"));
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
