package cn.jzfw.mybatisplus.dao;

import cn.jzfw.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * The company is 鉴真防务
 * User: 陳佳伟
 * Date: 2021/2/24 2:45 下午
 * Description: 多敲多练
 **/
//@Mapper//表示它是一个mapper或者加一个repository表示它是dao层的
//@Repository//代表持久层
//在对应的Mapper上继承基本的接口BaseMapper
@Mapper
public interface UserMapper extends BaseMapper<User> {
    // 所有的CRUD操作都已经编写完成了
    // 你不需要像以前的配置一大堆文件了!

    public User queryUserByName(String name);
}