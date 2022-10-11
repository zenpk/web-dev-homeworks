package org.my.basic.controller;

import org.my.basic.model.DormInfo;
import org.my.basic.repository.DormInfoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/") // This means URL's start with /
public class DormInfoController {
    private final DormInfoRepository dormInfoRepository;

    public DormInfoController(DormInfoRepository dormInfoRepository) {
        this.dormInfoRepository = dormInfoRepository;
    }

    @GetMapping("/show") // 显示数据库中 dorm_infos 表的所有数据
    public @ResponseBody Iterable<DormInfo> getAllDormInfos() {
        // This returns a JSON of DormInfos
        return dormInfoRepository.findAll();
    }

    @PostMapping("/new") // 插入一条新数据
    public DormInfo newDormInfo(@RequestBody DormInfo newDormInfo) {
        return dormInfoRepository.save(newDormInfo);
    }
}