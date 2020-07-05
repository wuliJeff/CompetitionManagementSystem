package com.cms.service;

public interface ScheduleService {
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
