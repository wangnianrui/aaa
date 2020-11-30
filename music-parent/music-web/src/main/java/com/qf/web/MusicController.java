package com.qf.web;


import com.qf.pojo.Music;
import com.qf.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController = @Controller + @ResponseBody
@RestController
@RequestMapping("music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @RequestMapping("findAll")
    private List<Music> findAll(){
        return musicService.findAll();
    }

}
