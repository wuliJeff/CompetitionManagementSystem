package com.cms.dao;

import com.cms.entity.Schedule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IScheduleDao {

    /**
     * 根据参赛者ID查询成绩
     *
     * @param competitorId:参赛者成绩
     * @return List<Schedule>当前查询的参赛者的所有竞赛成绩
     */
    public List<Schedule> selectGradeByCompetitorId(@Param("competitorId") String competitorId);

    /**
     * 根据竞赛ID查询成绩
     *
     * @param cid: 某次竞赛所有成绩
     * @return List<Schedule>当前查询的竞赛所有参赛者成绩
     */
    public List<Schedule> selectGradeByCid(@Param("cid") String cid);

    /**
     * 获取一等奖人数
     *
     * @return 人数
     */
    public int selectGradeAByCid(@Param("cid") String cid);

    /**
     * 获取二等奖人数
     *
     * @return 人数
     */
    public int selectGradeBByCid(@Param("cid") String cid);

    /**
     * 获取三等奖人数
     *
     * @return 人数
     */
    public int selectGradeCByCid(@Param("cid") String cid);

    /**
     * 获取未获奖人数
     *
     * @return 人数
     */
    public int selectGradeDByCid(@Param("cid") String cid);

    /**
     * 查询参赛者的座位
     *
     * @param cid
     * @param competitorId
     * @return
     */
    public String findSeat(@Param("cid") String cid, @Param("competitorId") String competitorId);

    /**
     * 发布成绩
     * @param cid
     * @param competitorId
     * @param grade
     * @return
     */
    public int publishGrade(@Param("cid") String cid, @Param("competitorId") String competitorId, @Param("grade") float grade);

    public int insertSchedule(@Param("s") Schedule s);
}
