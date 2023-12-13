public class Exercise1 {
    static double umnojenie(double a, double b, double c){
        return a*b*c;
    }
    static void delenie(int a, int b){
        System.out.println("Целое частное =" + a/b +"  Остаток =" + a % b);
    }
}
class Exercise1Test {
    public static void main(String[] args) {
        System.out.println(Exercise1.umnojenie(4,5,6));
        Exercise1.delenie(9,4);
        System.out.println(Exercise1.umnojenie(2.5,5.5,5));
        Exercise1.delenie(15,4);
    }
}