package password_extractor;

import java.io.Serializable;

public final class Password implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String password;

	Password(String password) {
		this.password = password;
	}

	boolean matches() {
		return password.matches(
				"^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[A-Za-z\\d$&+,:;=?@#|'<>.-^*()%!]{8,}$");
	}

}