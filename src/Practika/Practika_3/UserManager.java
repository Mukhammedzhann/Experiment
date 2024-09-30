package Practika.Practika_3;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public void addUser(String name, String email, String role) {
        if (findUserByEmail(email) == null) {
            users.add(new User(name, email, role));
            System.out.println("Пользователь добавлен: " + email);
        } else {
            System.out.println("Пользователь с таким email уже существует.");
        }
    }

    public void removeUser(String email) {
        User user = findUserByEmail(email);
        if (user != null) {
            users.remove(user);
            System.out.println("Пользователь удален: " + email);
        } else {
            System.out.println("Пользователь с таким email не найден.");
        }
    }

    public void updateUser(String email, String newName, String newRole) {
        User user = findUserByEmail(email);
        if (user != null) {
            user.updateUser(newName, newRole);
            System.out.println("Пользователь обновлен: " + email);
        } else {
            System.out.println("Пользователь с таким email не найден.");
        }
    }


    private User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public void listUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}

