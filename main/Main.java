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
//public class Main {
//	// 一つ目のadd メソッド(int型)
//	public static int add(int x, int y) {
//		return x + y;
//	}
//
//	// 二つ目のadd メソッド(double型)
//	public static double add(double x, double y) {
//		return x + y;
//	}
//
//	// 三つ目のadd メソッド(String型)
//	public static String add(String x, String y) {
//		return x + y;
//	}
//
//	// main メソッド
//	public static void main(String[] args) {
//		System.out.println(add(10, 20));
//		System.out.println(add(3.5, 2.7));
//		System.out.println(add("Hello ", "World"));
//	}
//}

//list05-11 オーバーロード(引数の数が異なる場合は可能)
//public class Main {
//	// 一つ目のadd メソッド(int型 2つ)
//	public static int add(int x, int y) {
//		return x + y;
//	}
//
//	// 二つ目のadd メソッド(int型 3つ)
//	public static int add(int x, int y, int z) {
//		return x + y + z;
//	}
//
//	// main メソッド
//	public static void main(String[] args) {
//		System.out.println("10 + 20 = " + add(10, 20));
//		System.out.println("10 + 20 + 30 = " + add(10, 20, 30));
//	}
//}

// list05-12 配列が引数
//public class Main {
//
//	public static void printArray(int[] array) {
//		for (int element : array) {
//			System.out.println(element);
//		}
//	}
//	public static void main(String[] args) {
//		int[] array =  {1, 2, 3};
//		printArray(array);
//	}
//}

// 5.5.2 値渡しと参照渡し
//public class Main {
//
//	public static void main(String[] args) {
//		int x = 100;
//		// methodAを呼び出した時点での変数xの値(100)が、メソッドの仮引数xにコピーされる
//		methodA(x);
//	}
//	// 変数xに代入されている値100が渡されている(値渡し)
//	public static void methodA(int x) {
//		System.out.println(x);
//	}
//}

//public class Main {
//
//	public static void main(String[] args) {
//		int[] array = {1, 2, 3}; // arrayには配列の先頭要素のアドレスが代入される
//		// printArrayを呼び出した時点での配列arrayのアドレスが、メソッドの仮引数arrayにコピーされる
//		printArray(array);
//	}
//	// mainメソッド内の変数array と、printArrayメソッド内の引数array はどちらも配列の実体を参照した状態になる(参照の値渡し)
//	public static void printArray(int[] array) {
//		System.out.println(array);
//	}
//}

// list05-13 同じ配列を参照していることを確認する
//public class Main {
//	public static void incArray(int[] array) {
//
//		for (int i = 0; i < array.length; i++) {
//			array[i]++;
//			// returnを返さないでおく
//		}
//	}
//	public static void main(String[] args) {
//		int[] array = {1, 2, 3};
//		incArray(array);
//		for(int i : array) {
//			System.out.println(i);
//		}
//	}
//}

//list05-14 戻り値が配列の場合
//public class Main {
//
//	public static int[] makeArray(int size) { // ③ mainメソッドのmakeArray(3)にアドレスを渡す
//		int[] newArray = new int[size]; // ②はじまり
//		for (int i = 0; i < newArray.length; i++) {
//			newArray[i] = i;
//		}
//		return newArray; // returnを返す ②終わり 配列の戦闘要素がmainメソッドに戻される
//	}
//
//	public static void main(String[] args) {
//
//		int[] array = makeArray(3); // ①, ④ arrayのアドレスを参照
//		for(int i : array) {
//			System.out.println(i);
//		}
//	}
//}

// practice05-01
//public class Main {
//	public static void main(String[] args) {
//		introduceOneself();
//	}
//
//	public static void introduceOneself() {
//		String name = "天才";
//		int age = 20;
//		double height = 190.0;
//		char gender = '男';
//		System.out.println("私の名前は" + name + "です。\n年は" + age + "です。\n" + "身長は" + height + "cmです。\n" + "性別は" + gender + "です。");
//	}
//}

// practice05-02
//public class Main {
//	public static void main(String[] args) {
//		String title ="天才試験結果のご連絡";
//		String address = "example@xxxxxxxx.com";
//		String text = "「合格しました」";
//		email(title, address, text);
//	}
//
//	public static void email(String title, String address, String text) {
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名：" + title);
//		System.out.println("本文：" + text);
//	}
//}

//practice05-03
//public class Main {
//	public static void main(String[] args) {
//		String address = "example@xxxxxxxx.com";
//		String text = "「合格しました」";
//		email(address, text);
//	}
//	public static void email(String address, String text) {
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名：無題");
//		System.out.println("本文：" + text);
//	}
//	public static void email(String title, String address, String text) {
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名：" + title);
//		System.out.println("本文：" + text);
//	}
//}

// practice05-04
// 模範解答
public class Main {
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積：" + triangleArea + "平方cm");
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積：" + circleArea + "平方cm");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double triangle = bottom * height / 2;
		return triangle;
	}

	public static double calcCircleArea(double radius) {
		double circle = radius * radius * 3.14;
		return circle;
	}
}

// 自分で解答したコード
//public class Main {
//	public static double calcTriangleArea() {
//		double bottom = 10.0;
//		double height = 5.0;
//		double triangle = bottom * height / 2;
//		return triangle;
//	}
//
//	public static double calcCircleArea() {
//		double radius = 5.0;
//		double circle = radius * radius * 3.14;
//		return circle;
//	}
//
//	public static void main(String[] args) {
//		calcTriangleArea();
//		calcCircleArea();
//		System.out.println("三角形の面積：" + calcTriangleArea() + "平方cm");
//		System.out.println("円の面積：" + calcCircleArea() + "平方cm");
//	}
//}


// 雛形
// list05-
//public class Main {
//
//	public static void main(String[] args) {
//
//
//	}
//}
