package com.cms.service;

import com.cms.entity.Competition;

import java.util.List;

/**
 * @author 陈磊
 */
public interface CompetitionService {
    /**
     * 获取当前竞事
     *
     * @param cid：竞赛id
     * @return String：返回竞赛
     */
    public Competition getCompetition(int cid);

    /**
     * 获取当前竞事
     *
     * @return List：返回全部竞赛
     */
    public List<Competition> getAllCompetition();

    /**
     * 添加竞事
     *
     * @param competition：竞赛
     * @return Boolean：返回是否成功，成功返回true，失败返回false
     */
    public boolean addCompetition(Competition competition);

    /**
     * 修改竞事信息
     *
     * @param competition：竞赛
     * @return Boolean：返回是否成功，成功返回true，失败返回false
     */
    public boolean updateCompetition(Competition competition);


}
