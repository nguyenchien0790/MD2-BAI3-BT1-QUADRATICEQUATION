import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Nhap a : ");
        a = scanner.nextDouble();
        while (a==0){
            System.out.println("Nhap a != 0 ");
            a = scanner.nextDouble();
        }
        System.out.println("Nhap b : ");
        b = scanner.nextDouble();
        System.out.println("Nhap c : ");
        c = scanner.nextDouble();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta<0){
            System.out.println("Phương trình vô nghiệm");
        } else if (delta==0) {
            System.out.println("Phương trình có nghiệm kép X1 = X2 =  "+ quadraticEquation.getRoot1()  );

        }else{
            System.out.println("Phương trinh có 2 nghiêm phân biêt : \n X1 = "+ quadraticEquation.getRoot1() + " X2 = " +quadraticEquation.getRoot2() );
        }

    }

}