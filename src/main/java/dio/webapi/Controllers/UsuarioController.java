package dio.webapi.Controllers;

public class UsuarioController {
      private Integer id;
      private String login;
      private String password;
      public UsuarioController() {}
      public UsuarioController(String login, String password) {
          this.login = login;
          this.password = password;
      }

      
      @Override
      public String toString() {
          return "User{" +
                  "login='" + login + '\'' +
                  ", password='" + password + '\'' +
                  '}';
      }
      
     
  
}
