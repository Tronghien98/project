package spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int id;
	private String username;
	private String fullname;
	private String password;
	private String email;
	private String phone;
	private String avatar;
	private int roleId;
	private int enabled;

}
