import java.util.Scanner;
import static java.lang.System.exit;



public class BasicCalculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        for (; ; ) {
            char terms = input.next().charAt(0);
            if (terms == 'X'||terms == 'x') {
                exit(1);
            } else {
                int a = input.nextInt();
                int b = input.nextInt();
                int result = 0;
                if(terms == '+'){
                    result = a + b;
                }
                else  if(terms == '*'){
                    result = a * b;
                }
                else if(terms == '-'){
                    result = a - b;
                }else  if(terms == '/'){
                    result = a / b;
                }
                System.out.println(result);
            }
        }
    }
}
