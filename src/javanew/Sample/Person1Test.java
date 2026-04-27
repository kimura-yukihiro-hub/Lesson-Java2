package javanew.Sample;

public class Person1Test {
    public static void main(String[] args) {
        // 型 変数名 = new コンストラクタ; の形に修正
        Person1 person1 = new Person1("KIMURA", 24);
        
        // メソッド名のスペルと呼び出し方を修正 (display.Info → displayInfo)
        person1.displayInfo();
    }
}