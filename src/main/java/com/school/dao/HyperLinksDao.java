package com.school.dao;

import com.school.entity.HyperLinks;
import java.util.List;
public interface HyperLinksDao {
    int insertHyperLinks(HyperLinks hyperLinks);
    int updateHyperLinks(HyperLinks hyperLinks);
    int deleteHyperLinksByFuncId(Integer function_id);
    HyperLinks findHyperLinksByFuncId(Integer function_id);
    List<HyperLinks> findAllHyperLinks();
}
