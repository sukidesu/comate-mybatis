package net.ifsoft.comate.dao;

import java.util.List;
import net.ifsoft.comate.model.SysDept;
import net.ifsoft.comate.model.SysDeptExample;
import org.apache.ibatis.annotations.Param;

public interface SysDeptMapper {
    int countByExample(SysDeptExample example);

    int deleteByExample(SysDeptExample example);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    List<SysDept> selectByExample(SysDeptExample example);

    int updateByExampleSelective(@Param("record") SysDept record, @Param("example") SysDeptExample example);

    int updateByExample(@Param("record") SysDept record, @Param("example") SysDeptExample example);
}