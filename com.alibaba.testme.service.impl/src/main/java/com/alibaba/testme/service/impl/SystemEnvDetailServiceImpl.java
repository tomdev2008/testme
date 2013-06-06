package com.alibaba.testme.service.impl;

import java.util.List;

import com.alibaba.testme.common.ibatispage.Page;
import com.alibaba.testme.dao.SystemEnvDetailDao;
import com.alibaba.testme.domain.dataobject.SystemEnvDetailDO;
import com.alibaba.testme.domain.query.SystemConfigQuery;
import com.alibaba.testme.domain.vo.SystemConfigVO;
import com.alibaba.testme.service.SystemEnvDetailService;

/**
 * SystemEnvDetail Service Implement
 * 
 * @author xiaopenzi
 */
public class SystemEnvDetailServiceImpl implements SystemEnvDetailService {

    private SystemEnvDetailDao systemEnvDetailDao;

    public void setSystemEnvDetailDao(SystemEnvDetailDao systemEnvDetailDao) {
        this.systemEnvDetailDao = systemEnvDetailDao;
    }

    /**
     * @param systemEnvDetailDO
     * @return
     */
    @Override
    public Long addSystemEnvDetailDO(SystemEnvDetailDO systemEnvDetailDO) {
        if (systemEnvDetailDO == null) {
            return null;
        }
        return systemEnvDetailDao.addSystemEnvDetailDO(systemEnvDetailDO);
    }

    /**
     * @param systemEnvDetailDO
     * @return
     */
    @Override
    public int updateSystemEnvDetailDO(SystemEnvDetailDO systemEnvDetailDO) {
        if (systemEnvDetailDO == null) {
            return 0;
        }
        return systemEnvDetailDao.updateSystemEnvDetailDO(systemEnvDetailDO);

    }

    /**
     * @param id
     * @return
     */
    @Override
    public int deleteSystemEnvDetailDO(Long id) {
        if (id == null || id == 0L) {
            return 0;
        }
        return systemEnvDetailDao.deleteSystemEnvDetailDO(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public SystemEnvDetailDO findById(Long id) {
        if (id == null || id == 0L) {
            return null;
        }
        return systemEnvDetailDao.findById(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public List<SystemEnvDetailDO> findList(SystemEnvDetailDO systemEnvDetailDO) {
        return systemEnvDetailDao.findList(systemEnvDetailDO);
    }

    @Override
    public Page<SystemConfigVO> queryPage(Integer index, Integer sizePerPage,
                                          SystemConfigQuery systemConfigQuery) {
        if (index == 0 || sizePerPage == 0 || systemConfigQuery == null) {
            return null;
        }
        return systemEnvDetailDao.queryPage(index, sizePerPage, systemConfigQuery);
    }

    @Override
    public int delSystemEnvDetailDOByIds(List<Long> idList) {
        return 0;
    }

    @Override
    public int deleteByEnvId(Long systemEnvId) {
        if (systemEnvId == null || systemEnvId <= 0L) {
            return 0;
        }
        return systemEnvDetailDao.deleteByEnvId(systemEnvId);
    }

}
