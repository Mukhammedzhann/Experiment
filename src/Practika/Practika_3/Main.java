package Practika.Practika_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Добавить пользователя");
            System.out.println("2 - Удалить пользователя");
            System.out.println("3 - Обновить пользователя");
            System.out.println("4 - Показать всех пользователей");
            System.out.println("5 - Выйти");
            System.out.print("Введите номер действия: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите email: ");
                    String email = scanner.nextLine();
                    System.out.print("Введите роль: ");
                    String role = scanner.nextLine();
                    userManager.addUser(name, email, role);
                    break;

                case 2:
                    System.out.print("Введите email пользователя для удаления: ");
                    email = scanner.nextLine();
                    userManager.removeUser(email);
                    break;

                case 3:
                    System.out.print("Введите email пользователя для обновления: ");
                    email = scanner.nextLine();
                    System.out.print("Введите новое имя: ");
                    String newName = scanner.nextLine();
                    System.out.print("Введите новую роль: ");
                    String newRole = scanner.nextLine();
                    userManager.updateUser(email, newName, newRole);
                    break;

                case 4:
                    userManager.listUsers();
                    break;

                case 5:
                    running = false;
                    System.out.println("Выход из программы...");
                    break;

                default:
                    System.out.println("Неверный ввод.");
                    break;
            }
        }

        scanner.close();
    }
}

