package spring.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import spring.model.Category;

@Repository
public class CategoryDAO extends AbstractDAO<Category> {

	@Override
	public List<Category> getAll() {
		String sql = "SELECT * FROM categories ORDER BY id DESC";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Category.class));
	}

}
