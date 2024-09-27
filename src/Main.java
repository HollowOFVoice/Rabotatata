import javax.management.StringValueExp;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String cmd;
        do {
            System.out.printf("Введите информацию: ");

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();




        System.out.printf("К какой классификаци относится введеная вами информация? Выберите из предложанных ниже: \n");
        System.out.println("1. Без ограничения доступа");
        System.out.println("2. С ограничением доступа");
            String sifika = in.nextLine();
        if (sifika.equals("2")){
            System.out.println("Укажите также какого типа будет информация:");
            System.out.println("1. Открытая");
            System.out.println("2. Закрытая");
            String typy = in.nextLine();

            switch (typy){
                case "1":System.out.println("Ваша информация является: Ограниченной открытого типа");break;
                case "2": System.out.println("Ваша информация является: Ограниченной закрытого типа");break;
                default:
                    System.out.println("Допущена ошибка при вводе, введите данные повторно!!!");
            }

        } else if (sifika.equals("1")) {
            System.out.println("Классификация вашей информации идентифицирована как 'Без ограничения доступа'.");

        }

            int bibop = Integer.parseInt(sifika);

        if (bibop>2 ){
            System.out.println("Допущена ошибка при вводе, введите данные повторно!!!");
        }

        cmd = sifika;

        }while (cmd!="0");
    }
}