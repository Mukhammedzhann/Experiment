package Home_work.Practika_5_2;
import java.util.Scanner;

public class Test_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип транспорта:");
        System.out.println("1. Автомобиль");
        System.out.println("2. Мотоцикл");
        System.out.println("3. Грузовик");
        System.out.println("4. Автобус");

        int choice = scanner.nextInt();
        IVehicle vehicle = null;

        switch (choice) {
            case 1:
                System.out.print("Введите марку автомобиля: ");
                String brand = scanner.next();
                System.out.print("Введите модель автомобиля: ");
                String model = scanner.next();
                System.out.print("Введите тип топлива: ");
                String fuelType = scanner.next();

                vehicle = new CarFactory(brand, model, fuelType).createVehicle();
                break;

            case 2:
                System.out.print("Введите тип мотоцикла: ");
                String motorcycleType = scanner.next();
                System.out.print("Введите объем двигателя (cc): ");
                int engineCapacity = scanner.nextInt();

                vehicle = new MotorcycleFactory(motorcycleType, engineCapacity).createVehicle();
                break;

            case 3:
                System.out.print("Введите грузоподъемность (кг): ");
                int loadCapacity = scanner.nextInt();
                System.out.print("Введите количество осей: ");
                int axles = scanner.nextInt();

                vehicle = new TruckFactory(loadCapacity, axles).createVehicle();
                break;

            case 4:
                System.out.print("Введите количество мест: ");
                int seatingCapacity = scanner.nextInt();

                vehicle = new BusFactory(seatingCapacity).createVehicle();
                break;

            default:
                System.out.println("Неверный выбор.");
                return;
        }

        vehicle.Drive();
        vehicle.Refuel();

        scanner.close();
    }
}
