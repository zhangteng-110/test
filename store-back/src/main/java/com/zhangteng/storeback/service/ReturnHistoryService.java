package com.zhangteng.storeback.service;


import com.zhangteng.storeback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {
    List<ReturnHistory> getByReturnId(Integer returnId);

}
