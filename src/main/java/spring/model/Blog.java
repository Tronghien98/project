package spring.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
	private int id;
	private String title;
	private int catId;
	private String detail;
	private int userId;
	private String picture;
	private int views;
	private Timestamp createAt;

}
