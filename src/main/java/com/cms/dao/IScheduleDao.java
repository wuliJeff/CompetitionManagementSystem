package com.cms.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IScheduleDao {
    /**
     * 根据参赛者ID查询成绩
     * @param competitorId:参赛者成绩
     * @return List<Float>当前查询的用户的所有竞赛成绩
     */
    public List<Float> selectGradeById(@Param("competitorId") int competitorId);

    /**
     * 获取一等奖人数
     * @return 人数
     */
    public int selectGradeA();

    /**
     * 获取二等奖人数
     * @return 人数
     */
    public int selectGradeB();

    /**
     * 获取三等奖人数
     * @return 人数
     */
    public int selectGradeC();

    /**
     * 获取未获奖人数
     * @return 人数
     */
    public int selectGradeD();
}
