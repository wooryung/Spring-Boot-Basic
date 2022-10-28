package iotree.wrsungProject.mapper;

import iotree.wrsungProject.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserVo> getUserList();
}
