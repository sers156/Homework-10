public class Exercise2 {

public  final  static double PI = 3.14;

public double ploshad(double radius) {
    double p1 = PI * radius *radius;
    return p1;
}

public static double dlina(double radius2){
    double d1 = 2 * PI * radius2;
    return d1;
}

public void info(double radius3){
    System.out.println("Радиус =" + radius3);
    System.out.println("Площадь круга =" + ploshad(radius3));
    System.out.println("Радиус =" + dlina(radius3));
}
}

class Exercise2Test {

    public static void main(String[] args) {
        Exercise2 ex = new Exercise2();
        ex.ploshad(6);
        Exercise2.dlina(4.5);
        ex.info(5);
    }
}
