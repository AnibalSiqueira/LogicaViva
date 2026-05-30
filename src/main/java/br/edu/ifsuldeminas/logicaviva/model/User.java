package br.edu.ifsuldeminas.logicaviva.model;

public class User {

   //Variables
   private Long userId;
   private String userName;
   private String userEmail;
   private String passwdHash;

   //Enum
   public enum SESSION_ID {
      TEACHER, STUDENT;
   }

   //Constructors
   public User() {} //Default blank constructor

   //Gatters
   public Long getUserId() {return userId;}

   public String getUserName() {return userName;}

   public String getUserEmail() {return userEmail;}

   public String getPasswdHash() {return passwdHash;}

   //Setters
   public void setUserId(Long userId) {this.userId = userId;}

   public void setUserName(String userName) {this.userName = userName;}

   public void setUserEmail(String userEmail) {this.userEmail = userEmail;}

   public void setPasswdHash(String passwdHash) {this.passwdHash = passwdHash;}


   //Checks the passwordHash for auth
   public boolean checkPasswordHash(String passwdHash) {
      if(passwdHash.equals(this.passwdHash)) {
         System.out.printf("Sucessfull Login");
         return true;
      } else {
         System.out.println("Wrongfull login");
         return false;
      }
   }

}