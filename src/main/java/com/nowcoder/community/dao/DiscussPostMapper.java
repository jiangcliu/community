package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    /**
     * //查询讨论帖子
     * @param userId 用户id
     * @param offset 帖子起始页码
     * @param limit  一页帖子数量【分页】
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    //@Param用于给参数取别名
    //如果只有一个参数，并且在<if>里使用，必须要加别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
