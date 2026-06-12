package br.edu.ifsuldeminas.logicaviva.servlet;

import br.edu.ifsuldeminas.logicaviva.model.User;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 *
 * @author Anibal Siqueira
 */
public class AuthService {

    public static boolean authenticate(String email, String password) {
        User user = new User();
        return (email.equals(user.getUserEmail()) &&  BCrypt.checkpw(password, user.getPasswdHash())) ? true : false;
    }

}
