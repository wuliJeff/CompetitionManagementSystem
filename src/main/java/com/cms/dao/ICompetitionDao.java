package com.cms.dao;

import com.cms.entity.Competition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 陈磊
 */
public interface ICompetitionDao
{
    /**
     * 获取当前竞赛信息
     *
     * @param cid
     * @return 存在则返回赛事，不存在则返回空
     */
    public Competition getCompetition(@Param("cid") int cid);

    /**
     * 添加竞赛信息
     *
     * @param competition
     * @return 添加成功则返回true，失败则返回false
     */
    public boolean addCompetition(@Param("competition") Competition competition);

    /**
     * 获取所有竞赛信息
     *
     * @return 存在则返回赛事，不存在则返回空
     */
    public List<Competition> getAllCompetition();

    /**
     * 修改竞赛信息
     * @param competition
     * @return 修改成功则返回true，失败则返回false
     */
    public boolean updateCompetition(@Param("competition")Competition competition);
}
