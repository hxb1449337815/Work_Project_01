package com.fly.service.impl;

import com.fly.mapper.FFlightRecordMapper;
import com.fly.model.FFlightRecord;
import com.fly.service.FFlightRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FFlightRecordServiceImpl implements FFlightRecordService {

    @Autowired
    private FFlightRecordMapper fFlightRecordMapper;

    @Override
    public List<FFlightRecord> query() {
        return fFlightRecordMapper.query();
    }

    @Override
    public FFlightRecord selectByPrimaryKey(int id) {
        return fFlightRecordMapper.selectByPrimaryKey(id);
    }
}
