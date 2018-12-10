package maven;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yiya.bean.FollowInformation;
import com.yiya.bean.Weekly;
import com.yiya.mapper.WeeklyMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-common.xml")
public class MybatisTest {
	
	@Autowired
	private WeeklyMapper<Weekly> weeklyMapper;
	
	
	@Test
	public void testList(){
		System.out.println(weeklyMapper);
		List<Weekly> ws=weeklyMapper.listFormation();
		for(Weekly w:ws){
		
			List<FollowInformation> fi=w.getInformations();
			for (FollowInformation p : fi){
				System.out.println("\t"+p);
			}
		}
	}
}
