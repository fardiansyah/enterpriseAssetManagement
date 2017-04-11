package com.jtj.web.service;

import com.jtj.web.common.AssetException;
import com.jtj.web.common.PageDto;
import com.jtj.web.common.ResultDto;
import com.jtj.web.dto.RoleDto;
import com.jtj.web.dto.UserDto;
import com.jtj.web.entity.KeyValue;
import com.jtj.web.entity.Role;
import com.jtj.web.entity.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2016/12/23 23:26 End.
 */
@Service
public interface RoleService {

    ResultDto<Object> add(Role role);

    ResultDto<Object> delete(Long[] ids) throws AssetException;

    ResultDto<Object> update(Role role);

    ResultDto<PageDto<Role>> getList(RoleDto roleDto);

    ResultDto<Object> getRoleById(long id);

    ResultDto<List<KeyValue>> getRoleMap();
}