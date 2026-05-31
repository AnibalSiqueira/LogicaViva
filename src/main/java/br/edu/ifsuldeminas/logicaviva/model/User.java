package br.edu.ifsuldeminas.logicaviva.model;

public class User {

   //Variables
   private Long userId;
   private String userName;
   private String userEmail;
   private String userRole;
   private String passwdHash;

   //Enum
   public enum SESSION_ID {
      TEACHER, STUDENT;
   }

   //Constructors
   public User() {} //Default blank constructor not meant for initialization

   public User(Long id, String name, String email, String role, String passwd) {
      this.userId = id;
      this.userName = name;
      this.userEmail = email;
      this.userRole = role;
      this.passwdHash = passwd;
   }

   //Gatters
   public Long getUserId() {return userId;}

   public String getUserName() {return userName;}

   public String getUserEmail() {return userEmail;}

   public String getPasswdHash() {return passwdHash;}

   public String getUserRole() {return userRole;}

   //Setters
   public void setUserId(Long userId) {this.userId = userId;}

   public void setUserName(String userName) {this.userName = userName;}

   public void setUserEmail(String userEmail) {this.userEmail = userEmail;}

   public void setPasswdHash(String passwdHash) {this.passwdHash = passwdHash;}

   public void setUserRole(String userRole) {this.userRole = userRole;}

   //Checks the passwordHash for auth
   public boolean checkPasswordHash(String passwdHash) {
      if(passwdHash.equals(this.passwdHash)) {
         System.out.println("Successful Login");
         return true;
      } else {
         System.out.println("Wrongful login");
         return false;
      }
   }

}