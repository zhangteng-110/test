package com.zhangteng.administrationback.service;


import com.zhangteng.administrationback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {
    List<ReturnHistory> getListByReturnId(Integer returnId);

    Long create(ReturnHistory returnHistory);
}
