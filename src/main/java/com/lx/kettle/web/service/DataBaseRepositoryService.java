package com.lx.kettle.web.service;

import com.lx.kettle.core.dto.BootTablePage;
import com.lx.kettle.core.dto.kettle.RepositoryTree;
import com.lx.kettle.core.model.KRepository;

import java.util.List;

/***
 * create by chenjiang on 2019/10/26 0026
 */
public interface DataBaseRepositoryService {
    BootTablePage getList(Integer offset, Integer limit, Integer integer);

    Object getRepositoryTypeList();

    Object getAccess();

    boolean ckeck(KRepository kRepository);

    void insert(KRepository repositorys);

    Object getKRepositoryById(Integer repositoryId);

    void delete(Integer repositoryId);

    Object getListByUid(Integer integer);

    List<RepositoryTree> getTreeList(Integer repositoryId) throws Exception;
}
