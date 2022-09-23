public class first_homework {
    public static void main(String[] args) {

        int var1 = 5;
        int var2 = 2;
        double var3 = var1/var2; // %가 아닌 /이기 나머지는 버리고 var3이 double 타입이기 때문에 2가 아닌 2.0
        int var4 = (int)(var3*var2); // 2.0 * 2 = 4지만 명시적 형변환 (int)로 정답은 4이다.
        System.out.println(var4); // 4


        int x = 10;
        int y = 20;
        int z = (++x) + (y--); // x는 전위 증가 연산자이기 때문에 11, y는 후위 감소 연산자이기 때문에 여기선 20이다. 따라서 z = 31
        System.out.println(z); // 31
        /*
        전위 증가 연산자는 먼저 1을 증가시킨 후 연산을 실행하기 때문에  int z = (++x) + (y--);에서 x는 11이다
        y는 후위 감소 연산자이기 때문에 연산 이후 1을 감소시켜 int z = (++x) + (y--);에서 y는 20이다
        int z = (++x) + (y--); 이후에 y값은 1이 감소된 19이다.
         */


        int result = 0;
        System.out.println("시작!");
        while(result != 5){ //result의 값이 5가 될 때까지 반복
            result = 0;
            int first = (int)(Math.random() * 6) + 1; // 1 ~ 6까지 랜덤으로 first에 저장
            int second = (int)(Math.random() * 6) + 1; // 1 ~ 6까지 랜덤으로 secondt에 저장
            System.out.println("(" + first + "," + second + ")");
            result = first + second;
        }
        System.out.println("끝");



    }
}


