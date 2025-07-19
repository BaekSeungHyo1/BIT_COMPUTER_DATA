public class Two_Week {
    public static void main(String[] args) {
        boolean ste = true;
        int num1 = 11;

        if(ste) {
            //int num1 = 22; // 이미 main 메소드 안에서 생성이 됨
            num1++;
            System.out.println(num1);
        }
        {
            int num2 = 33;
            num2++;
            System.out.println(num2);
        }

        //System.out.println(num2);
    }
}
