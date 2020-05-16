package net.ifsoft.comate.service.impl;

import net.ifsoft.comate.dao.SysUserMapper;
import net.ifsoft.comate.model.SysUser;
import net.ifsoft.comate.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll(){
        return sysUserMapper.findAll();
    }
}
