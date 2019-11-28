package com.store.dao;

import com.store.bean.FanweVoiceBoxes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FanweVoiceBoxesDao {

    @Select("SELECT * FROM fanwe_voice_boxes")
    List<FanweVoiceBoxes> findAll();

}
