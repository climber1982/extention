package com.test;


import com.lovo.lcntwo.LcnTwoMain;
import com.lovo.lcntwo.bean.SysUser;
import com.lovo.lcntwo.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LcnTwoMain.class)
public class LcnOneT {
    @Autowired
    private SysUserService sysUserService;

    @Test
    public void sava(){
        SysUser user=new SysUser();
        user.setUserName("刘备2");
        user.setUName("lb2");
        sysUserService.savaUser(user);
    }
}
