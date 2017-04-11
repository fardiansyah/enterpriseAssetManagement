package com.jtj.web.dao;

import com.jtj.web.dto.RoleDto;
import com.jtj.web.entity.KeyValue;
import com.jtj.web.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by MrTT (jiang.taojie@foxmail.com)
 * 2017/3/15.
 */
@Mapper
public interface RoleDao {

    int add(Role role);

    int delete(Long[] ids);

    int update(Role role);

    List<Role> getList(RoleDto roleDto);

    int getNum(RoleDto roleDto);

    //Role getRoleById(long id);

    List<KeyValue> getRoleMap();

}