package cn.zhuoqianmingyue.jdbc.simplecrud;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTemplateDemo {
	
	private DriverManagerDataSource datasource;
	private JdbcTemplate jdbcTemplate ;
	
	@Before
	public void initDataSource() {
		datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/springlearn");
		datasource.setUsername("root");
		datasource.setPassword("root");
		initJdbcTemplate(datasource);
	}
	
	public void initJdbcTemplate(DriverManagerDataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	@Test
	public void select() {
		
		
		jdbcTemplate.execute("select * from user");
		/*template.query("select * from user",new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				 System.out.print("====id:" + rs.getInt("id"));  
			     System.out.println(",name:" + rs.getString("name"));  
			}});*/
		jdbcTemplate.query("select * from user",(resultSet)->{
			 System.out.print("id:" + resultSet.getInt("id"));  
		     System.out.println(",name:" + resultSet.getString("name"));
		});
	}
	@Test
	public void add() {
		int update = jdbcTemplate.update("insert into user(name,age) values('zqmy3',34)");
	}
	@Test
	public void update() {
		jdbcTemplate.update("update user set age= 67 where name=?", new Object[]{"zqmy3"});
	}
	@Test
	public void delete() {
		jdbcTemplate.update("delete from user where name=?", new Object[]{"zqmy3"});  
	}
	
	
}
