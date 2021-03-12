package edu.prs.echarts;

import edu.prs.echarts.Mapper.StationInfoMapper;
import edu.prs.echarts.Model.StationInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class EchartsApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    StationInfoMapper mapper;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());
        mapper.selectByPrimaryKey(15);
        System.out.println("a");
    }

}
