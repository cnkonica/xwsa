package cn.com.xinxin.sass.biz.service.impl;

/*
 *
 * Copyright 2020 www.xinxindigits.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"),to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice
 * shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * Redistribution and selling copies of the software are prohibited, only if the authorization from xinxin digits
 * was obtained.Neither the name of the xinxin digits; nor the names of its contributors may be used to
 * endorse or promote products derived from this software without specific prior written permission.
 *
 */

import cn.com.xinxin.sass.biz.service.OrganizationService;
import cn.com.xinxin.sass.common.model.PageResultVO;
import cn.com.xinxin.sass.repository.dao.OrganizationMapper;
import cn.com.xinxin.sass.repository.model.OrganizationDO;
import cn.com.xinxin.sass.repository.model.UserOrgDO;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dengyunhui on 2018/5/1
 **/
@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public int createOrganization(OrganizationDO organizationDO) {
        return organizationMapper.insertSelective(organizationDO);
    }

    @Override
    public int updateOrganization(OrganizationDO organizationDO) {
        return organizationMapper.updateByCodeSelective(organizationDO);
    }

    @Override
    public OrganizationDO findById(Long id) {
        return organizationMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResultVO<OrganizationDO> findByCondition(PageResultVO page, OrganizationDO condition) {
        com.github.pagehelper.Page page1 = PageHelper.startPage(page.getPageNumber(),page.getPageSize());
        List<OrganizationDO> organizationDOS = organizationMapper.findByCondition(condition);
        PageResultVO<OrganizationDO> result = new PageResultVO<>();
        result.setTotal(page1.getTotal());
        result.setItems(organizationDOS);
        result.setPageSize(page.getPageSize());
        result.setPageNumber(page.getPageNumber());

        return result;
    }

    @Override
    public Boolean deleteById(Long id) {
        int n = organizationMapper.deleteByPrimaryKey(id);
        return n == 1;
    }

    @Override
    public List<OrganizationDO> queryOrgListByTenantId(String tenantId) {

        List<OrganizationDO> organizationDOS = this.organizationMapper.selectAllOrgsByTenantId(tenantId);

        return organizationDOS;
    }

    @Override
    public OrganizationDO findByCode(String code) {
        return organizationMapper.findByCode(code);
    }

    @Override
    public int deleteByCodes(List<String> codes ,String tenantId) {
        return organizationMapper.deleteByCodes(codes,tenantId);
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        return organizationMapper.deleteByIds(ids);
    }

    @Override
    public List<OrganizationDO> findChildren(List<Long> parentIds) {
        return organizationMapper.findChildren(parentIds);
    }

    @Override
    public List<OrganizationDO> findNotRoot(String tenantId) {
        return organizationMapper.findNotRoot(tenantId);
    }

    @Override
    public List<OrganizationDO> queryOrgListByOrgIds(List<Long> orgIds) {

        return organizationMapper.queryOrgListByOrgIds(orgIds);
    }
}
