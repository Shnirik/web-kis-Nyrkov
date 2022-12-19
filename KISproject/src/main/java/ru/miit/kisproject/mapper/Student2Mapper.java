package ru.miit.kisproject.mapper;

import java.util.List;
import ru.miit.kisproject.model.Student2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
public interface Student2Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into student2 (ID, `Name`, ",
        "SurName)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{surname,jdbcType=VARCHAR})"
    })
    int insert(Student2 row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "\"ID\", \"Name\", \"SurName\"",
        "from public.student2"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="Name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="SurName", property="surname", jdbcType=JdbcType.VARCHAR)
    })
    List<Student2> selectAll();
}