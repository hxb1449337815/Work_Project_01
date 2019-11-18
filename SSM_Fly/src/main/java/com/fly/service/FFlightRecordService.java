package com.fly.service;

import com.fly.model.FFlightRecord;

import java.util.List;

public interface FFlightRecordService {

    List<FFlightRecord> query();

    FFlightRecord selectByPrimaryKey(int id);

}
