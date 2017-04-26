package TugasInheritance;
//main

import java.util.Scanner;

public class mainStupido {

    public static void main(String[] args) {
        int t, b = 0;
        Scanner i = new Scanner(System.in);
        perusahaan p = new perusahaan();
        Sofeng s = new Sofeng();
        Proman pr = new Proman();
        System.out.println("gaji software engineering");
        t = (int) i.nextDouble();
        b = (int) i.nextDouble();
        System.out.println(s.displayMessege1(t, b));
        System.out.println("gaji Project Manager");
        t = (int) i.nextDouble();
        pr.getGajipokokProman();
        System.out.println(pr.displayMessege2(t, b));
    }
}
