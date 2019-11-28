package com.store.dao;

import com.store.bean.FanweVoiceOrderLogistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FanweVoiceOrderLogisticsDao {

    @Select("SELECT * FROM fanwe_voice_boxes")
    List<FanweVoiceOrderLogistics> findAll();

}
