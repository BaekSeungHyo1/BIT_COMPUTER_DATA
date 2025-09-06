package Static_Variable;

public class NumberPrinter {
    private int myNum = 0; // 인스턴스 변수, 객체마다 따로 존재

    static void showInt(int n) {
        System.out.println(n);
    }
    static void showDouble(double n) {
        System.out.println(n);
    }
    void setMyNumber(int n) {
        myNum = n;
    }
    void showMyNumber() {
        showInt(myNum);
    }
}

class ClassMethod {
    public static void main(String[] args) {
        // step 1: 클래스가 처음 사용되므로 JVM이 NumberPrinter 클래스를 메모리에
        // static 메소드와 변수들이 메모리에 올라감
        NumberPrinter.showInt(20);
        //NumberPrinter 클래스가 처음 사용되므로 JVM이 이 클래스를 메모리에 로딩
        //static 메서드인 showInt가 메모리에 올라감
        //showInt(20) 호출 → 20출력

        NumberPrinter np = new NumberPrinter();
        np.showDouble(3.15);
        np.setMyNumber(75);
        np.showMyNumber();
    }
}
