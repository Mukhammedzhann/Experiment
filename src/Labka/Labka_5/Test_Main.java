package Labka.Labka_5;
import java.util.Scanner;

public class Test_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип транспорта:");
        System.out.println("1. Автомобиль");
        System.out.println("2. Мотоцикл");
        System.out.println("3. Самолет");
        System.out.println("4. Велосипед");

        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите модель транспорта: ");
        String model = scanner.nextLine();
        System.out.print("Введите скорость транспорта (км/ч): ");
        int speed = scanner.nextInt();

        TransportFactory factory = null;

        switch (choice) {
            case 1:
                factory = new CarFactory();
                break;
            case 2:
                factory = new MotorcycleFactory();
                break;
            case 3:
                factory = new PlaneFactory();
                break;
            case 4:
                factory = new BicycleFactory();
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }


        Transport transport = factory.createTransport(model, speed);
        transport.Move();
        transport.FuelUp();

        scanner.close();
    }
}
