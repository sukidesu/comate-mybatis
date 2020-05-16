package net.ifsoft.comate.dao;

import java.util.List;
import net.ifsoft.comate.model.SysDict;
import net.ifsoft.comate.model.SysDictExample;
import org.apache.ibatis.annotations.Param;

public interface SysDictMapper {
    int countByExample(SysDictExample example);

    int deleteByExample(SysDictExample example);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    List<SysDict> selectByExample(SysDictExample example);

    int updateByExampleSelective(@Param("record") SysDict record, @Param("example") SysDictExample example);

    int updateByExample(@Param("record") SysDict record, @Param("example") SysDictExample example);
}