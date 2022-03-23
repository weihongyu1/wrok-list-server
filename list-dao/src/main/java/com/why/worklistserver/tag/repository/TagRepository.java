package com.why.worklistserver.tag.repository;

import com.why.worklistserver.pojo.Tag;

/**
 * @InterfaceName：TagRepository
 * @Description：分类标签数据接口
 * @Author: why
 * @Date：2022/3/21
 **/
public interface TagRepository {
    /**
     * 新增分类标签
     * @param tag
     */
    void save(Tag tag);

    /**
     * 根据标签id删除数据
     * @param id
     */
    void deleteByTagId(Integer id);

    /**
     * 根据分类标签删除数据
     * @param tag
     */
    void deleteByTag(String tag);

    /**
     * 更新数据
     * @param tag
     */
    void update(Tag tag);

    /**
     * 根据标签id查询数据
     * @param id
     */
    Tag getByTagId(Integer id);

    /**
     * 根据分类标签查询数据
     * @param tag
     * @return
     */
    Tag getByTag(String tag);
}
