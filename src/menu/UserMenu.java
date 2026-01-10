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

 public User loginUser() {
     System.out.println("=== Login ===");

     System.out.println("Digite seu email: ");
     var email = scanner.nextLine().toLowerCase();

     User tempUser = new User("", email);

     if (users.contains(tempUser)) {
         int index = users.indexOf(tempUser);
         User loggedUser = users.get(index);
         System.out.println("Login realizado com sucesso! Bem-vindo(a) " + loggedUser);
         return loggedUser;
     } else {
         System.out.println("Erro: email não encontrado. Tente novamente.");
         return null;
     }
 }

    public void showMenu() {
     while (true) {
         System.out.println("=== MiniSpotify ===");
         System.out.println("1. Criar conta");
         System.out.println("2. Login");
         System.out.println("3. Sair");
         System.out.println("Escolha uma opção: ");

         String choice = scanner.nextLine();

         switch (choice) {
             case "1":
                 createUser();
                 break;
             case "2":
                 User loggedUser = loginUser();
                 if (loggedUser != null) {
                     System.out.println("Você está logado como: " + loggedUser.getName());
                 }
                 break;
             case "3":
                 System.out.println("Saindo.... Até logo!");
                 return;
             default:
                 System.out.println("Opção inválida! Tente novamente.");
         }
     }

    }
}
