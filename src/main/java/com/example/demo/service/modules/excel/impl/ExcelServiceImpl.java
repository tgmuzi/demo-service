package com.example.demo.service.modules.excel.impl;

import com.example.demo.modules.excel.ExcelData;
import com.example.demo.modules.sys.SysMenuMapper;
import com.example.demo.modules.sys.entity.SysMenu;
import com.example.demo.service.modules.excel.ExcelService;
import com.example.demo.utils.ExcelUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ExcelServiceImpl implements ExcelService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public Boolean exportExcel(HttpServletResponse response, String fileName, Integer pageNum, Integer pageSize) {
        log.info("导出数据开始。。。。。。");
        //查询数据并赋值给ExcelData
        List<SysMenu> userList = sysMenuMapper.queryListParentId(true,0L);
        List<String[]> list = new ArrayList<String[]>();
        for (SysMenu sysMenu : userList) {
            String[] arrs = new String[userList.size()];
            arrs[0] = String.valueOf(sysMenu.getMenuId());
            arrs[1] = String.valueOf(sysMenu.getName());
            arrs[2] = String.valueOf(sysMenu.getIcon());
            arrs[3] = String.valueOf(sysMenu.getUrl());
            list.add(arrs);
        }
        //表头赋值
        String[] head = {"序列", "名字", "年龄", "性别"};
        ExcelData data = new ExcelData();
        data.setHead(head);
        data.setData(list);
        data.setFileName(fileName);
        //实现导出
        try {
            ExcelUtil.exportExcel(response, data);
            log.info("导出数据结束。。。。。。");
            return true;
        } catch (Exception e) {
            log.info("导出数据失败。。。。。。");
            return false;
        }
    }

    @Override
    public Boolean importExcel(String fileName) {
        log.info("导入数据开始。。。。。。");
        try {
            List<Object[]> list = ExcelUtil.importExcel(fileName);
            System.out.println(list.toString());
            for (int i = 0; i < list.size(); i++) {
                SysMenu sysMenu = new SysMenu();
                sysMenu.setMenuId(Long.parseLong(list.get(i)[0].toString()));
                sysMenu.setName((String) list.get(i)[1]);
                sysMenu.setCode((String) list.get(i)[2]);
//                userMapper.add(user);
            }
            log.info("导入数据结束。。。。。。");
            return true;
        } catch (Exception e) {
            log.info("导入数据失败。。。。。。");
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<SysMenu> find() {
        return null;
    }
}