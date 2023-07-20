package de.zeroco.springjdbc;

import static org.hamcrest.CoreMatchers.nullValue;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import de.zeroco.jdbc.QueryBuilder;

public class Dao {

	private JdbcTemplate jdbcTemplate;
	public static final String SCHEMA = "zerocode";
	public static final String TABLE_NAME = "customer";
	public static final String CONDITIONAL_COLUMN = "pk_id";
	public static final String CONDITIONAL_OPERATOR = "=";
	public static final String[] COLUMNS = { "name", "contact", "email", "date_of_birth", "age" };

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * This method insert the give data into table
	 * 
	 * @param customer
	 * @return 
	 */
	public int insert(Customer customer) {
		try {
			return jdbcTemplate.update(QueryBuilder.getInsertQuery(SCHEMA, TABLE_NAME, Arrays.asList(COLUMNS)), customer.getName(), customer.getContact(), customer.getEmail(), customer.getDateOfBirth(), customer.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * This method update the give data in the table
	 * 
	 * @param customer
	 * @return
	 */
	public int update(Customer customer) {
		try {
			return jdbcTemplate.update(QueryBuilder.getUpdateQuery(SCHEMA, TABLE_NAME, Arrays.asList(COLUMNS), CONDITIONAL_COLUMN), customer.getName(), customer.getContact(), customer.getEmail(), customer.getDateOfBirth(), customer.getAge(), customer.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * This method delete the data from table
	 * 
	 * @param id
	 * @return
	 */
	public int delete(int id) {
		try {
			return jdbcTemplate.update(QueryBuilder.getDeleteQuery(SCHEMA, TABLE_NAME, CONDITIONAL_COLUMN), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * This method get the data from the table with the help of give data
	 * 
	 * @param id
	 * @return
	 */
	public Map<String, Object> get(int id) {
		try {
			return jdbcTemplate.queryForMap(QueryBuilder.getQuery(SCHEMA, TABLE_NAME, new ArrayList<String>(),CONDITIONAL_COLUMN, CONDITIONAL_OPERATOR), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * This method list the whole data from the table
	 * 
	 * @return
	 */
	public List<Map<String, Object>> List() {
		try {
			return jdbcTemplate.queryForList(QueryBuilder.getListQuery(SCHEMA, TABLE_NAME, new ArrayList<String>()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * This method insert data into table in database and get the generated key
	 * 
	 * @param customer
	 * @return
	 */
	public int getGeneratedKey(final Customer customer) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		try {
			jdbcTemplate.update(connection -> {
				PreparedStatement statement = connection.prepareStatement(QueryBuilder.getInsertQuery(SCHEMA, TABLE_NAME, Arrays.asList(COLUMNS)),Statement.RETURN_GENERATED_KEYS);
				statement.setObject(1, customer.getName());
				statement.setObject(2, customer.getContact());
				statement.setObject(3, customer.getEmail());
				statement.setObject(4, customer.getDateOfBirth());
				statement.setObject(5, customer.getAge());
				return statement;
			}, keyHolder);
			return keyHolder.getKey().intValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
