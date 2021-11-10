package com.ljl.kuang.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ClassName:DeptDao
 * Package:com.ljl.kuang.dao
 * Descriptions:
 *
 * @Data$:{DATE} 19:22
 * @Author:ljl
 **/
@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept queryId(int id);

    public List<Dept> queryAll();


}
