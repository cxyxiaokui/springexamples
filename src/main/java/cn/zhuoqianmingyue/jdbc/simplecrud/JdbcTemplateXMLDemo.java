package cn.zhuoqianmingyue.jdbc.simplecrud;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateXMLDemo {
	private ApplicationContext appliction;
	private JdbcTemplate jdbcTemplate ;
	@Before
	public void init() {
		 appliction = new ClassPathXmlApplicationContext("jdbc-simpleCRUD.xml");
		 jdbcTemplate = (JdbcTemplate)appliction.getBean("jdbcTemplate");
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
