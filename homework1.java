import java.util.Scanner;

public class homework1 {
    public static void main(String[] args){
        //Begin12. Даны катеты прямоугольного треугольника a и b.
        //Найти его гипотенузу c и периметр P: c = √a^2 + b^2, P = a + b + c
        /*
        int a = 7;
        int b = 6;
        double c = Math.sqrt((a*a)+(double)(b*b));
        double P = a + b + c;
        System.out.printf("Гипотенуза: %f \t Периметр: %f", c,P);
         */
        //Begin13. Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
        //Найти площади этих кругов S1 и S2, а также площадь S3 кольца, внешний
        //радиус которого равен R1, а внутренний радиус равен R2: S1 = π·(R1)^2, S2 = π·(R2)^2, S3 = S1 − S2
        /*
        final double pi=3.14;
        int R1=10;
        int R2=8;
        double S1=pi*(R1*R1);
        double S2=pi*(R2*R2);
        double S3=S1-S2;
        System.out.printf("S1 равно: %.2f \nS2 равно: %.2f \nS3 равно: %.2f", S1, S2, S3);
        */
        //Begin14. Дана длина L окружности. Найти ее радиус R и площадь S круга,
        //ограниченного этой окружностью, учитывая, что L = 2·π·R, S = π·R^2.В качестве значения π использовать 3.14.
        /*
        final double pi=3.14;
        int L=300;
        double R=L/(2*pi);
        double S=pi*(R*R);
        System.out.printf("Радиус окружности: %.04f \nПлощадь круга: %.04f", R,S);
        */
        //Begin15. Дана площадь S круга. Найти его диаметр D и длину L окружности,
        //ограничивающей этот круг, учитывая, что L = 2·π·R, S = π·R^2.В качестве значения π использовать 3.14.
        /*
        final double pi=3.14;
        int S=230;
        double R=Math.sqrt(S/pi);
        double L=2*pi*R;
        System.out.printf("Диаметр круга: %.2f \nДлина окружности: %.2f", R,L);
        */
        //Begin16. Найти расстояние между двумя точками с заданными координатами x1 и x2 на числовой оси: |x2 − x1|.
        /*
        int x1=-7;
        int x2=24;
        System.out.println(Math.abs(x1-x2));
         */
        //Begin17. Даны три точки A, B, C на числовой оси. Найти длины отрезков AC и BC и их сумму
        /*
        int a=54;
        int b=23;
        int c=98;
        System.out.println(Отрезок АС: Math.abs(a-c));
        System.out.println(Отрезок BCMath.abs(b-c));
        System.out.println(Сумма отрезков АС и BC: Math.abs(b-c)+Math.abs(a-c));
         */
        //Begin18. Даны три точки A, B, C на числовой оси. Точка C расположена
        //между точками A и B. Найти произведение длин отрезков AC и BC.
        /*
        int a=10;
        int b=20;
        int c=15;
        int ac=c-a;
        int bc=Math.abs(c-b);
        int abc=ac*bc;
        System.out.printf("Произведение длин отрезков АС и BC равно %d",abc);
        */
        //Begin19. Даны координаты двух противоположных вершин прямоугольника:
        //(x1, y1), (x2, y2). Стороны прямоугольника параллельны осям координат.
        //Найти периметр и площадь данного прямоугольника
        /*
        int x1=2;
        int y1=2;
        int x2=8;
        int y2=12;
        double P;
        double S;
        P=2*(Math.abs(x1-x2)+Math.abs(y1-y2));
        S=Math.abs(x1-x2)*Math.abs(y1-y2);
        System.out.println("Периметр: "+P);
        System.out.println("Площадь: "+S);
         */
        //Begin20. Найти расстояние между двумя точками с заданными координатами
        //(x1, y1) и (x2, y2) на плоскости. Расстояние вычисляется по формуле
        //√(x2 − x1)^2 + (y2 − y1)^2
        /*
        int x1=1;
        int y1=1;
        int x2=17;
        int y2=5;
        int xy=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        double result;
        result=Math.sqrt(xy);
        System.out.println("Растояние между точками: "+result);
        */
        //Begin21. Даны координаты трех вершин треугольника: (x1, y1), (x2, y2), (x3, y3).
        //Найти его периметр и площадь, используя формулу для расстояния между двумя точками на плоскости (см. задание Begin20).
        //Для нахождения площади треугольника со сторонами a, b, c использовать формулу Герона:
        //S = √p·(p − a)·(p − b)·(p − c),
        /*
        int x1, y1;
        x1=2;
        y1=2;
        int x2, y2;
        x2=6;
        y2=4;
        int x3, y3;
        x3=2;
        y3=6;
        double a=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        double b=Math.sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)));
        double c=Math.sqrt(((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1)));
        double p=(a+b+c)/2;
        double S;
        S=Math.sqrt(p)*(p-a)*(p-b)*(p-c);
        System.out.println("Площадь треугольника: "+S);
         */
        //Begin23. Даны переменные A, B, C. Изменить их значения, переместив содержимое A в B, B — в C, C — в A.
        //И вывести новые значения переменных A, B, C.
        /*
        int a=1;
        int b=2;
        int c=3;
        int a1=a;
        int b1=b;
        int c1=c;
        a=b1;
        b=c1;
        c=a1;
        System.out.println("Переменная а: "+a+" Переменная b: "+b+" Перменная с: "+c);
         */
        //Begin24. Даны переменные A, B, C. Изменить их значения, переместив содержимое A в C, C — в B, B — в A.
        // И вывести новые значения переменных A, B, C.
        /*
        String a="a";
        String b="b";
        String c="c";
        String d=a;
        a=b;
        b=c;
        c=d;
        System.out.println("Перeменная А: "+a+"\nПеременная В: "+b+"\nПерeменная С: "+c);
         */
        //Begin25. Найти значение функции y=3x^6−6x^2−7 при данном значении x.
        /*
        int x=5;
        double y;
        y=3*Math.pow(x,6)-6*Math.pow(x,2)-7;
        System.out.println("Если х="+x+", то "+y+"=3x^6-6x^2-7=");
         */
        //Begin26. Найти значение функции y = 4(x−3)^6 − 7(x−3)^3 + 2 при данном значении x.
        /*
        int x=9;
        double y=4*Math.pow((x-3),6)-7*Math.pow((x-3),3)+2;
        System.out.println("Если х="+x+", то 4(x−3)^6 −7(x−3)^3+2="+(int)y);
        */
        //Begin27.
        //Дано число A. Вычислить A^8, используя вспомогательную переменную и три операции умножения.
        //Для этого последовательно находить A^2, A^4, A^8. Вывести все найденные степени числа A.
        /*
        long A=23;
        System.out.println("A=2");
        long a=A*A;
        System.out.println("A^2="+a);
        A=a*a;
        System.out.println("A^4="+A);
        a=a*A*a;
        System.out.println("A^8="+a);
         */
        //Begin28. Дано число A. Вычислить A^15 используя две вспомогательные переменные и пять операций умножения.
        //Для этого последовательно находить A^2, A^3, A^5, A^10, A^15. Вывести все найденные степени числа A.
        /*
        long A=2;
        System.out.println("A="+A);
        long a=A*A;
        System.out.println("A^2="+a);
        long a1=a*A;
        System.out.println("A^3="+a1);
        a=a*a1;
        System.out.println("A^5="+a);
        a1=a*a;
        System.out.println("A^10="+a1);
        a1=a*a1;
        System.out.println("A^15="+a1);
         */

    }
}
