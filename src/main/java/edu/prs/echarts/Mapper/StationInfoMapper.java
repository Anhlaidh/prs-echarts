package edu.prs.echarts.Mapper;

import edu.prs.echarts.Model.StationInfo;
import org.springframework.stereotype.Component;

@Component
public interface StationInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StationInfo record);

    int insertSelective(StationInfo record);

    StationInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StationInfo record);

    int updateByPrimaryKeyWithBLOBs(StationInfo record);

    int updateByPrimaryKey(StationInfo record);
}