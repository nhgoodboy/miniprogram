package com.example.demo.mapper;

import com.example.demo.domain.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/11 23:18
 **/
@Mapper
public interface StudentMapper {

    @Select("select id, name from student")
    List<Student> findStudentInfo();

    @Insert("insert into student(id, name) value (#{id, jdbcType=INTEGER}, #{name, jdbcType=VARCHAR})")
    int addStudentInfo(Student student);

    @Delete("delete from student where id = #{id, jdbcType=INTEGER}")
    int delStudentInfo(int id);

}
