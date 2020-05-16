package net.ifsoft.comate.dao;

import java.util.List;
import net.ifsoft.comate.model.SysLoginLog;
import net.ifsoft.comate.model.SysLoginLogExample;
import org.apache.ibatis.annotations.Param;

public interface SysLoginLogMapper {
    int countByExample(SysLoginLogExample example);

    int deleteByExample(SysLoginLogExample example);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    List<SysLoginLog> selectByExample(SysLoginLogExample example);

    int updateByExampleSelective(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);

    int updateByExample(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);
}