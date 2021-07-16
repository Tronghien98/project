package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.dao.CategoryDAO;
import spring.model.Category;

@Service
public class CategoryService implements ICRUDService<Category> {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@Override
	public List<Category> getAll() {
		return categoryDAO.getAll();
	}

	@Override
	public int save(Category t) {
		return 0;
	}

	@Override
	public int update(Category t) {
		return 0;
	}

	@Override
	public int del(int id) {
		return 0;
	}

	@Override
	public Category findById(int id) {
		return null;
	}

	@Override
	public List<Category> getList(int offset, int rowCount) {
		return null;
	}

	@Override
	public int totalRow() {
		return 0;
	}

}
