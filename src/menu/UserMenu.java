package menu;

import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMenu {
    private List<User> users;
    private Scanner  scanner;

 public UserMenu() {
     this.users = new ArrayList<>();
     this.scanner = new Scanner(System.in);
 }

 public void createUser() {
     System.out.println("=== Criar nova conta ===");

     System.out.println("Digite seu nome: ");
     String name = scanner.nextLine();

     System.out.println("Digite seu email: ");
     String email = scanner.nextLine();

     User newUser = new User(name, email);

     if (users.contains(newUser)) {
         System.out.println("Erro: já existe um usuário com esse email!");
         return;
     }

     users.add(newUser);
     System.out.println("Conta criada com sucesso!");
 }

}
