public class prac2 {
    public static void main(String[] args){

        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
}

// 선행입력 후행입력에 대한 내용으로 ++x는 선행 입력으로 x 값에 1을 더한 후 계산이 진행
// y-- 는 후행입력으로 계산이 진행된 후 y 값에 1을 빼는 형태로 진행