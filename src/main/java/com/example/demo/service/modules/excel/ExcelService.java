package com.example.demo.service.modules.excel;

import com.example.demo.modules.entity.sys.entity.SysMenu;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ExcelService {

    Boolean exportExcel(HttpServletResponse response, String fileName, Integer pageNum, Integer pageSize);

    Boolean importExcel(String fileName);

    List<SysMenu> find();
}