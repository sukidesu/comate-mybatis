package net.ifsoft.comate.dao;

import java.util.List;
import net.ifsoft.comate.model.SysRoleDept;
import net.ifsoft.comate.model.SysRoleDeptExample;
import org.apache.ibatis.annotations.Param;

public interface SysRoleDeptMapper {
    int countByExample(SysRoleDeptExample example);

    int deleteByExample(SysRoleDeptExample example);

    int insert(SysRoleDept record);

    int insertSelective(SysRoleDept record);

    List<SysRoleDept> selectByExample(SysRoleDeptExample example);

    int updateByExampleSelective(@Param("record") SysRoleDept record, @Param("example") SysRoleDeptExample example);

    int updateByExample(@Param("record") SysRoleDept record, @Param("example") SysRoleDeptExample example);
}