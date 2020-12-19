package com.crud.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.crud.mvc.models.Emp;

public class EmployeeDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void addEmployee(Emp employee) {
		String sqlQuery = "insert into Employee(ID,name,salary,designation) " + "values("
				+ Integer.valueOf(employee.getId()) + ",'" + employee.getName() + "',"
				+ Integer.valueOf(employee.getSalary()) + ", '" + employee.getDesignation() + "')";
		template.update(sqlQuery);
	}

	public List<Emp> getEmployees() {
		return template.query("select * from Employee", new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e = new Emp();
				e.setId(Integer.toString(rs.getInt(1)));
				e.setName(rs.getString(2));
				e.setSalary(Float.toString(rs.getFloat(3)));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}

	public int delete(int id) {
		String sqlQuery = "delete from Employee where id=" + id + "";
		return template.update(sqlQuery);
	}

	public Emp getEmpById(int id) {
		String sql = "select * from Employee where id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Emp>(Emp.class));
	}

	public int update(Emp employee) {
		String sqlQuery = "update Employee set name='" + employee.getName() + "', salary=" + employee.getSalary()
				+ ",designation='" + employee.getDesignation() + "' where id=" + employee.getId();
		return template.update(sqlQuery);
	}
}
