package com.zhangteng.administrationback.dao;

import com.github.pagehelper.Page;
import com.zhangteng.administrationback.po.Administrator;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministratorMapper {
    int deleteByPrimaryKey(Integer administratorId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer administratorId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);

    //custom
    Administrator selectByUsername(String username);

    Administrator selectByEmail(@Param("email") String email);

    void batchDelete(@Param("administratorIds")List<Integer> administratorIds);

    Page<Administrator> selectList();
}