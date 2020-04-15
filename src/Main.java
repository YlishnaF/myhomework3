import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      gameNumber();

      }

    public static void gameNumber () {
        Random random = new Random();
        int x = random.nextInt(10);
        System.out.println("Угадайте число от 0 до 9. У вас будет 3 попытки!");
        int tryCount = 0;
        do {
            int a = sc.nextInt();
            tryCount++;

            if(a == x){
                System.out.println("Поздравляю, вы выйграли!");
                System.out.println("Если хотите сыграть еще раз нажмите 1, если нет - 0.");
                int b = sc.nextInt();
                if (b == 1) {
                    gameNumber();
                } if(b == 0){
                    return;
                }
            } else if(a > x){
                System.out.println("Вы ввели слишком большое число");
            } else {
                System.out.println("Вы ввели слишком маленькое число");
            }

        } while (tryCount<3);

        System.out.println("Вы проиграли! Если хотите сыграть еще раз нажмите 1, если нет - 0.");
        int b = sc.nextInt();
        if (b == 1) {
            gameNumber();
        }

    }


}
