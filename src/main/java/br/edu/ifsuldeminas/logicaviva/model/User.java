package br.edu.ifsuldeminas.logicaviva.model;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 *
 * @author Anibal Siqueira
 */
public class User {

   //Variables
   private Long userId;
   private String userName;
   private String userEmail;
   private String userRole;
   private String passwdHash;

   private Integer SALT_VALUE = 12;

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
   public boolean checkPasswordHash(String plainText) {
      return BCrypt.checkpw(plainText, passwdHash);
   }

   public String passwdHasher(String inputString) {
      return this.passwdHash = BCrypt.hashpw(inputString, BCrypt.gensalt(SALT_VALUE));
   }

}