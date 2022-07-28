import java.util.Scanner;

public class Main {

    public static void name () {

        System.out.println("1.");
        System.out.println("Hello\nAndreea");
    }

    public static void sum() {
        System.out.println("2.");
        System.out.println(1+2);
    }

    public static void div() {
        System.out.println("3.");
        System.out.println((float) 5/2);
    }

    public static void calc() {
        System.out.println("4.");
        System.out.println("a." + ( -5 + 8 * 6));
        System.out.println("b." + (55+9) % 9 );
        System.out.println("c." + ( 20 + (float)-3*5 / 8));
        System.out.println("d." + (5 + 15 / 3 * 2 - 8 % 3));
    }

    public static int adunare(int a, int b)
    {
        return a+b;
    }
 public static int scadere(int a, int b)
    {
        return a-b;
    }
public static int inmultire(int a, int b)
     {
         return a*b;
     }
     public static float impartire( float a, float b)
     {
         return a/b;
     }
public static void model()
    {
        System.out.println("""
                 +""\"""+                                                \s
                [| o o |]                                               \s
                 |  ^  |                                                \s
                 | '-' |                                                \s
                 +-----+
                """);
    }

public static float media(int a, int b, int c)
{
    int sum = 0;
    float avg =0;
    sum=a+b+c;
    avg=sum/3;
    return avg;
}

public static float temperatura(float f)
{
    float c = (float)5/9 * (f-32);
    return c;
}

public static int rest(int a, int b)
{
    int r;
    return r = a%b;
}

public static float inch(float i)
{
    float m = (float)0.0254*i;
    return m;
}

    public static void main(String[] args){
        //1
        System.out.println("Exercitiul 1:");
        name();
        sum();
        div();
        calc();

        //2
        System.out.println("Exercitiul 2:");
        System.out.println("Rezultatul adunarii este: " + adunare(2,3));
        System.out.println("Rezultatul scaderii este: " + scadere(8,1));
        System.out.println("Rezultatul inmultirii este: " + inmultire(2,4));
        System.out.println("Rezultatul impartirii este: " + impartire(7,3));

        //3
        System.out.println("Exercitiul 3:");
        model();

        //4

        Scanner scan = new Scanner (System.in);
        int x, y;
        System.out.println("Exercitiul 4:");
        System.out.println("Dati primul numar:");
        int a = scan.nextInt();
        System.out.println("Dati al doilea numar:");
        int b = scan.nextInt();
        System.out.println("Dati al treilea numar:");
        int c = scan.nextInt();
        System.out.println("Media celor 3 numere este:" + media(a,b,c));

        //5
        System.out.println("Restul impartirii a doua numere:"+ rest(a,b));

        //6
        System.out.println("Exercitiul 6: ");
        System.out.println("Dati temperatura in grade:");
        float f = scan.nextInt();
        System.out.println("Temperatura in Fahrenheit:" + temperatura(f));


        //7
        float i = scan.nextInt();
        System.out.println(i + " inch m "+ inch(i));

        //8

    }}
