package com.lcn;

import com.lovo.lcnone.LcnOneMain;
import com.lovo.lcnone.bean.SysUser;
import com.lovo.lcnone.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LcnOneMain.class)
public class LcnOneT {
    @Autowired
    private SysUserService sysUserService;

    @Test
    public void sava(){
        SysUser user=new SysUser();
        user.setUserName("刘备");
        user.setUName("lb");
        sysUserService.savaUser(user);
    }
}
