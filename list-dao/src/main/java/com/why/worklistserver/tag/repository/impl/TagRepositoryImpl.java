package com.why.worklistserver.tag.repository.impl;

import com.why.worklistserver.pojo.Tag;
import com.why.worklistserver.tag.mapper.TagMapper;
import com.why.worklistserver.tag.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @ClassName：TagRepositoryImpl
 * @Description：todo数据接口实现类
 * @Author: why
 * @DateTime：2022/3/21 14:59
 */
@Repository
public class TagRepositoryImpl implements TagRepository {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public void save(Tag tag) {
        tagMapper.save(tag);
    }

    @Override
    public void deleteByTagId(Integer id) {
        tagMapper.deleteByTagId(id);
    }

    @Override
    public void deleteByTag(String tag) {
        tagMapper.deleteByTag(tag);
    }

    @Override
    public void update(Tag tag) {
        tagMapper.update(tag);
    }

    @Override
    public Tag getByTagId(Integer id) {
        return tagMapper.getByTagId(id);
    }

    @Override
    public Tag getByTag(String tag) {
        return tagMapper.getByTag(tag);
    }
}
