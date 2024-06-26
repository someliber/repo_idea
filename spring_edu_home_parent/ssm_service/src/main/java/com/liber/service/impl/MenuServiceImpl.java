package com.liber.service.impl;

import com.liber.dao.MenuMapper;
import com.liber.domain.Menu;
import com.liber.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> findSubMenusByPid(int pid) {
        return menuMapper.findSubMenusByPid(pid);
    }

    @Override
    public List<Menu> findAllMenu() {
        return  menuMapper.findAllMenu();
    }

    @Override
    public Menu findMenuById(Integer id) {
        return menuMapper.findMenuById(id);
    }
}
