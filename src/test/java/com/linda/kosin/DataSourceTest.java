package com.linda.kosin;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
		)

//DB ���� �׽�Ʈ
public class DataSourceTest {
	
	@Inject
	private DataSource ds;
	
    // DB����
	@Test
	public void testCon() throws Exception{
		try (Connection con = ds.getConnection()) {
			System.out.println("�������� : "+con);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}