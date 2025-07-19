public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("AB" + '\b' + 'C');
        System.out.println("AB" + '\t' + 'C');
        System.out.println("AB" + '\n' + 'C');
        System.out.println("AB" + '\r' + 'C');
        System.out.println("오늘의 환율은 1$에 0.88" + '\u20AC' + "입니다.");
    }
}
