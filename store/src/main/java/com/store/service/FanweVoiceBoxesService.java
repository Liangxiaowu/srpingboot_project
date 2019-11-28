package com.store.service;

import com.store.bean.FanweVoiceBoxes;
import com.store.dao.FanweVoiceBoxesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FanweVoiceBoxesService {
    @Autowired
    private FanweVoiceBoxesDao fanweVoiceBoxesDao;

    public List<FanweVoiceBoxes> selectAll(){
        return fanweVoiceBoxesDao.findAll();
    }
}
