public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 2 ; i++) {
            System.out.println("あなたの身長を入力してください");
            double height = sc.nextDouble();
            System.out.println("あなたの体重を入力してください");
            double weight = sc.nextDouble();

            double bmi = weight / ((height / 100) * (height / 100));

            System.out.println(String.format("%.2f", bmi) + "です");
        }
    }
}
